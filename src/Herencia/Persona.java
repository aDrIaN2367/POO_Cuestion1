
package Herencia;

//¿Java admite herencia múltiple?
//Cuando una clase se extiende a más de una clase, se llama herencia múltiple. 
//Por ejemplo: la clase C extiende las clases A y B, por lo que este tipo de herencia 
//se conoce como herencia múltiple. Java no permite la herencia múltiple.
//Java no permite la herencia múltiple a evitar la ambigüedad causado por ella.
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    //constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
}
