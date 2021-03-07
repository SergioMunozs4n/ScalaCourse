package co.s4n.scalacourse.classesandobjects

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PersonaSpec extends AnyFlatSpec with Matchers {

  val dirUno = Director("Peter", "Jackson", 1961)
  val dirDos = Director("Chris", "Columbus", 1958)
  val pelUno = Pelicula("The Lord of the Rings: The Fellowship of the Ring ", 2001, 88, dirUno)
  val pelDos = Pelicula("Harry Potter and the Sorcerer's Stone", 2001, 76, dirDos)

  "1. El director mayor es: " should "be Chris Columbus" in {
    Director.esMayor(dirUno,dirDos) shouldEqual "Chris Columbus"
  }

  "2. La Pelicula mejor calificada: " should "be The Lord of the Rings: The Fellowship of the Ring  2001 88 Peter Jackson" in {
    Pelicula.mejorCalificada(pelUno,pelDos) shouldEqual pelUno
  }

  "3. El director mayor a la epoca: " should "be Chris Columbus" in {
    Pelicula.mayorDirectorEnElTiempo(pelUno,pelDos) shouldEqual dirDos
  }
}
