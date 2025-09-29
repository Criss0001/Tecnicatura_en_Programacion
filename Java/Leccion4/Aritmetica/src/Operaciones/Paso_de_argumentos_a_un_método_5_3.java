
package Operaciones;

public class Paso_de_argumentos_a_un_método_5_3 {
    public static void main(String[] args){
        Creacion_de_Métodos_4_6 aritmetica1 = new Creacion_de_Métodos_4_6();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();   
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12,26);
        System.out.println("Resultado usando argumentos = "+resultado);
    }
}
