package co.s4n.scalacourse.Taller02_03

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestTree extends AnyFlatSpec with Matchers {
  "1.The size(Leaf(10)) function" should "be 1" in {
    Tree.size(Leaf(10)) shouldEqual 1
  }
  "2.The size(Branch(Leaf(10),Leaf(20))) function" should "be 2" in {
    Tree.size(Branch(Leaf(10),Leaf(20))) shouldEqual 3
  }
  "3.The size(Branch(Branch(Leaf(10),Leaf(20)),Leaf(30))) function" should "be 5" in {
    Tree.size(Branch(Branch(Leaf(10),Leaf(20)),Leaf(30))) shouldEqual 5
  }
  "1.The depth(Leaf(10)) function" should "be 1" in {
    Tree.depth(Leaf(10)) shouldEqual 1
  }
  "2.The depth(Branch(Leaf(10),Leaf(20))) function" should "be 2" in {
    Tree.depth(Branch(Leaf(10),Leaf(20))) shouldEqual 2
  }
  "3.The depth(Branch(Branch(Leaf(10),Leaf(20)),Leaf(30))) function" should "be 3" in {
    Tree.depth(Branch(Branch(Leaf(10),Leaf(20)),Leaf(30))) shouldEqual 3
  }
  "3.The depth(Branch(Branch(Leaf(10),Leaf(20)),Branch(Leaf(30),Leaf(40)))) function" should "be 3" in {
    Tree.depth(Branch(Branch(Leaf(10),Leaf(20)),Branch(Leaf(30),Leaf(40)))) shouldEqual 3
  }
}
