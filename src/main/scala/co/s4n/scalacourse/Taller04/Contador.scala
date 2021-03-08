package co.s4n.scalacourse.Taller04

/**
 *
 * @param contador
 */

class Contador(val contador: Int) {

  /**
   *
   * @param op
   * @return
   */

  def incr(op: Int = 1) = new Contador(contador + op)

  /**
   *
   * @param op
   * @return
   */

  def decr(op: Int = 1) = new Contador(contador - op)

  /**
   *
   * @param sum
   * @return
   */

  def ajuste(sum: Sumador): Contador = new Contador(sum.adicionar(contador))

}

  /**
  *
  * @param monto
  */

class Sumador(monto: Int) {

  /**
   *
   * @param valor
   * @return
   */

  def adicionar(valor: Int) = valor + monto
}

