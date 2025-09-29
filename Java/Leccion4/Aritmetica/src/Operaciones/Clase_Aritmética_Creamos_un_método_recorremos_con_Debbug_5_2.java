
package Operaciones;

public class Clase_Aritmética_Creamos_un_método_recorremos_con_Debbug_5_2 {
    public static void main(String[] args) {
        Creacion_de_Métodos_4_6 aritmetica1 = new Creacion_de_Métodos_4_6();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();  
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
    }
}
