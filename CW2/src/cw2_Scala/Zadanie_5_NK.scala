/*
5.	Zdefiniuj klasę Osoba i trzy traity: Student, Nauczyciel, Pracownik.
    Osoba powinna mieć własności read only: imie, nazwisko, podatek.
    Pracownik powinien mieć własność pensja (z getterem i seterem).
    Student i Pracownik powinni przesłaniać własność podatek – dla Studenta zwracamy 0, dla Pracownika 20% pensji.
    Nauczyciel powinien dziedziczyć z Pracownika, dla niego podatek zwraca 10% pensji.
    Stwórz obiekty z każdym z traitów, pokaż jak podatek działa dla każdego z nich.
    Stwórz obiekty z traitami Student i Pracownik, pokaż jak podatek zadziała w zależności od kolejności w jakiej te traity zostały dodane przy tworzeniu obiektu.
 */
package cw2_Scala

object Zadanie_5_NK extends App {

  class Osoba(val Imie:String, val Nazwisko:String, val Podatek:Double){}// val = immutable (read-only)

  trait Student extends Osoba{
    override val Podatek:Double = 0.0
  }

  trait Pracownik extends Osoba{
    var Pensja = 0.0

    def pensja_=(wartosc:Double): Unit={ //setter
      Pensja = wartosc
    }

    def pensja:Double = Pensja // getter

  }

  trait Nauczyciel extends Pracownik{
    override val Podatek:Double = 0.1 * pensja
  }

  val osoba = new Osoba("Jan","Kowalski",1000)
  val student = new Osoba("Adam","Zakuwacz",1000) with Student

  val pensjaPracownika = 1000
  val pracownik = new Osoba("Kazimierz","Pracuś", 1000) with Pracownik{
    pensja = pensjaPracownika
    override val Podatek:Double = 0.2 * Pensja
  }

  val pensjaNauczyciela = 1000
  val nauczyciel = new Osoba("Anna","Nauczka", 1000) with Nauczyciel{
    pensja = pensjaPracownika
    override val Podatek:Double = 0.1 * Pensja
  }

  printf("Klasa: Osoba| Imię: %s| Nazwisko: %s| Podatek: %s|\n",osoba.Imie ,osoba.Nazwisko, osoba.Podatek)
  printf("Klasa: Student| Imię: %s| Nazwisko: %s| Podatek: %s|\n",student.Imie ,student.Nazwisko, student.Podatek)
  printf("Klasa: Pracownik| Imię: %s| Nazwisko: %s| Podatek: %s| Pensja: %s|\n",pracownik.Imie ,pracownik.Nazwisko, pracownik.Podatek,pracownik.Pensja)
  printf("Klasa: Nauczyciel| Imię: %s| Nazwisko: %s| Podatek: %s| Pensja: %s|\n",nauczyciel.Imie ,nauczyciel.Nazwisko, nauczyciel.Podatek,nauczyciel.Pensja)

  val studPrac = new Osoba("Student", "Pracujący", 1000) with Student with Pracownik {
    pensja = pensjaNauczyciela
    override  val Podatek: Double = Pensja * 0.2
  }
  printf("Klasa: Student-Pracownik| Imię: %s| Nazwisko: %s| Podatek: %s| Pensja: %s|\n",studPrac.Imie ,studPrac.Nazwisko, studPrac.Podatek,studPrac.Pensja)
}

