# ScalaCourse
Este repositorio aloja informacion de talleres del curso de Scala
# Ejecucion de pruebas :memo:
En el directorio src/test/scala/s4n/scalacourse se encontrara las pruebas unitarias de los talleres, esta esta divida de la siguiente manera:
* **Taller01:** Esta carpeta aloja las pruebas unitarias correspondiente a la implementacion de funciones para objetos FunctionsArea,FunctionsRecursion y FunctionsSalary.
* **Taller02_03:** Esta carpeta aloja las pruebas unitarias de los objetos Listas, Naturales y Arbol.
* **Taller04:** Esta carpeta aloja las pruebas unitarias de los objetos Comp,Comp2 y clases Persona y Forma
* **Taller05:** Esta carpeta aloja las pruebas unitarias correspondiente a la clase Color, objeto Draw y traits Felino y Forma.
* **Taller06:** Esta carpeta aloja las pruebas unitarias del Objeto lista utilizando los 28 ejercicios de programacion funcional.





# Paquetes Main :package:
En el directorio src/main/scala/s4n/scalacourse se podra encontrar los paquetes creados para dividir objetos, clases y traits:

* **ClassesAndObjects** se podra encontrar los objetos creados la cual fue dividido dependiendo de su funcionalidad en el caso de las Comp. Conductor, Contador, Forma, Gato, Libro y Prueba.

  * Algunas funciones encontradas en el objeto Comp son:

    * **Cuadrado:** Se encarga de tomar un parametro Double, retornando el cuadrado de un valor.
    * **Cubo:** Se encarga de tomar un parametro Double y retornar el cubo de un valor teniendo en cuenta el resultado de la funcion Cuadrado.

  * Algunas funciones encontradas en el la clase Contador y Sumador son:

    * **Incr:** Se encarga de retornar un objeto de tipo Contador +.
    * **decr:** Se encarga de retornar un objeto de tipo Contador -.
    * **Ajuste:** Se encarga de tomar una objeto de tipo Sumador y retorna un Contador.
    * **Adicionar:** Se encarga de recibir un valor y se lo suma al monto de la clase.

  * La funcion encontrada en el la clase VentaChurrus es:

    * **Despachar:** Método que devuelve true si la comida favorita de un gato es "Churrus".
    
* **InmutableLists** se podra encontrar los objetos creados la cual fue dividido dependiendo de su funcionalidad en el caso de las listas List y naturales Nat.

  * Algunas funciones encontradas en el objeto List son:

    * **Take:** Se encarga de tomar dos parametros, retornando una lista con los primeros n valores existentes.
    * **Split:** Se encarga de tomar dos parametro y retornar dos listas, la primera con los primero n valores existentes y la segunda con los ultimos valores despues de n.
    * **Init:** Se encarga de tomar una lista como parametro y retornar los valores iniciales exceptuando el ultimo.
    * **Zip:** Se encarga de tomar dos listas como parametros y fusionarlos en una lista de pares del mismo tamaño.
    * **Unzip:** Se encarga de tomar una lista de tuplas como parametro y separalas en dos listas distintas.
    * **Reverse:** Se encarga de tomar una lista como parametro y retornar una version invertida de la misma.
    * **Intersperse:** Se encaga de entremezclar un valor entre los elementos originales de una lista.
    * **Concat:** Se encarga de tomar una lista de lista valores de un tipo A y la transforma en una lista de valores tipo A.

* **Traits**
    * **Felino**
        * **Clases**
            * **Tigre**
            * **Leon**
            * **Jaguar**
            * **Gato**
    * **Forma**
        * **Rectangular**
            * **Clases**
                * **Felino**
                * **Forma**
                * **Rectangular**

* **Color**
    * **Objetos**
        * **Color**
        * **Rojo**
        * **Rosa**
        * **Amarillo**

# Caracteristicas de sistema :wrench:
Para la elaboracion de este proyecto se baso en las siguientes caracteristicas:
* **sbt version: 1.4.7**
* **Scala version: 2.13.4**
* **IntelliJ IDEA**

# Implementacion del proyecto 🚀
``` 
$ sbt console
$ run
```

# Autor :bookmark:
Sergio Esteban Muñoz Baron