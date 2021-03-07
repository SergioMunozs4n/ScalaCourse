package co.s4n.scalacourse.inmutablelists

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class TestNat extends AnyFlatSpec with Matchers {
  "1.The addNat(Cero,Suc(Cero)) function" should "be Suc(Cero)" in {
    Nat.addNat(Cero,Suc(Cero)) shouldEqual Suc(Cero)
  }
  "2.The addNat(Suc(Suc(Cero)),Suc(Cero)) function" should "be Suc(Suc(Suc(Cero)))" in {
    Nat.addNat(Suc(Suc(Cero)),Suc(Cero)) shouldEqual Suc(Suc(Suc(Cero)))
  }
  "3.The addNat(Suc(Suc(Suc(Cero))),Suc(Suc(Cero))) function" should "be Suc(Suc(Suc(Suc(Suc(Cero)))))" in {
    Nat.addNat(Suc(Suc(Suc(Cero))),Suc(Suc(Cero))) shouldEqual Suc(Suc(Suc(Suc(Suc(Cero)))))
  }
  "1.The prodNat(Cero,Suc(Cero)) function" should "be Cero" in {
    Nat.prodNat(Cero,Suc(Cero)) shouldEqual Cero
  }
  "2.The prodNat(Suc(Suc(Cero)),Suc(Cero)) function" should "be Suc(Suc(Cero))" in {
    Nat.prodNat(Suc(Suc(Cero)),Suc(Cero)) shouldEqual Suc(Suc(Cero))
  }
  "3.The prodNat(Suc(Suc(Suc(Cero))),Suc(Suc(Cero))) function" should "be Suc(Suc(Suc(Suc(Suc(Suc(Cero))))))" in {
    Nat.prodNat(Suc(Suc(Suc(Cero))),Suc(Suc(Cero))) shouldEqual Suc(Suc(Suc(Suc(Suc(Suc(Cero))))))
  }

}
