
package test;

import domain.Contexto_estatico_práctica_Parte_1_8_5;

public class Contexto_estático_práctica_Parte_2_Ejecuitar_con_debug_File_8_6 {
    private int contador;
    
    public static void main(String[] args) {
        Contexto_estatico_práctica_Parte_1_8_5 persona1 = new Contexto_estatico_práctica_Parte_1_8_5("Ariel");
        System.out.println("persona1 = " + persona1);
        Contexto_estatico_práctica_Parte_1_8_5 persona2 = new Contexto_estatico_práctica_Parte_1_8_5("Naty");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
        //this.contador = 10; //No se puede referenciar desde un contexto éstatico
        Ejercicio_con_contexto_estatico_8_7 peronaP1 = new Ejercicio_con_contexto_estatico_8_7();
        System.out.println(personaP1.getCotador());
    }
    static public void imprimir(Contexto_estatico_práctica_Parte_1_8_5 persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Contexto_estatico_práctica_Parte_1_8_5("Liliana"));
        return this.contador;
    }
}
