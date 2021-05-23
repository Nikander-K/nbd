/*
8.	Napisz funkcję usuwającą zera z listy wartości całkowitych
    (tzn. zwracającą listę elementów mających wartości różne od 0).
    Wykorzystaj rekurencję.

*/
package cw1_Scala

object Zadanie_8_NK extends App {

  def removeZ(list: List[Int], n: Int): List[Int] = list match {
    case Nil => Nil
    case h :: t =>
      if (h == n)
        removeZ(t, n)
      else
        h :: removeZ(t, n)
  }
  val num_list = List(0,1,10,100,0,23,12,0)

  println(removeZ(num_list,0))
}

