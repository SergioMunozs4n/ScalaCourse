package co.s4n.scalacourse.Taller05

    /**
     * Clase color con atributos Red, Green y Blue
     * @param Red
     * @param Green
     * @param Blue
     */

class Color(val Red:Int, val Green:Int, val Blue:Int)

object Rojo{

  /**
   * Metodo apply es el contructor del objeto Rojo
   * @return
   */

  def apply() = new Color(255,0,0)

}
object Amarillo{

  /**
   * Metodo apply es el contructor del objeto Amarillo
   * @return
   */

  def apply() = new Color(255,255,0)

}
object Rosa{

  /**
   * Metodo apply es el contructor del objeto Rosa
   * @return
   */

  def apply() = new Color(255,153,153)

}

object Color{

  /**
   * Metodo apply es el contructor del objeto Color
   * @param Red
   * @param Green
   * @param Blue
   * @return
   */

  def apply(Red:Int, Green:Int, Blue:Int) = new Color(Red,Green,Blue)
}