package co.s4n.scalacourse.listas

import scala.annotation.tailrec


object Main extends App {

  /**
   * Metodo addEnd Añade el elemento al final.
   *
   * @param elem
   * @param lst
   * @tparam A
   * @return
   */

  def addEnd[A](elem: A, lst: List[A]): List[A] = lst match {
    case Nil => elem :: Nil
    case h :: t => h :: addEnd(elem, t)
  }

  /**
   * Metodo subs retorna los subconjuntos de una lista.
   *
   * @param lst
   * @tparam A
   * @return
   */

  def subs[A](lst: List[A]): List[List[A]] = {
    @tailrec
    def subsAux(lstO: List[A], acum: List[List[A]]): List[List[A]] = lstO match {
      case Nil => acum
      case x :: xs => subsAux(xs, acum ::: (acum.map((x :: _))))
    }

    subsAux(lst, Nil :: Nil).sortBy(_.length)
  }

  def subs2[A](lst: List[A]): List[List[A]] = lst match {
    case Nil => List(Nil)
    case h :: rest => subs(rest) ::: subs(rest).map(h :: _)
  }

  /**
   *
   * @param a
   * @param lst
   * @tparam A
   * @return
   */

  def barajar[A](a: A, lst: List[A]): List[List[A]] = lst match {
    case Nil => List(List(a))
    case x :: xs => (a :: (x :: xs)) :: ((barajar(a, xs)).map(x :: _))
  }

  /**
   * Metodo permutations
   *
   * @param lst
   * @tparam A
   * @return
   */

  def permutations[A](lst: List[A]): List[List[A]] = lst match {
    case Nil => List(Nil)
    case x :: xs => (permutations(xs)).flatMap(barajar(x, _))
  }

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def last[A](lst: List[A]): A = lst match {

    case head :: Nil => head
    case head :: t => last(t)
    case _ => throw new NoSuchElementException("Lista vacia")

  }

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def myButLast[A](lst: List[A]): A = lst match {

    case x :: y :: Nil => x
    case head :: t => myButLast(t)
    case _ => throw new NoSuchElementException("Lista vacia o con un elemento")

  }

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def Both[A](lst: List[A]): List[A] = lst match {

    case x :: y :: Nil => List(x, y)
    case head :: tail => Both(tail)
    case _ => throw new NoSuchElementException("Lista vacia o con un elemento")

  }

  /**
   *
   * @param elem
   * @param lst
   * @tparam A
   * @return
   */

  def elementAt[A](elem: Int, lst: List[A]): A = (elem, lst) match {
    case (1, head :: tail) => head
    case (elem, head :: tail) => elementAt(elem - 1, tail)
  }

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def length[A](lst: List[A]): Int = lst match {
    case Nil => 0
    case head :: tail => 1 + length(tail)
  }

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def lengthL[A](lst: List[A]): Int = lst.foldLeft(0)((y, _) => 1 + y)

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def myreverse[A](lst: List[A]): List[A] = lst match {
    case head :: tail => myreverse(tail) ::: List(head)
    case Nil => Nil
  }

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def isPalindrome[A](lst: List[A]): Boolean = lst match {
    case Nil => false
    case lst => lst == myreverse(lst)
  }

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def mycompress[A](lst: List[A]): List[A] = lst match {
    case Nil => Nil
    case head :: tail => head :: mycompress(tail.dropWhile(head == _))
  }

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def myPack[A](lst: List[A]): List[List[A]] = lst match {
    case Nil => List(Nil)
    case head :: tail =>{
      val x = tail.span(head == _)
      (head :: x._1) :: myPack(x._2)}
  }

  /*def myencole[A](lst :List[A]): List[(A,Int)] = lst match {
    case Nil => Nil
    case head :: tail => List(head, myPack(lst).count(head == _))
  }*/

  /**
   *
   * @param from
   * @param to
   * @tparam A
   * @return
   */

  def range[A](from: Int, to: Int): List[Int] = {
    def aux[A](from: Int, to: Int, lstAcc: List[Int]): List[Int] = (from compare to) match {
      case 0 => lstAcc ::: List(to)
      case -1 => aux(from + 1, to, lstAcc ::: List(from))

    }

    aux(from, to, Nil)
  }

  /**
   *
   * @param lst
   * @param n
   * @tparam A
   * @return
   */

  def myrndSelect[A](lst: List[A], n: Int): List[A] = {
    def aux(lst: List[A], lstAcc: List[A], n: Int): List[A] = n match {
      case 0 => lstAcc
      case n => aux(lst, (elementAt(lst,Random.nextInt(lst.length)) :: lstAcc), n - 1)
    }
    aux(lst, Nil, n)
  }

  /**
   *
   * @param n
   * @param max
   * @tparam A
   * @return
   */

  def mydiffSelect[A](n: Int, max: Int): List[Int] = myrndSelect(range(1, max), n)

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def myRndmPermute[A](lst: List[A]): List[A] = myrndSelect(permute(lst), 1).flatten

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def myRndmPermute2[A](lst: List[A]): List[A] = {
    val permutada = permute(lst)
    elementAt(permutada, Random.nextInt(permutada.length))
  }

  /**
   *
   * @param lst
   * @param k
   * @tparam A
   * @return
   */

  def mycombinations[A](lst: List[A],k: Int): List[List[A]] = lst match {
    case head :: tail if k == 1 => lst.map(List(_))
    case head :: tail => (mycombinations(tail, k - 1).flatMap(barajar(head, _)))
    case Nil => List(Nil)
  }


}