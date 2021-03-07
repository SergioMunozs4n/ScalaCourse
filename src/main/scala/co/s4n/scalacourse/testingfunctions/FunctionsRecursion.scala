package co.s4n.scalacourse.testingfunctions

object FunctionsRecursion {
  /**
   * 15. Implementar  la  funcion  de  factorial  utilizando  recursividad  en Scala
   */

  def factorial(n:Int) :Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else n*factorial(n-1)
  }

  /**
   * 16. Implementar la siguiente funcion de forma recursiva en Scala
   */

  def funcion(n:Int) :Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else funcion(n-1)+funcion(n-2)
  }

  /**
   * 17. Reescriba la funcion de factorial para que se ejecute bajo recursividad de cola.
   */

  def factorialtail(n:Int) :Int = {
    def factor(n:Int, acum:Int): Int = {
      if (n == 0) acum
      else factor(n-1,n*acum)
    }
    factor(n,1)
  }
}
