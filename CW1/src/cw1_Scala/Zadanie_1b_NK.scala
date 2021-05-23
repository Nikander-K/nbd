/*
1.	Stwórz 7 elementową listę zawierającą nazwy dni tygodnia.
    Napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
    b.	Pętli for wypisując tylko dni z nazwami zaczynającymi się na „P”
* */

package cw1_Scala

object Zadanie_1b_NK extends App {

  val dni_tygodnia: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

  def concatMulti( myList:List[String], symbol:String) : String={
    var out_str = ""
    for (line<- myList) {
      if (line.toLowerCase().startsWith("p")) {
        out_str = out_str.concat(symbol).concat(line)
      }
    }
    out_str = out_str.replaceFirst(",","")
    out_str
  }

  var result = concatMulti(dni_tygodnia,",")
  println(result)

}