package co.s4n.scalacourse.Taller04

class Forma {

  /**
   *
   * @return
   */

  def area: Double = 0.0
}

  /**
  *
  * @param ancho
  * @param altura
  */

class Rectangulo(val ancho: Double, val altura: Double) extends Forma {

  /**
   *
   *  @return
   */

  override def area: Double = ancho * altura
}

  /**
  *
  * @param radio
  */

class Circulo(val radio: Double) extends Forma {

  /**
   *
   *  @return
   */

  override def area: Double = math.Pi * radio * radio

  val forma = new Rectangulo(2.0,4.0)
}
