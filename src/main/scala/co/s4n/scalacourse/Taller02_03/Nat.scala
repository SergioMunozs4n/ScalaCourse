package co.s4n.scalacourse.Taller02_03

sealed trait Nat

case object Cero extends Nat

case class Suc(nat: Nat) extends Nat

object Nat extends App {

  /**
   * Realiza la conversion de un elemento tipo Nat a entero.
   *
   * @param nat
   * @return
   */

  def fromNatToInt(nat: Nat): Int = nat match {
    case Cero => 0
    case Suc(nat) => 1 + fromNatToInt(nat)
  }

  /**
   * Realiza la conversion de un elemento tipo Int a Natural.
   *
   * @param int
   * @return
   */

  def fromIntToNat(int: Int): Nat = int match {
    case 0 => Cero
    case n => Suc(fromIntToNat(n - 1))
  }

  /**
   * Realiza la suma de dos elementos Nat.
   *
   * @param nat1
   * @param nat2
   * @return
   */

  def addNat (nat1:Nat, nat2:Nat): Nat = (nat1,nat2) match {
    case (Cero,Cero) => Cero
    case (Suc(nat1),Cero) => Suc(nat1)
    case (Cero,Suc(nat2)) => Suc(nat2)
    case (nat1,nat2) => fromIntToNat(fromNatToInt(nat1)+fromNatToInt(nat2))
  }

  /**
   * Realiza el producto de dos elementos Nat.
   *
   * @param nat1
   * @param nat2
   * @return
   */

  def prodNat (nat1:Nat, nat2:Nat): Nat = (nat1,nat2) match {
    case (Cero,Cero) => Cero
    case (Suc(nat1),Cero) => Cero
    case (Cero,Suc(nat2)) => Cero
    case (nat1,nat2) => fromIntToNat(fromNatToInt(nat1)*fromNatToInt(nat2))
  }
}