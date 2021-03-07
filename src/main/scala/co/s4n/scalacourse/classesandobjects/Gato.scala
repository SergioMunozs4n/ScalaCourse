package co.s4n.scalacourse.classesandobjects

/**
 *
 * @param nombre
 * @param color
 * @param comida
 */

class Gato(val nombre: String, val color: String, val comida: String)

object IO extends Gato(nombre = "IO", color = "Fawn", comida = "Churrus")

object Make extends Gato(nombre = "Mako", color = "Red", comida = "Lecho")

object Docker extends Gato(nombre = "Docker", color = "Blue", comida = "Cuido")

object VentaDeChurrus {

  /**
   *
   * @param cat
   * @return
   */

  def despachar(cat: Gato): Boolean = cat.comida match {
    case "Churrus" => true
    case _ => false
  }
}


