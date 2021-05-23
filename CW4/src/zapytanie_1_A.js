// 1.	Średnią wagę i wzrost osób w bazie z podziałem na płeć (tzn. osobno mężczyzn, osobno kobiet); 
db = db.getSiblingDB("nbd");
printjson(db.getCollection("people").aggregate([
   {$group:{
       _id:"$sex",
       avg_height:{$avg: {$toDouble: "$height"}},
       avg_weight:{$avg: {$toDouble: "$weight"}}
           }
   }
]).toArray());
