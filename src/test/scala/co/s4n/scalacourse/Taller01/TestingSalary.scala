package co.s4n.scalacourse.Taller01

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestingSalary extends AnyFlatSpec with Matchers{
  "1.The calSalario(100.000,50.000) function" should "be 50.000" in {
    FunctionsSalary.calSalario(100.000,50.000) shouldEqual 50.000
  }
  "2.The calSalario(100.000,200.000) function" should "be No es posible" in {
    FunctionsSalary.calSalario(100.000,200.000) shouldEqual "No es posible"
  }
  "1.The genCalSalario5(100.000,50.000) function" should "be 55.000" in {
    FunctionsSalary.calSalario5(100.000,50.000) shouldEqual 55.000
  }
  "2.The genCalSalario5(200.000,70.000) function" should "be 140.000" in {
    FunctionsSalary.calSalario5(200.000,70.000) shouldEqual 140.000
  }
  "1.The genCalSalario20(100.000,50.000) function" should "be 70.000" in {
    FunctionsSalary.calSalario20(100.000,50.000) shouldEqual 70.000
  }
  "2.The genCalSalario20(200.000,70.000) function" should "be 170.000" in {
  FunctionsSalary.calSalario20(200.000,70.000) shouldEqual 170.000
  }
  "1.The calSalarioBonoClausura(200.000,70.000) function" should "be 140.000" in {
    FunctionsSalary.calSalarioBonoClausura(200.000,70.000) shouldEqual 140.000
  }
  "2.The calSalarioBonoClausura(100.000,50.000) function" should "be 55.000" in {
    FunctionsSalary.calSalarioBonoClausura(100.000,50.000) shouldEqual 55.000
  }



}
