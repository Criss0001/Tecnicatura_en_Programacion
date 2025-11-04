
package test;

import domain.Comenzamos_crear_una_nueva_carpeta_Lección6_estamos_en_herencia_parte_1_9_1;
import domain.Herencia_parte_2_9_2;
import domain.Solucion_de_la_tarea_9_6;
import java.util.Date;


public class Herencia_parte_2_9_2_Test {
    public static void main(String[] args) {
        Herencia_parte_2_9_2 empleado1 = new Herencia_parte_2_9_2();
        System.out.println("empleado1 = " + empleado1);
        
        Solucion_de_la_tarea_9_6 cliente1 = new Solucion_de_la_tarea_9_6(new Date(), true, "Bety", 'F', 32 , "9 de julio 1413");
        System.out.println("cliente1 = " + cliente1);
        
        Comenzamos_crear_una_nueva_carpeta_Lección6_estamos_en_herencia_parte_1_9_1 persona1 = new Comenzamos_crear_una_nueva_carpeta_Lección6_estamos_en_herencia_parte_1_9_1();
    }
}
