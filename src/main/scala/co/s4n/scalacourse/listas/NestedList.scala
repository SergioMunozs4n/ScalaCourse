package co.s4n.scalacourse.listas

sealed trait NestedList[+A]

case class Elem[A](value: A) extends NestedList[A]

case class Const[A](lst: List[NestedList[A]]) extends NestedList[A]

object NestedList extends App{

  val x = Const(List(Elem(2),Const(List(Elem(1),Const(List(Elem(3),Elem(4))),Elem(5)))))

  def flatten[A] (lst: NestedList[A]): List[A] = lst match {
    case Elem(value) => List(value)
    case Const(list) => list.flatMap(flatten)
  }
}




