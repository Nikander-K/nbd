/*
10.	Stwórz funkcję przyjmującą listę liczb rzeczywistych i zwracającą stworzoną na jej podstawie listę
    zawierającą wartości bezwzględne elementów z oryginalnej listy należących do przedziału <-5,12>.
    Wykorzystaj filtrowanie.
 */

package cw1_Scala

object Zadanie_10_NK extends App {
  def betweenAbs (myList:List[Double]): List[Double] ={
    val filterdedList = myList.filter(x=>(x >= (-5) && x <= 12))
    val absList = filterdedList.map(_.abs)
    absList
  }
  val num_list = List(-20.1,-10.5,-7.0,-5.0,-2.0,-1.0,0.0,1.0,2.0,4.5,5,8,12,12.1,16)
  println(betweenAbs(num_list))
}

