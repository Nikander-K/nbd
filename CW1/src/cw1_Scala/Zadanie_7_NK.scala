/*
7.	Zaprezentuj działanie Option na dowolnym przykładzie
    (np. mapy, w której wyszukujemy wartości po kluczu)

*/
package cw1_Scala

object Zadanie_7_NK extends App {

  val produkty = Map("Jajka L" -> 4.5,"Makrela" -> 10.00, "Jogurt" -> 3.50, "Ser Feta" -> 5.50)
  val option1 = produkty.get("Jogurt")
  val option2 = produkty.get("Ananas")

  println(option1.getOrElse("Produkt niedostepny."))
  println(option2.getOrElse("Produkt niedostepny."))
}

