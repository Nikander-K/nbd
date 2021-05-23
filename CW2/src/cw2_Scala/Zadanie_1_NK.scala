package cw2_Scala

object Zadanie_1_NK extends App {

  val dni_tygodnia = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

  def pCzyW(dzien: String): String = dzien match {

    case dni_robocze if dni_tygodnia.slice(0, 5).contains(dni_robocze) => "Praca"
    case dni_wolne if dni_tygodnia.slice(5, dni_tygodnia.length).contains(dni_wolne) => "Weekend"
    case _ => "Nie ma takiego dnia"

  }

  val myListTrue = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
  val myListFalse = List("Szynka", "Kuźnia", "Woda", "Baleron")
  val myListMixed = List("Poniedziałek", "Wtorek", "Woda", "Baleron")

  for (word <- myListTrue) printf("Słowo: " + word + " | Ocena: " + pCzyW(word) + "\n")
  println("------")
  for (word <- myListFalse) printf("Słowo: " + word + " | Ocena: " + pCzyW(word) + "\n")
  println("------")
  for (word <- myListMixed) printf("Słowo: " + word + " | Ocena: " + pCzyW(word) + "\n")
  println("------")


}
