# Import, instancja klasy riak, wybór bucketa oraz stworzenie danych wejsciowych
#----------------PROGRAM NIE KOMPATYBILNY Z WERSJAMI PYTHONA > 3.6--------------
import riak
client = riak.RiakClient()
bucket = client.bucket('s22358')
data = {"imie":"Akali","pozycja":"mid","data_wydania":2010,"koszt":3150}

# -----------------------------Dodanie do bazy-----------------------------------
hero = bucket.new('Akali', data=data)
hero.store()

#  ----------------------------Pobranie z bazy-----------------------------------
hero = bucket.get('Akali')

# ----------------------------Select (wypisanie)---------------------------------
print(f"Dane nowo dodanej postaci: {str(hero.data)}")

#  ----------------------------Modyfikacja danych--------------------------------
print("Zamiana ceny postaci")
hero.data['koszt'] = 1890
hero.store()

#  ----------------------------Pobranie z bazy-----------------------------------
hero = bucket.get('Akali')

# ----------------------------Select (wypisanie) danych po zmianie---------------
print(f"Dane bohatera po zmianie:{str(hero.data)}" )

# ----------------------------Usunięcie danych-----------------------------------
hero.delete()

# ----------------------------Pobranie danych po usunięciu-----------------------
hero = bucket.get('Filemon')

# ----------------------------Select (wypisanie) danych po usunięciu-------------
print(f"Pobranie po usunięciu: {str(hero.data)}")
