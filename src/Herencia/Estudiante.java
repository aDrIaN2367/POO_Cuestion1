
package Herencia;

//Hereda de clase Persona con la palabra extends
public class Estudiante extends Persona {
    private int IdEstudiante;
    private float notaFinal;

    
    //Constructor
    public Estudiante(String nombre, String apellido, int edad, int IdEstudiante,float notaFinal) {
        super(nombre, apellido, edad);
        this.IdEstudiante = IdEstudiante;
        this.notaFinal = notaFinal;
    }
        
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+"\nIdentificador Estudiante: "+IdEstudiante+"\nNota Final:  "+notaFinal);
    }
    
    
}
