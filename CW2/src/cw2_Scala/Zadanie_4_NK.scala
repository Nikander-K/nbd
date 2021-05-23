/*
4.	Zdefiniuj funkcję przyjmującą dwa parametry - wartość całkowitą i funkcję operującą na wartości całkowitej.
    Zastosuj przekazaną jako parametr funkcję trzykrotnie do wartości całkowitej i zwróć wynik.
 */
package cw2_Scala

object Zadanie_4_NK extends App {
  def tripleFunction(funkcja: (Int) => Int, x:Int): Int = {
    val start = funkcja(x)
    val inter = funkcja(start)
    val end = funkcja(inter)
    end
  }

  def add1(x: Int ) = x + 1
  def multBy5(x: Int) = x * 5

  println(tripleFunction(add1, 0))
  println(tripleFunction(multBy5, 1))

}
