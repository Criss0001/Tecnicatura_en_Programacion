package Paso_Por_Referencia;
import Clases.Métodos;
public class POO_Paso_Por_Referencia {
    public static void main(String[] args) {
        Métodos persona1 = new Métodos();
        persona1.nombre = "Ester";
        System.out.println("persona1.nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+persona1.nombre);
    }
    
    public static void cambiarValor(Métodos persona){ //Paso por referencia
        persona.nombre = "María";
    }
}
