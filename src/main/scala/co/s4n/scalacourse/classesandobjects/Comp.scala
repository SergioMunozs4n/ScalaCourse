package co.s4n.scalacourse.classesandobjects

object Comp {

  /**
   *
   * @param valor
   * @return
   */

  def cuadrado(valor: Float): Float = {
    valor * valor
  }

  /**
   *
   * @param valor
   * @return
   */

  def cubo(valor: Float): Float = {
    cuadrado(valor) * valor
  }

}
object Comp2 {

  /**
   *
   * @param valor
   * @return
   */

  def cuadrado(valor: Long): Long = {
    math.pow(valor.toDouble, 2).toLong
  }

  /**
   *
   * @param valor
   * @tparam A
   * @tparam B
   * @return
   */

  def cubo[A, B](valor: Long): Long = {
    cuadrado(valor) * valor
  }

}
