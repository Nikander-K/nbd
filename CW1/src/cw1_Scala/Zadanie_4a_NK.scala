/*
4.	Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
    a.	Metody foldl

*/

package cw1_Scala

object Zadanie_4a_NK extends App {

  val dni_tygodnia: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
  def left_folding(myList:List[String], symbol:String): String ={
    val folded_list = myList.foldLeft("")( _ + symbol + _ ).replaceFirst(",","")
    folded_list
  }

  println(left_folding(dni_tygodnia,","))

}
