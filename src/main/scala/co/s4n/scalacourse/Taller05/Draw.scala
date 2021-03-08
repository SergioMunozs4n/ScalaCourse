package co.s4n.scalacourse.Taller05

object Draw extends App {

  /**
   * Metodo apply es el contructor del objeto Draw
   * @param forma
   * @return
   */

  def apply(forma:Forma) = forma

  def applycase(forma: Forma) = forma match {
    case Circulo(_) => forma
    case Rectangulo(_,_) => forma
    case Cuadrado(_) => forma
  }

  println(applycase(new Rectangulo(10,12)))
}
