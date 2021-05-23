/*
3.	Zdefiniuj klasę Osoba z własnościami imie i nazwisko.
    Stwórz kilka instancji tej klasy.
    Zdefiniuj funkcję, która przyjmuje obiekt klasy osoba i przy pomocy Pattern Matching wybiera i zwraca napis zawierający przywitanie danej osoby.
    Zdefiniuj 2-3 różne przywitania dla konkretnych osób (z określonym imionami lub nazwiskami) oraz jedno domyślne.
 */
package cw2_Scala

case class Osoba(val imie: String, val nazwisko: String) {
  def this(){
    this(imie = "", nazwisko = "")
  }

}


object Zadanie_3_NK extends App {
// isntancje klasy Osoba
  val os1 = new Osoba("Jan","Kowalski")
  val os2 = new Osoba("Patryk", "Vega")
  val os3 = new Osoba("Magda","")
  val os4 = new Osoba("","Szewczyk")
  val os5 = new Osoba()

  // Funckja witająca
  def witaj(os:Osoba): String = os match {
    case os if os.imie == "" && os.nazwisko == "" => "Witaj nieznajomy!\n"
    case os if os.imie != "" && os.nazwisko != "" => "Witaj " + os.imie +" "+ os.nazwisko + "!\n"
    case os if os.imie == "" && os.nazwisko != "" => "Witaj " + os.nazwisko + "!\n"
    case os if os.imie != "" && os.nazwisko == "" => "Witaj " + os.imie + "!\n"
  }

// Przykłady
  println(witaj(os1))
  println(witaj(os2))
  println(witaj(os3))
  println(witaj(os4))
  println(witaj(os5))
}
