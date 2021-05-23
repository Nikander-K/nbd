/*
2.	Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
    b.	Funkcji rekurencyjnej wypisując elementy listy od końca
*/

package cw1_Scala

object Zadanie_2b_NK extends App {

  val dni_tygodnia: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

  def recFuncReversed(myList:List[String], symbol:String) : String={
    var out_str = ""
    if (myList.isEmpty){
      ""
    } else {
      recFuncReversed(myList.tail,symbol) + symbol + myList.head
    }

  }

  println( recFuncReversed(dni_tygodnia,",").replaceFirst(","," "))

}
