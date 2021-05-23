/*
3.	Stwórz funkcję korzystającą z rekurencji ogonowej do zwrócenia oddzielonego przecinkami stringa zawierającego elementy listy z ćwiczenia 1
*/

package cw1_Scala

import scala.annotation.tailrec

object Zadanie_3_NK extends App {

  val dni_tygodnia: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

  def finalTail(myList:List[String],symbol:String) :String = {

  @tailrec def interTail(accumulated_sting:String,pozycja:Int ) : String ={
      if (pozycja == myList.length)
        accumulated_sting
      else{
        if (pozycja < myList.length - 1)
          interTail(accumulated_sting + myList(pozycja) + symbol, pozycja + 1)
        else
          interTail(accumulated_sting + myList(pozycja) , pozycja + 1)
      }

    }
    interTail("",0)
  }

  println(finalTail(dni_tygodnia,","))

}
