//5.	Lista imion i nazwisk wszystkich osób znajdujących się w bazie oraz miast,
//      w których mieszkają, ale tylko dla osób urodzonych w XXI wieku; 

db = db.getSiblingDB("nbd");

printjson(db.people.find(
    {birth_date:{$gte:"2001-01-01"}}, 
    {first_name:1,last_name:1, 'location.city': 1, _id:0}
).toArray());
