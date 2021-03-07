package co.s4n.scalacourse.traits

sealed trait Forma {

  def tamaño(): Double

  def perimetro(): Double

  def area(): Double

}

trait Rectangular extends Forma {

  /**
   * Metodo perimetro sobreecrito para atributos de Rectangular.
   * @return
   */

  override def tamaño(): Double = 4.0

  override def perimetro(): Double

  override def area(): Double

}

  /**
   * Clase Circulo que extiende de Forma con atributo radio.
   * @param radio
   */

final case class Circulo(val radio: Double) extends Forma {

  /**
   * Metodo tamaño sobreescrito para atributos de Circulo.
   * @return
   */

  override def tamaño(): Double = (this.radio * 2)

  /**
   * Metodo perimetro sobreecrito para atributos de Circulo.
   * @return
   */

  override def perimetro(): Double = (2 * Math.PI * this.radio)

  /**
   * Metodo area sobreecrito para atributos de Circulo.
   * @return
   */

  override def area(): Double = (Math.PI * (this.radio * this.radio))

  /**
   * Metodo toString retorna la descripcion de la clase Circulo
   * @return
   */

  override def toString: String = s"Un Circulo de radio ${this.radio}"
}

final case class Rectangulo(val base: Double, val altura: Double) extends Rectangular {

  /**
   * Metodo perimetro sobreescrito para atributos de Rectangulo.
   * @return
   */

  override def perimetro(): Double = (2 * (this.base + this.altura))

  /**
   * Metodo area sobreescrito para atributos de Rectangulo.
   * @return
   */

  override def area(): Double = this.base * this.altura

  /**
   * Metodo toString retorna la descripcion de la clase Rectangulo.
   * @return
   */

  override def toString: String = s"Un Rectangulo de base ${this.base} y altura ${this.altura}"
}

final case class Cuadrado(val lado: Double) extends Rectangular {

  /**
   * Metodo area sobreescrito para atributos de Cuadrado.
   * @return
   */

  override def perimetro(): Double = (4 * this.lado)

  /**
   * Metodo area sobreescrito para atributos de Cuadrado.
   * @return
   */

  override def area(): Double = (this.lado * this.lado)

  /**
   * Metodo toString retorna la descripcion de la clase Cuadrado.
   * @return
   */

  override def toString: String = s"Un Cuadrado de lado ${this.lado}"
}







