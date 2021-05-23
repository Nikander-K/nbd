//7.	Usuń z bazy osoby o wzroście przekraczającym 190; 

db = db.getSiblingDB("nbd");

printjson(db.people.remove(
    {"height":{$gt:"190"}}
));
