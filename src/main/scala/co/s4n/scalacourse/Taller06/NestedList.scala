package co.s4n.scalacourse.Taller06

sealed trait NestedList[+A]

case class Elem[A](value: A) extends NestedList[A]

case class Const[A](lst: List[NestedList[A]]) extends NestedList[A]

object NestedList extends App{

   def flatten[A] (lst: NestedList[A]): List[A] = lst match {
    case Elem(value) => List(value)
    case Const(list) => list.flatMap(flatten)
  }
}




