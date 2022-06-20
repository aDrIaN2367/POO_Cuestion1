
package ClasesyObjetos;


public class Main {

    public static void main(String [] args){
         //Metodos con ejemplo de sobrecarga
        Persona persona1 = new Persona("Manuel",21);
        persona1.correr();
        
        Persona persona2 = new Persona("73448893Y");
        persona2.correr(100);        
        
        //Metodos con ejemplo de sobreecritura
        Hombre hombre = new Hombre();
        Perro perro = new Perro();
        
        
        hombre.comer();
        perro.comer();
    }
}
