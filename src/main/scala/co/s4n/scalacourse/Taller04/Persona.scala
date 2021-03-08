package co.s4n.scalacourse.Taller04

  /**
   * Clase Persona que tiene como atributos nombre y apellido.
   * @param nombre
   * @param apellido
   */

class Persona(val nombre: String, val apellido : String) {
  override def toString = s"$nombre $apellido"
}

object Persona{

  /**
   * Metodo apply es el constructor del objeto Persona.
   * @param nombreC
   * @return
   */

  def apply(nombreC: String): Persona = {
    val n = nombreC.split(" ")
    new Persona(n(0),n(1))
  }
}

  /**
  * Clase Director que tiene como atributos nombre, apellido y año de nacimiento.
  * @param nombre
  * @param apellido
  * @param nacimiento
  */

class Director (val nombre: String, val apellido: String, val nacimiento: Int){

    /**
     * Metodo copy toma los valores del contructor y genera una nueva instancia.
     * @param nombre
     * @param apellido
     * @param nacimiento
     * @return
     */

  def copy(nombre: String = this.nombre, apellido: String = this.apellido, nacimiento: Int = this.nacimiento): Director = new Director(nombre, apellido, nacimiento)

  override def toString: String = s"$nombre $apellido"

}

  /**
   * Clase Pelicula tiene como atributos nombre, presentacion, rangoIMDB, director
   * @param nombre
   * @param presentacion
   * @param rangoIMDB
   * @param director
   */

class Pelicula (val nombre: String, val presentacion: Int,
                val rangoIMDB: Double, val director: Director){

    /**
     * Metodo directorEda retorna el resultado de operar la edad del director al momento de la presentacion de la pelicula
     * @return Int
     */

  def directorEdad: Int = presentacion - director.nacimiento

    /**
     * Metodo esDirigidaPor retorna un valor booleano a base de un parametro de tipo director
     * @param director
     * @return
     */

  def esDirigidaPor (director:Director): Boolean = this.director == director

    /**
     * Metodo copy toma los valores del contructor y genera una nueva instancia.
     * @param nombre
     * @param presentacion
     * @param rangolMDB
     * @param director
     * @return
     */

  def copy(nombre: String = this.nombre, presentacion: Int = this.presentacion,
           rangolMDB: Double = this.rangoIMDB, director: Director = this.director): Pelicula = new Pelicula(nombre, presentacion, rangolMDB, director)

  override def toString = s"$nombre $presentacion $rangoIMDB ${director.toString}"
}

object Director {

  /**
   * Metodo apply es el constructor del objeto Director.
   * @param nombre
   * @param apellido
   * @param nacimiento
   * @return
   */

  def apply(nombre: String, apellido: String, nacimiento: Int) = new Director(nombre,apellido,nacimiento)

  /**
   * Metodo esMayor retorna un director operando la comparacion de edad junto con otro
   * @param dirUno
   * @param dirDos
   * @return
   */

  def esMayor(dirUno: Director, dirDos: Director): String = {
    if ((dirUno.nacimiento) < (dirDos.nacimiento)) dirUno.toString else dirDos.toString
  }

}

object Pelicula {

  /**
   * Metodo apply es el constructor del objeto Pelicula.
   * @param nombre
   * @param presentacion
   * @param rangoIMDB
   * @param director
   * @return
   */

  def apply(nombre: String, presentacion: Int, rangoIMDB: Double, director: Director) = new Pelicula(nombre, presentacion, rangoIMDB, director)

  /**
   * Metodo mejorCalificada retorna una Pelicula con mayor rangoIMDB que otra
   * @param pelUno
   * @param pelDos
   * @return
   */

  def mejorCalificada(pelUno: Pelicula, pelDos: Pelicula ): Pelicula = {
    if (pelUno.rangoIMDB > pelDos.rangoIMDB) pelUno else pelDos
  }

  /**
   * Metodo mayorDirectorEnElTiempo retorna un Director con mayor edad al momento de presentacion de pelicula que otro Director
   * @param pelUno
   * @param pelDos
   * @return
   */

  def mayorDirectorEnElTiempo(pelUno: Pelicula, pelDos: Pelicula ): Director = {
    if (pelUno.directorEdad > pelDos.directorEdad) pelUno.director else  pelDos.director
  }
}






