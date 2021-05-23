/*
2.	Zdefiniuj klasę KontoBankowe z metodami wplata i wyplata oraz własnością stanKonta - własność ma być tylko do odczytu.
    Klasa powinna udostępniać konstruktor przyjmujący początkowy stan konta oraz drugi, ustawiający początkowy stan konta na 0.
 */

package cw2_Scala

class KontoBankowe(poczatkowyStanKonta: Double) {

  def this(){
    this(poczatkowyStanKonta = 0)
  }

  private var stanKonta = poczatkowyStanKonta;

  def odczytStanuKonta(): Double = {
    stanKonta
  }

  def wplataNaKonto(wplata:Double): Unit = {
    stanKonta = stanKonta + wplata
    println("Na rachunek wplacono: " + wplata + ". Obecny stan konta wynosi: " + stanKonta + "\n" )
  }

  def wyplataZKonta(wyplata:Double): Unit = {
    stanKonta = stanKonta - wyplata
    println("Z rachunku wypłacono: " + wyplata + ". Obecny stan konta wynosi: " + stanKonta + "\n" )
  }

}

object Zadanie_2_NK extends App {
  val moje_konto = new KontoBankowe()
  println("Stan konta wynosi: " + moje_konto.odczytStanuKonta() + "\n")
  moje_konto.wplataNaKonto(70000)
  moje_konto.wyplataZKonta(20000)

  val konto_sasina = new KontoBankowe(70000000)
  println("Stan konta wynosi: " + konto_sasina.odczytStanuKonta() + "\n")
  konto_sasina.wyplataZKonta(70000000)

}

