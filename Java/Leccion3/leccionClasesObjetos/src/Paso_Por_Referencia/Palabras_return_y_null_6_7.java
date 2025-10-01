
package Paso_Por_Referencia;

import Clases.Métodos;

public class Palabras_return_y_null_6_7 {
    public static void main(String[] args) {
        Métodos persona1 = new Métodos();
        persona1.nombre = "Ester";
        System.out.println("persona1.nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+persona1.nombre);
        persona1 = cambiarElValor(persona1);
        Métodos persona2 = new Métodos();
        //Métodos persona2 = null;
        persona2 = cambiarElValor(persona2);
        System.out.println("El nuevo valor del objeto es: "+persona2.nombre);
    }
    
    public static void cambiarValor(Métodos persona){ //Paso por referencia
        persona.nombre = "María";
    }
    
    public static Métodos cambiarElValor(Métodos persona){
        if(persona == null){
            System.out.println("Valor de persona es invalido : NULL");
            return null;
        }
        else{
            persona.nombre = "Mónica";
            return persona;
        }
        
    }
}
