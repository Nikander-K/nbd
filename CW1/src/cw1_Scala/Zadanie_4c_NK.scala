/*
4.	Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
    c.	Metody foldl wypisując tylko dni z nazwami zaczynającymi się na „P”

*/

package cw1_Scala

object Zadanie_4c_NK extends App {

  val dni_tygodnia: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
  def left_folding(myList:List[String], symbol:String): String ={
    val folded_list = myList.foldLeft("")((accumulated_sting,word) => {
      if (word.toLowerCase.startsWith("p"))
        accumulated_sting + symbol + word
      else
        accumulated_sting
    }).replaceFirst(",","")

    folded_list
  }

  println(left_folding(dni_tygodnia,","))

}
