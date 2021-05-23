// 2.	Łączną ilość środków pozostałych na kartach kredytowych osób w bazie, w podziale na waluty; 
db = db.getSiblingDB("nbd");
printjson(db.getCollection("people").aggregate([
   {$unwind: "$credit"},
   {$group:{
       _id:"$credit.currency",
       sum_balance:{$sum: {$toDouble: "$credit.balance"}},
           }
   }
]).toArray());
