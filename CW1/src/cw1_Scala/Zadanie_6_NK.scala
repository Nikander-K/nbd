/*
6.	Zdefiniuj funkcję przyjmującą krotkę z 3 wartościami różnych typów i wypisującą je

*/

package cw1_Scala

object Zadanie_6_NK extends App {

def krotka(krotka:(String,Double,Int)): Any ={
  print(krotka._1,krotka._2,krotka._3)
}
krotka(Tuple3("Kawa",4.20,21))
}
