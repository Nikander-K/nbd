// 5.	Średnia i łączna ilość środków na kartach kredytowych kobiet narodowości polskiej w podziale na waluty. 
db = db.getSiblingDB("nbd");
printjson(db.getCollection("people").aggregate([
   {$unwind: "$credit"},
   {$match: {sex:"Female", nationality:"Poland"}},
   {$group: {
       _id:"$credit.currency",
       sum_balance:{$sum: {$toDouble: "$credit.balance"}},
       avg_balance:{$avg: {$toDouble: "$credit.balance"}},
            }
   }
]).toArray());
