package co.s4n.scalacourse.Taller05

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FormaSpec extends AnyFlatSpec with Matchers{

  "1. Draw.apply(Circulo(10))" should "be Un circulo de radio 10.0cm" in{
    Draw.apply(Circulo(10)) shouldEqual Circulo(10)
  }
  "2. Draw.apply(Rectangulo(3,4))" should "be Un Rectangulo de  base 3.0 y altura 4.0" in{
    Draw.apply(Rectangulo(3,4)) shouldEqual Rectangulo(3,4)
  }

}
