//8.	 Zastąp nazwę miasta „Moscow” przez „Moskwa” u wszystkich osób w bazie; 

db = db.getSiblingDB("nbd");

printjson(db.people.updateMany(
    {'location.city': "Moscow"},
    {$set: {'location.city': "Moskwa"}}
));
