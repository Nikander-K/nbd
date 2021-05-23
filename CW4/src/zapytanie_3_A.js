// 3.	Listę unikalnych zawodów; 
db = db.getSiblingDB("nbd");
printjson(db.getCollection("people").aggregate([
   {$group:{
       _id:"$job",
       job:{$addToSet: "$job"}
           }
   }
]).toArray());
