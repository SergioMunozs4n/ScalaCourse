package co.s4n.scalacourse.testingfunctions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestingRecursion extends AnyFlatSpec with Matchers{
  "1.The factorial(2) function" should "be 2" in {
    FunctionsRecursion.factorial(2) shouldEqual 2
  }
  "2.The factorial(5) function" should "be 120" in {
    FunctionsRecursion.factorial(5) shouldEqual 120
  }
  "3.The factorial(7) function" should "be 5040" in {
    FunctionsRecursion.factorial(7) shouldEqual 5040
  }
  "1.The 'Funcion(2)' function" should "be 1" in {
    FunctionsRecursion.funcion(2) shouldEqual 1
  }
  "2.The 'Funcion(3)' function" should "be 3" in {
    FunctionsRecursion.funcion(3) shouldEqual 2
  }
  "3.The 'Funcion(10)' function" should "be 55" in {
    FunctionsRecursion.funcion(10) shouldEqual 55
  }
  "1.The factorialtail(2) function" should "be 2" in {
    FunctionsRecursion.factorialtail(2) shouldEqual 2
  }
  "2.The factorialtail(5) function" should "be 5040" in {
    FunctionsRecursion.factorialtail(7) shouldEqual 5040
  }
  "3.The factorialtail(7) function" should "be 5040" in {
    FunctionsRecursion.factorialtail(7) shouldEqual 5040
  }



}
