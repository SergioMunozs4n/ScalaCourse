package co.s4n.scalacourse.Taller02_03

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestList extends AnyFlatSpec with Matchers {

  "1.The head(List(1, 2, 3, 4)) function" should "be List(1,2,3,4,5)" in {
    List.head(List(1, 2, 3, 4)) shouldEqual 1
  }
  "2.The head(List(6, 7, 8, 9)) function" should "be List(6)" in {
    List.head(List(6, 7, 8, 9)) shouldEqual 6
  }
  "1.The tail(List(1, 2, 3, 4)) function" should "be List(2,3,4)" in {
    List.tail(List(1, 2, 3, 4)) shouldEqual List(2,3,4)
  }
  "2.The tail(List(6, 7, 8, 9)) function" should "be List(7,8,9)" in {
    List.tail(List(6, 7, 8, 9)) shouldEqual List(7,8,9)
  }
  "1.The or(List(false, false, false)) function" should "be false" in {
    List.or(List(false, false, false, false)) shouldEqual false
  }
  "2.The or(List(false, true, true, false)) function" should "be true" in {
    List.or(List(false, true, true, false)) shouldEqual true
  }
  "1.The and(List(true, true, true, true)) function" should "be true" in {
    List.and(List(true, true, true, true)) shouldEqual true
  }
  "2.The and(List(false, false, true, false)) function" should "be true" in {
    List.and(List(false, false, true, false)) shouldEqual false
  }
  "1.The max(List(7, 8, 9, 10)) function" should "be 10" in {
    List.max(List(7, 8, 9, 10)) shouldEqual 10
  }
  "2.The max(List(55, 99, 16)) function" should "be 99" in {
    List.max(List(55, 99, 16)) shouldEqual 99
  }
  "1.The min(List(7, 8, 9, 10)) function" should "be 7" in {
    List.min(List(7, 8, 9, 10)) shouldEqual 7
  }
  "2.The min(List(55, 99, 16)) function" should "be 16" in {
    List.min(List(55, 99, 16)) shouldEqual 16
  }
  "1.The minmax(List(7.1, 8.2, 9.4, 10.4)) function" should "be (7.1,10.4)" in {
    List.minMax(List(7.1, 8.2, 9.4, 10.4)) shouldEqual (7.1,10.4)
  }
  "2.The minmax(List(55.4, 99.8, 16.1)) function" should "be (16.1,99.8)" in {
    List.minMax(List(55.4, 99.8, 16.1)) shouldEqual (16.1,99.8)
  }
  "1.The length(List('a', 'b', 'c', 'd')) function" should "be 4" in {
    List.length(List("a", "b", "c", "d")) shouldEqual 4
  }
  "2.The lenght(List(55, 99, 16)) function" should "be 3" in {
    List.length(List(55, 99, 16)) shouldEqual 3
  }
  "1.The take(5,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) function" should "be List(1, 2, 3, 4, 5)" in {
    List.take(5,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) shouldEqual List(1, 2, 3, 4, 5)
  }
  "2.The take(3,List(6, 7, 8, 9)) function" should "be List(6,7,8)" in {
    List.take(3,List(6, 7, 8, 9)) shouldEqual List(6,7,8)
  }
  "1.The drop(5,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) function" should "be List(6,7,8,9)" in {
    List.drop(5,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) shouldEqual List(6,7,8,9)
  }
  "2.The drop(6,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) function" should "be List(7,8,9)" in {
    List.drop(6,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) shouldEqual List(7,8,9)
  }
  "1.The split(5,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) function" should "be (List(1,2,3,4,5),List(6,7,8,9))" in {
    List.split(5,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) shouldEqual (List(1,2,3,4,5),List(6,7,8,9))
  }
  "2.The split(6,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) function" should "be (List(1,2,3,4,5,6),List(7,8,9))" in {
    List.split(6,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) shouldEqual (List(1,2,3,4,5,6),List(7,8,9))
  }
  "1.The init(List(1, 2, 3, 4, 5, 6, 7, 8, 9)) function" should "be List(1,2,3,4,6,7,8)" in {
    List.init(List(1, 2, 3, 4, 5, 6, 7, 8, 9)) shouldEqual List(1,2,3,4,5,6,7,8)
  }
  "2.The init(List(1, 2, 3, 4) function" should "be List(1,2,3,4)" in {
    List.init(List(1, 2, 3, 4, 5)) shouldEqual List(1,2,3,4)
  }
  "1.The zip(List(1, 2, 3),List('a', 'b', 'c')) function" should "be List((1,'a'),(2,'b'),(3,'c'))" in {
    List.zip(List(1, 2, 3),List("a", "b", "c")) shouldEqual List((1,"a"),(2,"b"),(3,"c"))
  }
  "2.The zip(List('hola', 'prueba', 'zip'),List(2, 3, 4)) function" should "be List('hola',2),('prueba',3),('zip',4)" in {
    List.zip(List("hola", "prueba", "zip"),List(2, 3, 4)) shouldEqual List(("hola",2),("prueba",3),("zip",4))
  }
  "1.The unzip(List('hola',2),('prueba',3),('zip',4)) function" should "be List('hola', 'prueba', 'zip'),List(2, 3, 4))" in {
    List.unzip(List(("hola",2),("prueba",3),("zip",4))) shouldEqual (List("hola", "prueba", "zip"),List(2, 3, 4))
  }
  "2.The unzip(List((1,'a'),(2,'b'),(3,'c')) function" should "be List(1, 2, 3),List('a', 'b', 'c'))" in {
    List.unzip(List((1,"a"),(2,"b"),(3,"c"))) shouldEqual (List(1, 2, 3),List("a", "b", "c"))
  }
  "1.The reverse(List(1, 2, 4, 5)) function" should "be List(5, 4, 3, 2, 1))" in {
    List.reverse(List(1, 2, 3, 4, 5)) shouldEqual (List(5, 4, 3, 2, 1))
  }
  "2.The reverse(List('a', 'b', 'c', 'd')) function" should "be List('d', 'c', 'b', 'a')" in {
    List.reverse(List("a", "b", "c", "d")) shouldEqual List("d", "c", "b", "a")
  }
  "1.The intersperse(3,List(1, 2, 4, 5)) function" should "be List(1, 3, 2, 3, 4, 3, 5)" in {
    List.intersperse(3,List(1, 2, 4, 5)) shouldEqual List(1, 3, 2, 3, 4, 3, 5)
  }
  "2.The intersperse(List('a', 'b', 'c', 'd')) function" should "be List('a', 'l', 'b', 'l', 'c', 'l', 'd')" in {
    List.intersperse("l",List("a", "b", "c", "d")) shouldEqual List("a", "l", "b", "l", "c", "l", "d")
  }
  "1.The concat(List(List(1, 2, 3),List(4, 5, 6))) function" should "be List(1, 2, 3, 4, 5, 6)" in {
    List.concat(List(List(1, 2, 3),List(4, 5, 6)) ) shouldEqual List(1, 2, 3, 4, 5, 6)
  }
  "2.The concat(List('a', 'b'),List('c', 'd', 'e)) function" should "be List('a', 'b', 'c', 'd', 'e')" in {
    List.concat(List(List("a", "b"),List("c", "d", "e"))) shouldEqual List("a", "b", "c", "d", "e")
  }

  "1.The lengthF(List('a', 'b', 'c', 'd')) function" should "be 4" in {
    List.lengthF(List("a", "b", "c", "d")) shouldEqual 4
  }

  "1.The andF(List(true, true, true, true)) function" should "be true" in {
    List.andF(List(true, true, true, true)) shouldEqual true
  }
  "2.The andF(List(true, false, true, true)) function" should "be false" in {
    List.andF(List(true, false, true, true)) shouldEqual false
  }

  "1.The dropWhileCurry(5,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) function" should "be List(1, 2)" in {
    List.dropWhileCurry(List(1, 2, 3, 4, 5, 6, 7, 8, 9))(_>3) shouldEqual List(1,2)
  }

  "1.The takeWhileLeft(5,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) function" should "be List(1, 2)" in {
    List.takeWhileLeft(List(1, 2, 3, 4, 5, 6, 7, 8, 9))(_<3) shouldEqual List(1,2)
  }

  "2.The takeWhileLeft(5,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) function" should "be Nil" in {
    List.takeWhileLeft(List(1, 2, 3, 4, 5, 6, 7, 8, 9))(_>3) shouldEqual Nil
  }

  "1.The lengthL(List('a', 'b', 'c', 'd')) function" should "be 4" in {
    List.lengthL(List("a", "b", "c", "d")) shouldEqual 4
  }
  "2.The lenghtL(List(55, 99, 16)) function" should "be 3" in {
    List.lengthL(List(55, 99, 16)) shouldEqual 3
  }

  "1.The andL(List(true, true, true, true)) function" should "be true" in {
    List.andF(List(true, true, true, true)) shouldEqual true
  }
  "2.The andL(List(true, false, true, true)) function" should "be false" in {
    List.andF(List(true, false, true, true)) shouldEqual false
  }

  "1.The takeWhileL(5,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) function" should "be List(1, 2)" in {
    List.takeWhileL(List(1, 2, 3, 4, 5, 6, 7, 8, 9))(_<3) shouldEqual List(1,2)
  }

  "2.The takeWhileL(5,List(1, 2, 3, 4, 5, 6, 7, 8, 9)) function" should "be List(4,5,6,7,8,9)" in {
    List.takeWhileL(List(1, 2, 3, 4, 5, 6, 7, 8, 9))(_>3) shouldEqual List(4,5,6,7,8,9)
  }

  "1. La función filterL(List(1,2,3,4,5))((x:Int)=>x>3)" should "List(4,5)" in {
    List.filterL(List(1, 2, 3, 4, 5))(_ > 3) shouldEqual List(4, 5)
  }

  "1. La función unzipL(List('hola',2),('prueba',3),('zip',4)) " should "be List('hola', 'prueba', 'zip'),List(2, 3, 4))" in {
    List.unzipL(List(("hola", 2), ("prueba", 3), ("zip", 4))) shouldEqual(List("hola", "prueba", "zip"), List(2, 3, 4))
  }
}
