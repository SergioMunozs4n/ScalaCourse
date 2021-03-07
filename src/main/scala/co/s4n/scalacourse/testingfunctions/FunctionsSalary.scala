package co.s4n.scalacourse.testingfunctions


object FunctionsSalary {
  /**
   * 3. Defina  una  funcion  literal  llamada calSalario que  reciba  dos parametros  de  tipo Double(devengado  y  deducciones)
   * y  que  retorna  el  valor clasico del salario de una persona: (devengado - deducciones)
   */

  val calSalario = (devengado:Double,deducciones:Double) => {if (devengado < deducciones) "No es posible" else (devengado-deducciones) }

  /**
   * 4. Defina una funcion literal llamada calSalarioBono que reciba dos parametros de tipo Double(devengado y deducciones)
   * y calcule el salariocon el siguiente valor. (devengado * 1,10 - deducciones)
   */

  val calSalarioBono = (devengado:Double,deducciones:Double) => {(devengado+(devengado*bono))-deduccion}

  /**
   * 5. Defina una funcion llamada compSalario que recibe tres parametros: el primero una funcion de tipo (Double,Double)=>Double
   * y las otras dos son:devengado y deducciones. Prueba esta funcion pasado las dos funciones anteriores calSalario y calSalarioBono.
   */

  def compSalario (f:(Double,Double) => Double,a:Double,b:Double) = f(a,b)

  /**
   * 6. Defina una funcion llamada genCalSalarioBono esta funcion se encarga de generar funciones que computan diferente bonos. La funcion:
   */

  def genCalSalarioBono (bono:Double): (Double,Double) => Double = (devengado:Double,deduccion:Double) => {(devengado+(devengado*bono))-deduccion}

  /**
   * 7. Utilizando la funcion generadora de funciones genCalSalarioBono cree la funcion literal calSalario5 que da un bono del 5 %.
   */

  val calSalario5 = genCalSalarioBono(0.05)

  /**
   * 8. Utilizando la funcion generadora de funciones genCalSalarioBono cree la funcion literal calSalario20 que da un bono del 20 %.
   */

  val calSalario20 = genCalSalarioBono(0.20)

  /**
   * 9. Declare una funcion calSalarioBonoClausura que reciba dos parametros (devengados y deducciones)
   * y que aplique la siguiente formula: (devengado x bono - deducciones)
   */

  val bono = 0.05
  def calSalarioBonoClausura(devengado:Double,deduccion:Double) = (devengado+(devengado*bono))-deduccion

  /**
   * 10. Utilizando la funcion compSalario aplique la funcion utilizando como primer parametro calSalarioBonoClausura
   * y calculado varios salarios diferentes.
   */

  val devengado = 1000
  val deduccion = 2000
  compSalario(calSalarioBonoClausura,devengado,deduccion)

  /**
   * 11. Utilizando la funcion genCalSalarioBono cree una funcion literal calCalario15
   * que se obtiene a traves de la aplicacion parcial de genCalSalarioBono con un valor 0,15
   */

  def calCalario15():(Double, Double) => Double = {
    genCalSalarioBono(0.15)
  }

  /**
   * 12. Utilizando la funcion genCalSalarioBono cree una funcion literal calCalario100
   * que se obtiene a traves de la aplicacion parcial de genCalSalarioBono con un valor 2,00.
   */

  val calCalario100: (Double, Double) => Double = genCalSalarioBono(2.00)

  /**
   * 13. Utilizando currificacion defina una funcion genCalSalarioBono2 donde el ́ultimo parametro (el currificado)
   * es el valor del bono y los dos primeros parametros son: el devengado y la deduccion.
   */

  def genCalSalarioBono2(devengado:Double,deduccion:Double):(Double) => Double = {
    (bono: Double) => ((devengado*bono)-deduccion)
  }

  /**
   * 14. Utilizando la funcion genCalSalarioBono2 cree una funcion literalcalCalario25
   * que se obtiene a traves de la aplicacion currificada de genCalSalarioBono2 con un valor 0,25
   */
  //14-Utilizando la funcion GenCalSalarioBono2 cree una funcion literal calCalario25
  val calCalario25 = genCalSalarioBono2(_,0.25)

}
