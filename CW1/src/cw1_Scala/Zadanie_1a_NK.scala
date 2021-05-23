/*
1.	Stwórz 7 elementową listę zawierającą nazwy dni tygodnia.
    Napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
    a.	Pętli for
* */

package cw1_Scala

object Zadanie_1a_NK extends App {

  val dni_tygodnia: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

  def concatMulti( myList:List[String], symbol:String) : String={
    var out_str = ""
    for ((line, i) <- myList.zipWithIndex) {
      if ( i < dni_tygodnia.length - 1){
        out_str = out_str.concat(line).concat(symbol)

      } else {
        out_str = out_str.concat(line)
      }
    }
    out_str
  }

  var result = concatMulti(dni_tygodnia,",")
  println(result)

}
