package co.s4n.scalacourse.classesandobjects

/**
 *
 * @param nombre
 * @param apellido
 * @param totalCarreras
 * @param carrerasTerminadas
 */

class Conductor (val nombre: String,val apellido: String, val totalCarreras : Int, val carrerasTerminadas: Int)

/**
 *
 * @param nombre
 * @param conductor
 */

class Escuderia (val nombre :String, val conductor: Conductor)
