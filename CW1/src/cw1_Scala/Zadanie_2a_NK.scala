/*
2.	Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
    a.	Funkcji rekurencyjnej
*/

package cw1_Scala

object Zadanie_2a_NK extends App {

  val dni_tygodnia: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

  def recFunc(myList:List[String], symbol:String) : String={
    var out_str = ""
    if (myList.isEmpty){
      ""
    } else {
      myList.head + symbol + recFunc(myList.tail,symbol)
    }

  }

  println( recFunc(dni_tygodnia,",").dropRight(1))

}
