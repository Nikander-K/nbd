//10.	Usuń u wszystkich osób o zawodzie „Editor” własność „email”. 

db = db.getSiblingDB("nbd");

printjson(db.people.updateMany(
    {'job': "Editor"},
    {$unset: {'email': 1}}
));
