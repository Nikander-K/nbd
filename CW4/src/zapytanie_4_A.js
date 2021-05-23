// 4.	Średnie, minimalne i maksymalne BMI (waga/wzrost^2) dla osób w bazie, w podziale na narodowości; 
db = db.getSiblingDB("nbd");
printjson(db.getCollection("people").aggregate([
   {$group:{
       _id:"$nationality",
       bmi_min:{$min:{$divide:[{$toDouble:"$weight"},{$pow:[{$divide:[{$toDouble:"$height"},100] } ,2]}]}},
       bmi_avg:{$avg:{$divide:[{$toDouble:"$weight"},{$pow:[{$divide:[{$toDouble:"$height"},100] } ,2]}]}},
       max_bmi:{$max:{$divide:[{$toDouble:"$weight"},{$pow:[{$divide:[{$toDouble:"$height"},100] } ,2]}]}}
           }
   }
]).toArray());
