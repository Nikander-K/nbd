//6.	Dodaj siebie do bazy,
//      zgodnie z formatem danych użytych dla innych osób
//      (dane dotyczące karty kredytowej, adresu zamieszkania i wagi mogą być fikcyjne); 

db = db.getSiblingDB("nbd");

printjson(db.people.insert({
    sex : "Male",
    first_name : "Nikander",
    last_name : "Kulikow",
    job : "Data Scientist Specialist",
    email : "s22358@pjwstk.edu.pl",
    location: {
        city : "Warsaw",
        address: {
            streetname : "Zajecza",
            streetnumber : "4"
            },
        },
    description: "",
    height: "185",
    weight:"73",
    birth_date:"1994-02-21T00:00:00Z",
    nationality:"Poland",
    credit: [
        {
            type : "jcb",
            number : "12345678910",
            currency : "PLN",
            balance : "70000000",
            },
        ]
    }));
