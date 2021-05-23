/*
5.	Stwórz mapę z nazwami produktów i cenami.
    Na jej podstawie wygeneruj drugą, z 10% obniżką cen.
    Wykorzystaj mechanizm mapowania kolekcji.

*/

package cw1_Scala

object Zadanie_5_NK extends App {

  val produkty = Map("Jajka L" -> 4.5,"Makrela" -> 10.00, "Jogurt" -> 3.50, "Ser Feta" -> 5.50)
  val promocja = produkty.view.mapValues(_ * 0.9)
  for ((k,v)<- promocja) printf("Produkt:%s; Cena:%s\n",k,v)

}
