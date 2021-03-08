package co.s4n.scalacourse.Taller06

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ListaSpect extends AnyFlatSpec with Matchers{

  "1.The subs(List(1,2)) function" should "be List(List(),List(1),List(2),List(2,1))" in {
    val lista = List(1,2)
    val result = List(List(),List(1),List(2),List(2,1))
    FPList.subs(lista) shouldEqual result
  }

  "2.The subs(List('a','b','c')) function" should "be List(List(),List('a'),List('b'),List('c'),List('b','a'),List('c','a'),List('c','b'),List('c','b','a'))" in {
    val lista = List("a","b","c")
    val result = List(List(),List("a"),List("b"),List("c"),List("b","a"),List("c","a"),List("c","b"),List("c","b","a"))
    FPList.subs(lista) shouldEqual result
  }

  "3.The permutations(List('a','b','c')) function" should "be List(List('a','b','c'),List('b','a','c'),List('b','c','a'),List('a','c','b'),List('c','a','b'),List('c','b','a')" in {
    val lista = List("a","b","c")
    val result = List(List("a","b","c"),List("b","a","c"),List("b","c","a"),List("a","c","b"),List("c","a","b"),List("c","b","a"))
    FPList.permutations(lista) shouldEqual result
  }

  "4.The permutations(List(2,3,4)) function" should "be List(List(2,3,4),List(3,2,4),List(3,4,2),List(2,4,3),List(4,2,3),List(4,3,2))" in {
    val lista = List(2,3,4)
    val result = List(List(2,3,4),List(3,2,4),List(3,4,2),List(2,4,3),List(4,2,3),List(4,3,2))
    FPList.permutations(lista) shouldEqual result
  }

  "7.The Last(List(1,2,3,4)) function" should "be 4" in {
    val lista = List(1,2,3,4)
    val result = 4
    FPList.last(lista) shouldEqual result
  }

  "8.The Last(List('x','y','z')) function" should "be 'z'" in {
    val lista = List("x","y","z")
    val result = "z"
    FPList.last(lista) shouldEqual result
  }

  "9.The myButLast(List(1,2,3,4)) function" should "be 3" in {
    val lista = List(1,2,3,4)
    val result = 3
    FPList.myButLast(lista) shouldEqual result
  }

  "10.The myButLast(List('x','y','z')) function" should "be 'y'" in {
    val lista = List("x","y","z")
    val result = "y"
    FPList.myButLast(lista) shouldEqual result
  }

  "11.The Both(List(1,2,3,4)) function" should "be (3,4)" in {
    val lista = List(1,2,3,4)
    val result = List(3,4)
    FPList.Both(lista) shouldEqual result
  }

  "12.The Both(List('x','y','z')) function" should "be ('y','z')" in {
    val lista = List("x","y","z")
    val result = List("y","z")
    FPList.Both(lista) shouldEqual result
  }

  "13.The elementAt(List(1,2,3)) function" should "be 2" in {
    val lista = List(1,2,3)
    val result = 2
    FPList.elementAt(2,lista) shouldEqual result
  }

  "14.The elementAt(List('s','c','a','l','a')) function" should "be 'a'" in {
    val lista = List("s","c","a","l","a")
    val result = "a"
    FPList.elementAt(3,lista) shouldEqual result
  }

  "15.The length(List(1,2,3)) function" should "be 2" in {
    val lista = List(1,2,3)
    val result = 3
    FPList.length(lista) shouldEqual result
  }

  "16.The length(List('s','c','a','l','a')) function" should "be 5" in {
    val lista = List("s","c","a","l","a")
    val result = 5
    FPList.length(lista) shouldEqual result
  }

  "17.The myreverse(List(1,2,3)) function" should "be List(3,2,1)" in {
    val lista = List(1,2,3)
    val result = List(3,2,1)
    FPList.myreverse(lista) shouldEqual result
  }

  "18.The myreverse(List('s','c','a','l','a')) function" should "be List('a','l','a','c','s')" in {
    val lista = List("s","c","a","l","a")
    val result = List("a","l","a","c","s")
    FPList.myreverse(lista) shouldEqual result
  }

  "19.The isPalindrome(List(1,2,3,2,1)) function" should "be true" in {
    val lista = List(1,2,3,2,1)
    val result = true
    FPList.isPalindrome(lista) shouldEqual result
  }

  "20.The isPalindrome(List('s','c','a','l','a')) function" should "be false" in {
    val lista = List("s","c","a","l","a")
    val result = false
    FPList.isPalindrome(lista) shouldEqual result
  }

  "21.The flatten(Const(List(Elem(1),Const(List(Elem(2),Const(List(Elem(3),Elem(4))),Elem(5)))))) function" should "be List(1,2,3,4,5)" in {
    val lista = Const(List(Elem(1),Const(List(Elem(2),Const(List(Elem(3),Elem(4))),Elem(5)))))
    val result = List(1,2,3,4,5)
    NestedList.flatten(lista) shouldEqual result
  }

  "22.The flatten(Const(List(Elem(1)))) function" should "be List(1)" in {
    val lista = Const(List(Elem(1)))
    val result = List(1)
    NestedList.flatten(lista) shouldEqual result
  }

  "23.The mycompress(List('a','a','a','a','b','c','c','a','a')) function" should "be List('a','b','c','a')" in {
    val lista = List('a','a','a','a','b','c','c','a','a')
    val result = List('a','b','c','a')
    FPList.mycompress(lista) shouldEqual result
  }

  "24.The mycompress(List('b','b','a','c','c','r','r','x','x')) function" should "be List('b','a','c','r','x')" in {
    val lista = List('b','b','a','c','c','r','r','x','x')
    val result = List('b','a','c','r','x')
    FPList.mycompress(lista) shouldEqual result
  }

  "25.The myPack(List('a','a','a','a','b','c','c','a','a')) function" should "be List(List('a','a','a','a'),List('b'),List('c','c'),List('a','a'),List())" in {
    val lista = List('a','a','a','a','b','c','c','a','a')
    val result = List(List('a','a','a','a'),List('b'),List('c','c'),List('a','a'),List())
    FPList.myPack(lista) shouldEqual result
  }

  "26.The myPack(List('b','b','a','c','c','r','r','x','x')) function" should "be List(List('b','b'),List('a'),List('c','c'),List('r','r'),List('x','x'),List())" in {
    val lista = List('b','b','a','c','c','r','r','x','x')
    val result = List(List('b','b'),List('a'),List('c','c'),List('r','r'),List('x','x'),List())
    FPList.myPack(lista) shouldEqual result
  }

  "27. The myencode(List('a', 'a', 'c', 'c', 'c', 'f','k', 'k','k','k'))" should " List(1,2,3,4)" in {
    val list = List('a', 'a', 'c', 'c', 'c', 'f','k', 'k','k','k')
    val result = List((2,'a'), (3,'c'), (1,'f'), (4,'k'))
    FPList.myencode(list) shouldEqual result
  }

  ".The dupli(List('a', 'b', 'c')) function" should "be List('a','a','b','b','c','c')" in {
    val lista = List('a', 'b', 'c')
    val result = List('a','a','b','b','c','c')
    FPList.dupli(lista) shouldEqual result
  }

  ".The dupli(List(1,2,3)) function" should "be List(1,1,2,2,3,3)" in {
    val lista = List(1,2,3)
    val result = List(1,1,2,2,3,3)
    FPList.dupli(lista) shouldEqual result
  }

  /*".The repli(List('a', 'b', 'c')) function" should "be List('a','a','a','b','b','b','c','c','c')" in {
    val lista = List('a', 'b', 'c')
    val result = List('a','a','a','b','b','b','c','c','c')
    FPList.repli(lista,3) shouldEqual result
  }*/

  ".The drop(List('a', 'b', 'c', 'd', 'e')) function" should "be List('a', 'b', 'd', 'e','g','h','k')" in {
    val lista = List('a', 'b', 'c', 'd', 'e','f','g','h','i','k')
    val result = List('a', 'b', 'd', 'e','g','h','k')
    FPList.drop(3,lista) shouldEqual result
  }

  ".The split(List('a', 'b', 'c', 'd', 'e')) function" should "be List(List('a', 'b', 'd'),('d','e'))" in {
    val lista = List('a', 'b', 'c', 'd', 'e')
    val result = (List('a', 'b', 'c'),List('d','e'))
    FPList.split(3,lista) shouldEqual result
  }

  ".The slice(List('a', 'b', 'c', 'd', 'e')) function" should "be List('a', 'b', 'c', 'd')" in {
    val lista = List('a', 'b', 'c', 'd', 'e')
    val result = List('a', 'b', 'c', 'd')
    FPList.slice(lista,1,4) shouldEqual result
  }

  ".The removeAt(List('a', 'b', 'c', 'd', 'e')) function" should "be List('a', 'b', 'c', 'e')" in {
    val lista = List('a', 'b', 'c', 'd', 'e')
    val result = List('a', 'b', 'd', 'e')
    FPList.removeAt(lista,3) shouldEqual result
  }

  ".The range(4,9) function" should "be List(4,5,6,7,8,9)" in {
    val result = List(4,5,6,7,8,9)
    FPList.range(4,9) shouldEqual result
  }

  ".The range(11,15) function" should "be List(11,12,13,14,15)" in {
    val result = List(11,12,13,14,15)
    FPList.range(11,15) shouldEqual result
  }

  ".The mycombinations(List('a','b','c')) function" should "be List(List('a','b'),List('b','a'),List('a','c'),List('c','a'))" in {
    val lista = List('a','b','c')
    val result = List(List('a','b'),List('b','a'),List('a','c'),List('c','a'))
    FPList.mycombinations(lista,2) shouldEqual result
  }



}
