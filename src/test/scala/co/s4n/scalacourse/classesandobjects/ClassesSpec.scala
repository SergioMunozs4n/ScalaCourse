package co.s4n.scalacourse.classesandobjects

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ClassesSpec extends AnyFlatSpec with Matchers{

  "1. El cuadrado de 2: " should "be 4" in {
    Comp.cuadrado(2F) shouldEqual 4
  }
  "2. El cubo de 2: " should "be 8" in {
    Comp.cubo(2F) shouldEqual 8
  }
  "3. El cuadrado de 2: " should "be 4" in {
    Comp2.cuadrado(2) shouldEqual 4
  }
  "4. El cubo de 2: " should "be 8" in {
    Comp2.cubo(2) shouldEqual 8
  }
  "5. Despachar(IO): " should "be true" in {
    VentaDeChurrus.despachar(IO) shouldEqual true
  }
  "6. Despachar(Docker): " should "be false" in {
    VentaDeChurrus.despachar(Docker) shouldEqual false
  }




}
