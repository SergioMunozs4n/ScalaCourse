package co.s4n.scalacourse.Taller05

trait Felino {
  def color: String

  def sonido: String
}

/**
 * Clase Leon extiene de Felino y tiene atibuto LonMelena
 * @param LonMelena
 * @param color
 * @param sonido
 */

case class Leon(val LonMelena: Int, override val color: String, override val sonido: String) extends Felino

/**
 * Clase Tigre que extiende de Felino
 * @param color
 * @param sonido
 */

case class Tigre(override val color: String, override val sonido: String) extends Felino

/**
 * Clase Jaguar que extiende de Felino
 * @param color
 * @param sonido
 */

case class Jaguar(override val color: String, override val sonido: String) extends Felino

/**
 * Clase Gato extiene de Felino y tiene atibuto comida
 * @param comida
 * @param color
 * @param sonido
 */

case class Gato(val comida: String, override val color: String, override val sonido: String) extends Felino

object Leon {
  /**
   * Metodo apply es el contructor del objeto Leon
   * @param LonMelena
   * @param color
   * @param sonido
   * @return
   */
  def apply(LonMelena: Int, color: String, sonido: String) = new Leon(LonMelena: Int, color: String, sonido: String)
}

object Tigre {

  /**
   * Metodo apply es el contructor del objeto Tigre
   * @param color
   * @param sonido
   * @return
   */

  def apply(color: String, sonido: String) = new Tigre(color: String, sonido: String)
}

object Jaguar {

  /**
   * Metodo apply es el contructor del objeto Jaguar
   * @param color
   * @param sonido
   * @return
   */

  def apply(color: String, sonido: String) = new Jaguar(color: String, sonido: String)
}

object Gato {

  /**
   * Metodo apply es el contructor del objeto Gato
   * @param comida
   * @param color
   * @param sonido
   * @return
   */

  def apply(comida: String, color: String, sonido: String) = new Gato(comida: String, color: String, sonido: String)
}

