/*
4.	Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
    b.	Metody foldr

*/

package cw1_Scala

object Zadanie_4b_NK extends App {

  val dni_tygodnia: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
  def right_folding(myList:List[String], symbol:String): String ={
    val folded_list = myList.foldRight("")( _ + symbol +_ ).dropRight(1)
    folded_list
  }

  println(right_folding(dni_tygodnia,","))

}