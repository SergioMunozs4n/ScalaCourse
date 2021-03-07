package co.s4n.scalacourse.testingfunctions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestingArea extends AnyFlatSpec with Matchers{
  "1.The areaTrianguloRectangulo function" should "be 4" in {
    FunctionsArea.areaTrianguloRectangulo(2,4) shouldEqual 4
  }
  "2.The areaTrianguloRectangulo function" should "be 32" in {
    FunctionsArea.areaTrianguloRectangulo(16,4) shouldEqual 32
  }
  "3.The areaTrianguloRectangulo function" should "be 36" in {
    FunctionsArea.areaTrianguloRectangulo(9,8) shouldEqual 36
  }
  "1.The areaDeUnCirculo function" should "be 12.566370614359172" in {
    FunctionsArea.areaDeUnCirculo(2) shouldEqual 12.566370614359172
  }
  "2.The areaDeUnCirculo function" should "be 113.09733552923255" in {
    FunctionsArea.areaDeUnCirculo(6) shouldEqual 113.09733552923255
  }
  "3.The areaDeUnCirculo function" should "be 50.26548245743669" in {
    FunctionsArea.areaDeUnCirculo(4) shouldEqual 50.26548245743669
  }




}
