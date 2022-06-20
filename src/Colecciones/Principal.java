
//Tipo LISTA: Puede almacenar valores duplicados, 
//Mantiene el orden de inserción. 
//Permite múltiples valores nulos, 
//También podemos leer un determinado valor por índice.
//- ArrayList no sincronizado, clase basada en arreglos de clases. 
//- LinkedList no sincronizado, doblemente enlazado. 
//- El vector está sincronizado, el hilo es seguro.

//Tipo PILA: Solo puede almacenar valores únicos, y no mantiene el orden. 
//- HashSet puede tener null, el orden no está garantizado.
//- LinkedHashSet puede tener null y mantiene el orden.
//- TreeSet ordena el orden y no acepta null.

//Tipo COLA:Acepta duplicados, 
//No tiene número de índice, 
//Primero en primer lugar nuestro pedido.

//Tipo TABLA: es un (formato clave-valor) y las teclas son siempre únicas, y el valor se puede duplicar.
//- HashTable no tiene clave nula, sychronized(thread-safe). 
//- LinkedHashMap puede tener clave nula, mantiene el orden. 
//- HasHMap puede tener clave nula, el orden no está garantizado.
//- TreeMap no tiene clave nula y las claves están ordenadas.

package Colecciones;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Principal {
    Collection<Integer> fibonacci = (Collection<Integer>) new Arraylist<Integer>();
     List<String> list = Arrays.asList("Marta", "Rodolfo");
}
