/*
9.	Zdefiniuj funkcję, przyjmującą listę liczb całkowitych i zwracającą wygenerowaną na jej podstawie listę,
    w której wszystkie liczby zostały zwiększone o 1.
    Wykorzystaj mechanizm mapowania kolekcji.
 */

package cw1_Scala

object Zadanie_9_NK extends App {

  def add1(myList:List[Int]) :List[Int]={
    myList.map(_+1)
  }

  val num_list = List(0,1,10,100,0,23,12,0)
  println(add1(num_list))
}
