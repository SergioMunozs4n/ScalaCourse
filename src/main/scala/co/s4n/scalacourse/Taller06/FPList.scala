package co.s4n.scalacourse.Taller06

import scala.annotation.tailrec
import scala.util.Random


object FPList extends {

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
   * Metodo permutations que permite mostar las posibles combinaciones de los elementos de una lista.
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
   * 1. La funcion last encuentra el ultimo elemento de una lista.
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
   * 2. La funcion MyButLast encuentra el penultimo elemento de una lista.
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
   * 3. La funcionBoth retorna una lista con el ultimo y el penultimo elemento de una lista.
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
   * 4. La funcion ElementAt encuentra el elemento de una n posicion dada.
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
   * 5. La funcion length retorna el tamaño de la lista.
   * @param lst
   * @tparam A
   * @return
   */

  def length[A](lst: List[A]): Int = lst match {
    case Nil => 0
    case head :: tail => 1 + length(tail)
  }

  /**
   * 6. La funcion lengthL retorna el tamaño de la lista utilizando foldleft.
   * @param lst
   * @tparam A
   * @return
   */

  def lengthL[A](lst: List[A]): Int = lst.foldLeft(0)((y, _) => 1 + y)

  /**
   * 7. La funcion myreverse retorna una lista con orden reverso.
   * @param lst
   * @tparam A
   * @return
   */

  def myreverse[A](lst: List[A]): List[A] = lst match {
    case head :: tail => myreverse(tail) ::: List(head)
    case Nil => Nil
  }

  /**
   * 8. La funcion isPalindrome retorna un Booleano verificando si una lista es palindrome.
   * @param lst
   * @tparam A
   * @return
   */

  def isPalindrome[A](lst: List[A]): Boolean = lst match {
    case Nil => false
    case lst => lst == myreverse(lst)
  }

  /**
   * 9. La funcion mycompress retorna una lista eliminadno los duplicados consecutivos de una lista.
   * @param lst
   * @tparam A
   * @return
   */

  def mycompress[A](lst: List[A]): List[A] = lst match {
    case Nil => Nil
    case head :: tail => head :: mycompress(tail.dropWhile(head == _))
  }

  /**
   * 10. La funcion myPack empaqueta los duplicados consecutivos de una lista.
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
  def pack[A](lst: List[A]): List[List[A]] = lst match {
    case Nil => Nil
    case x :: tail => val (head, tail) = lst.span(x == _); head :: pack(tail)
  }

  /**
   * 11. La funcion myencole codifica y numera la cantidad de elementos repetidos consecutivamente.
   * @param lst
   * @tparam A
   * @return
   */

  def myencode[A](lst: List[A]): List[(Int,A)] = lst match {
    case Nil => Nil
    case lst => pack(lst).map(lista => (lista.length, lista.head))
  }

  /**
   * 12. La funcion decodeModified numera la cantidad de elementos consecutivamente y si no tiene duplicados es un valor single.
   * @param lst
   * @tparam A
   * @return
   */

  def encodeModified[A](lst: List[A]): List[(A,Int)] = ???

  /**
   * 13. La funcion decodeModified genera una lista a base de de tuplas en donde se menciona la cantidad veces que se repite un elemento consecutivamente.
   * @param lst
   * @tparam A
   * @return
   */

  def decodeModified[A](lst: List[(Int,A)]): List[A] = lst

  /**
   * 14. La funcion encodeDirect
   * @param lst
   * @tparam A
   * @return
   */

  def encodeDirect[A](lst: List[A]): List[A] = ???

  /**
   * 15. La funcion dupli duplica elementos de una lista.
   * @param lst
   * @tparam A
   * @return
   */

  def dupli[A](lst: List[A]): List[A] = lst match{
    case Nil => Nil
    case head :: tail => head :: head :: dupli(tail)
  }

  /**
   * 16. La funcion repli replica n veces los elementos de una lista.
   * @param lst
   * @param n
   * @tparam A
   * @return
   */

  /*def repli[A](lst: List[A], n: Int): List[A] = (lst,n) match {
    case (Nil,0) => Nil
    case (head :: tail,n) => head :: repli(tail,n-1)
  }*/

  /**
   * 17. La funcion drop elimina un elemento de una n posicion.
   * @param lst
   * @param n
   * @tparam A
   * @return
   */

  def drop[A](n: Int, lst: List[A]): List[A] = {
    def dropAux[A](nAux: Int, lstAux: List[A]): List[A] = (nAux,lstAux) match {
      case (_,Nil) => Nil
      case (1, _ :: tail) => dropAux(n,tail)
      case (n, head :: tail) => head :: dropAux(nAux-1,tail)
    }
    dropAux(n, lst)
  }

  /**
   * 18. La funcion split divide la lista en dos partes dependiendo un valor de longitud.
   * @param lst
   * @param n
   * @tparam A
   * @return
   */

  def split[A](n: Int, lst: List[A]): (List[A], List[A]) = {
    def splith[A](c: Int, lst2: List[A], acum: List[A]): (List[A], List[A]) = (c, lst2) match {
      case (c, Nil) => (Nil, Nil)
      case (0, head :: tail) => (acum.reverse, lst2)
      case (c, head :: tail) => splith(c - 1, tail, (head :: acum))
    }

    splith(n, lst, Nil)
  }


  /**
   * 19. La funcion slice genera una lista con los elementos de una lista dentro de un rango de posiciones.
   * @param lst
   * @param i
   * @param k
   * @tparam A
   * @return
   */

  def slice[A](lst: List[A], i: Int,k: Int): List[A] = lst match {
      case Nil => Nil
      case head :: tail => if (i > 1) slice(tail, i - 1, k - 1)
        else if (k > 0) head :: slice(tail, 1, k - 1)
        else Nil
    }

  /**
   * 20. La funcion rotate rota una lista N posiciones a la izquierda.
   * @param lst
   * @param n
   * @tparam A
   * @return
   */

  def rotate[A](lst: List[A], n: Int): List[A] = ???

  /**
   * 21. La funcion removeAt elimina un elemento de una n posicion.
   * @param lst
   * @param n
   * @tparam A
   * @return
   */

  def removeAt[A](lst: List[A], n: Int): List[A] = lst match {
    case Nil => Nil
    case head :: tail => val x = split(n - 1, lst)
      (x._1 ::: x._2.tail)
  }

  /**
   * 22. La funcion range crea una lista con todos los enteros entre un rango dado.
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
   * 23. La funcion myrndSelect extrae valores aleatorios seleccionado de una lista.
   * @param lst
   * @param n
   * @tparam A
   * @return
   */

  def myrndSelect[A](lst: List[A], n: Int): List[A] = {
    def aux(lst: List[A], lstAcc: List[A], n: Int): List[A] = n match {
      case 0 => lstAcc
      case n => aux(lst, (elementAt(Random.nextInt(lst.length),lst) :: lstAcc), n - 1)
    }
    aux(lst, Nil, n)
  }

  /**
   * 24. La funcion mydiffSelect toma N numeros aleatorios de un rango de 1 a un valor dado.
   * @param n
   * @param max
   * @tparam A
   * @return
   */

  def mydiffSelect[A](n: Int, max: Int): List[Int] = myrndSelect(range(1, max), n)

  /**
   * 25. La funcion myRndmPermute genera permutaciones random de los elementos de una lista.
   * @param lst
   * @tparam A
   * @return
   */

  def myRndmPermute[A](lst: List[A]): List[A] = myrndSelect(permutations(lst), 1).flatten

   def myRndmPermute2[A](lst: List[A]): List[A] = {
    val permutada = permutations(lst)
    elementAt(Random.nextInt(permutada.length),permutada)
  }

  /**
   * 26. La funcion mycombinations genera la combinacion de k objetos escogidos de una losta de N elementos.
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