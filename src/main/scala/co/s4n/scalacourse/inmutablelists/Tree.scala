package co.s4n.scalacourse.inmutablelists

import scala.annotation.tailrec

sealed trait Tree[+A]
case class Leaf[A](value:A) extends Tree[A]
case class Branch[A](left: Tree[A],right: Tree[A]) extends Tree[A]

object Tree extends App {

  /**
   * Retorna la cantidad de nodos del arbol.
   *
   * @param tree
   * @tparam A
   * @return
   */

  def size[A](tree: Tree[A]):Int = tree match {
    case Leaf(_) => 1
    case Branch(left,right) => 1 + size(left) + size(right)
  }

  /**
   * Retorna la logitud maxima del arbol.
   *
   * @param tree
   * @tparam A
   * @return
   */

  def depth[A](tree: Tree[A]): Int = tree match {
    case Leaf(_) => 1
    case Branch(left,right) => 1 + (if (depth(left)>depth(right)) depth(left) else depth(right) )
  }


}

