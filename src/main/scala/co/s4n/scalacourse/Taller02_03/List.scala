package co.s4n.scalacourse.Taller02_03

import scala.annotation.tailrec

sealed trait List[+A]

case object Nil extends List[Nothing]

case class Const[+A](h: A, t: List[A]) extends List[A]

object List extends App {

  /**
   * Retorna un la cola de una lista.
   *
   * @param lst
   * @tparam A
   * @return
   */

  def tail[A](lst: List[A]): List[A] = lst match {
    case Nil => Nil
    case Const(h, t) => t
  }

  /**
   * Retorna la cabeza de una lista.
   *
   * @param lst
   * @tparam A
   * @return
   */

  def head[A](lst: List[A]): A = lst match {
    case Const(h, t) => h
  }

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def headOption[A](lst: List[A]): Option[A] = lst match {
    case Nil => None
    case Const(h, _) => Some(h)
  }

  /**
   * Retorna conjuncion entre los elementos de la lista.
   *
   * @param lst
   * @return
   */

  def and(lst: List[Boolean]): Boolean = {
    def andAux(lst: List[Boolean], acum: Boolean): Boolean = lst match {
      case Nil => acum
      case Const(h, t) => andAux(t, h && acum)
    }

    andAux(lst, true)
  }

  /**
   * Retorna disyuncion entre los elementos de la lista.
   *
   * @param lst
   * @return
   */

  def or(lst: List[Boolean]): Boolean = {
    @tailrec
    def orAux(lst: List[Boolean], acum: Boolean): Boolean = lst match {
      case Nil => acum
      case Const(h, t) => orAux(t, h || acum)
    }

    orAux(lst, false)
  }

  /**
   * Retorna el mayor elemento de una lista.
   *
   * @param lst
   * @return
   */

  def max(lst: List[Int]): Int = {
    def maxp(lst: List[Int], max: Int): Int = lst match {
      case Nil => max
      case Const(h, t) => maxp(t, if (h > max) h else max)
    }

    maxp(tail(lst), head(lst))
  }

  /**
   * Retorna el menor elemento de una lista.
   *
   * @param lst
   * @return
   */

  def min(lst: List[Long]): Long = {
    def minp(lst: List[Long], min: Long): Long = lst match {
      case Nil => min
      case Const(h, t) => minp(t, if (h < min) h else min)
    }

    minp(tail(lst), head(lst))
  }

  /**
   * Retorna una tupla con el menor y el mayor elemento de una lista.
   *
   * @param lst
   * @return
   */

  def minMax(lst: List[Double]): (Double, Double) = {
    @tailrec
    def minMaxP(lst: List[Double], acc: (Double, Double)): (Double, Double) = lst match {
      case Nil => acc
      case Const(h, t) => minMaxP(t, (if (h < acc._1) h else acc._1, if (h > acc._2) h else acc._2))
    }

    minMaxP(tail(lst), (head(lst), head(lst)))
  }

  /**
   * Retorna la longitud de la lista.
   *
   * @param lst
   * @tparam A
   * @return
   */

  def length[A](lst: List[A]): Int = lst match {
    case Nil => 0
    case Const(h, t) => 1 + length(t)
  }

  /**
   * Retorna la suma de los elementos de una lista.
   *
   * @param ints
   * @return
   */

  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Const(h, t) => 1 + sum(t)
  }

  /**
   * Retorna el producto de los elementos de una lista.
   *
   * @param ds
   * @return
   */

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1
    case Const(h, t) => 1 * product(t)
  }

  /**
   * Es el constructor base del objeto List.
   *
   * @param as
   * @tparam A
   * @return
   */

  def apply[A](as: A*): List[A] = {
    if (as.isEmpty) Nil
    else Const(as.head, apply(as.tail: _*))
  }

  /**
   *
   * @param h
   * @param t
   * @tparam A
   * @return
   */

  def const[A](h: A, t: List[A]): List[A] = Const(h, t)

  /**
   * Retorna una lista añadiendo un elemento al final.
   *
   * @param elem
   * @param lst
   * @tparam A
   * @return
   */

  def addEnd[A](elem: A, lst: List[A]): List[A] = lst match {
    case Nil => Const(elem, Nil)
    case Const(h, t) => Const(h, addEnd(elem, t))
  }

  /**
   * Convierte dos listas en una.
   *
   * @param lst1
   * @param lst2
   * @tparam A
   * @return
   */

  def append[A](lst1: List[A], lst2: List[A]): List[A] = (lst1, lst2) match {
    case (Nil, Nil) => Nil
    case (lst1, Nil) => lst1
    case (Nil, lst2) => lst2
    case (Const(h, t), lst2) => Const(h, append(t, lst2))
  }

  /**
   * Retorna una lista creada con los elementos despues de una posicion especifica.
   *
   * @param n
   * @param lst
   * @tparam A
   * @return
   */

  def drop[A](n: Int, lst: List[A]): List[A] = (n, lst) match {
    case (n, Nil) => Nil
    case (0, lst) => lst
    case (n, Const(h, t)) => drop(n - 1, t)
  }

  /**
   *
   *
   * @param lst
   * @param f
   * @tparam A
   * @return
   */

  def dropWhile[A](lst: List[A], f: A => Boolean): List[A] = lst match {
    case Nil => Nil
    case Const(h, t) if f(h) => dropWhile(t, f)
    case _ => lst
  }

  /**
   *
   * @param lst
   * @param f
   * @tparam A
   * @return
   */

  def dropWhileCurry[A](lst: List[A])(f: A => Boolean): List[A] = lst match {
    case Const(h, t) if f(h) => dropWhileCurry(t)(f)
    case _ => lst
  }

  /**
   * Retorna los primeros elementos hasta una posicion especifica de una lista.
   *
   * @param n
   * @param lst
   * @tparam A
   * @return
   */

  def take[A](n: Int, lst: List[A]): List[A] = (n, lst) match {
    case (n, Nil) => Nil
    case (1, Const(h, t)) => addEnd(h, Nil)
    case (n, Const(h, t)) => Const(h, take(n - 1, t))
  }

  /**
   * Genera una tupla de listas creada a base de take y drop.
   *
   * @param n
   * @param lst
   * @tparam A
   * @return
   */

  def split[A](n: Int, lst: List[A]): (List[A], List[A]) = {
    @tailrec
    def splith[A](c: Int, lst2: List[A], acum: List[A]): (List[A], List[A]) = (c, lst2) match {
      case (c, Nil) => (Nil, Nil)
      case (0, Const(h, t)) => (acum, lst2)
      case (c, Const(h, t)) => splith(c - 1, t, addEnd(h, acum))
    }

    splith(n, lst, Nil)
  }

  /**
   * Retorna una lista con todos los elementos menos el ultimo.
   *
   * @param lst
   * @tparam A
   * @return
   */

  def init[A](lst: List[A]): List[A] = lst match {
    case Nil => Nil
    case Const(h, Nil) => Nil
    case Const(h, t) => Const(h, init(t))
  }

  /**
   * Fusiona dos listas en una lista donde cada elemento es una tupla de las anteriores.
   *
   * @param lst1
   * @param lst2
   * @tparam A
   * @tparam B
   * @return
   */

  def zip[A, B](lst1: List[A], lst2: List[B]): List[(A, B)] = (lst1, lst2) match {
    case (lst1, Nil) => Nil
    case (Nil, lst2) => Nil
    case (Const(h1, t1), Const(h2, t2)) => Const((h1, h2), zip(t1, t2))
  }

  /**
   * Retorna dos listas a base de una lista con tuplas.
   *
   * @param lst
   * @tparam A
   * @tparam B
   * @return
   */

  def unzip[A, B](lst: List[(A, B)]): (List[A], List[B]) = {
    @tailrec
    def unzipAux[A, B](lstO: List[(A, B)], lst1: List[A], lst2: List[B]): (List[A], List[B]) = lstO match {
      case Nil => (lst1, lst2)
      case Const(h, t) => unzipAux(t, addEnd(h._1, lst1), addEnd(h._2, lst2))
    }

    unzipAux(lst, Nil, Nil)
  }

  /**
   * Retorna una lista con el orden de los elementos invertidos.
   *
   * @param l
   * @tparam A
   * @return
   */

  def reverse[A](l: List[A]): List[A] = {
    def reverseAux[A](acum: Int, lst: List[A], lstAux: List[A]): List[A] = (acum, lst) match {
      case (0, Nil) => lstAux
      case (acum, Const(h, t)) => reverseAux(acum - 1, t, Const(h, lstAux))
    }

    reverseAux(length(l), l, Nil)
  }

  /**
   * Interpone un valor dado entre los elementos de una lista.
   *
   * @param elem
   * @param lst
   * @tparam A
   * @return
   */

  def intersperse[A](elem: A, lst: List[A]): List[A] = {
    @tailrec
    def intersperseAux[A](elem0: A, lst0: List[A], acum: List[A]): List[A] = lst0 match {
      case Nil => acum
      case Const(h, Nil) => addEnd(h, acum)
      case Const(h, t) => intersperseAux(elem0, t, addEnd(elem0, addEnd(h, acum)))
    }

    intersperseAux(elem, lst, Nil)
  }

  /**
   * Retorna una lista a base de una lista con listas.
   *
   * @param l
   * @tparam A
   * @return
   */

  def concat[A](l: List[List[A]]): List[A] = {
    def concatAux[A](lst: List[List[A]], acum: List[A]): List[A] = lst match {
      case Nil => acum
      case Const(h, t) => concatAux(t, append(acum, h))
    }

    concatAux(l, Nil)
  }

  /**
   *
   * @param as
   * @param z
   * @param f
   * @tparam A
   * @tparam B
   * @return
   */

  @tailrec
  def foldLeft[A, B](as: List[A], z: B)(f: (B, A) => B): B = as match {
    case Const(h, t) => foldLeft(t, f(z, h))(f)
    case Nil => z
  }

  /**
   *
   * @param as
   * @param z
   * @param f
   * @tparam A
   * @tparam B
   * @return
   */

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = as match {
    case Nil => z
    case Const(h, t) => f(h, foldRight(t, z)(f))
  }

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def lengthF[A](lst: List[A]): Int = foldRight(lst, 0)((_, y) => 1 + y)

  /**
   *
   * @param lst
   * @return
   */

  def andF(lst: List[Boolean]): Boolean = foldRight(lst, true)(_ && _)

  /**
   *
   * @param lst
   * @param p
   * @tparam A
   * @return
   */

  def takeWhileLeft[A](lst: List[A])(p: A => Boolean): List[A] = {
    def f(b: (Boolean, List[A]), a: A): (Boolean, List[A]) = b match {
      case (true, lst) => if (p(a)) (true, addEnd(a, lst)) else (false, lst)
      case (false, lst) => b
    }

    foldLeft(lst, (true, Nil: List[A]))(f)._2
  }

  /**
   *
   * @param lst
   * @param p
   * @tparam A
   * @return
   */

  def filter[A](lst: List[A])(p: A => Boolean): List[A] = foldRight(lst, Nil: List[A])((x, y) => if (p(x)) Const(x, y) else y)

  /**
   *
   * @param lst
   * @tparam A
   * @tparam B
   * @return
   */

  def unzipF[A, B](lst: List[(A, B)]): (List[A], List[B]) = foldRight(lst, (Nil: List[A], Nil: List[B]))((x, y) => (Const(x._1, y._1), Const(x._2, y._2)))

  /**
   *
   * @param lst
   * @tparam A
   * @return
   */

  def lengthL[A](lst: List[A]): Int = foldLeft(lst, 0)((y, _) => 1 + y)

  /**
   *
   * @param lst
   * @return
   */

  def andL(lst: List[Boolean]): Boolean = foldLeft(lst, true)(_ && _)

  /**
   *
   * @param lst
   * @param p
   * @tparam A
   * @return
   */

  def takeWhileL[A](lst: List[A])(p: A => Boolean): List[A] = foldLeft(lst, Nil: List[A])((x, y) => if (p(y)) addEnd(y, x) else x)

  /**
   *
   * @param lst
   * @param p
   * @tparam A
   * @return
   */

  def filterL[A](lst: List[A])(p: A => Boolean): List[A] = foldLeft(lst, Nil: List[A])((x, y) => if (p(y)) addEnd(y, x) else x)

  /**
   *
   * @param lst
   * @tparam A
   * @tparam B
   * @return
   */

  def unzipL[A, B](lst: List[(A, B)]): (List[A], List[B]) = foldLeft(lst, (Nil: List[A], Nil: List[B]))((x, y) => ((addEnd(y._1, x._1)), addEnd(y._2, x._2)))

  /**
   *
   * @param lst
   * @return
   */

  def sumF(lst: List[Int]) = foldRight(lst, 0)(_ + _)

  /**
   *
   * @param lst
   * @return
   */

  def mulF(lst: List[Int]) = foldRight(lst, 1)((x, y) => x * y)

  /**
   *
   * @param lst
   * @return
   */

  def SumarUno(lst: List[Int]): List[Int] = foldLeft(lst, Nil: List[Int])((lst, elem) => addEnd(elem + 1, lst))

  /**
   *
   * @param lst
   * @param f
   * @tparam A
   * @tparam B
   * @return
   */

  def map[A, B](lst: List[A])(f: A => B): List[B] = foldRight(lst, Nil: List[B])((x, y) => Const(f(x), y))

  /**
   *
   * @param lst
   * @param f
   * @tparam A
   * @tparam B
   * @return
   */

  def mapGen[A, B](lst: List[A])(f: A => B): List[B] = lst match {
    case Nil => Nil
    case Const(h, t) => Const(f(h), mapGen(t)(f))
  }

  /**
   *
   * @param lst
   * @return
   */

  def lstInt2Str(lst: List[Int]): List[String] = lst match {
    case Nil => Nil
    case Const(h, t) => Const(h.toString, lstInt2Str(t))
  }

  /**
   *
   * @param lst
   * @return
   */

  def lstInt2StrMap(lst: List[Int]): List[String] = mapGen(lst)(_.toString)

  /**
   *
   * @param lst
   * @return
   */

  def SumarUnoMap(lst: List[Int]): List[Int] = mapGen(lst)(_ + 1)

}

