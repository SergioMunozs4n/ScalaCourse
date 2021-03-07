package co.s4n.scalacourse.testingfunctions

import scala.math.pow
import scala.math.Pi

object FunctionsArea {
  /**
   * 1.Defina una funcion literal llamada areaTrianguloRectangulo que se encargue de calcular el ́area de un tríangulo rect́angulo.
   * Recibe los dos lados rectos.
   */
  val areaTrianguloRectangulo = (ladouno:Int, ladodos:Int) => {(ladouno*ladodos)/2}
  /**
   * 2.Defina una funcion literal con un tipo basado funciones valoresa llamada areaDeUnCirculo.
   */
  val areaDeUnCirculo = new Function1[Double,Double]{
    def apply(r:Double) :Double = {pow(r,2)*Pi}
  }

}

