//9.	Dodaj do wszystkich osób o imieniu Antonio własność „hobby” o wartości „pingpong”; 

db = db.getSiblingDB("nbd");

printjson(db.people.updateMany(
    {'first_name': "Antonio"},
    {$set: {'hobby': "ping-pong"}}
));
