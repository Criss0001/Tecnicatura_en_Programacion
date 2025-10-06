
package Operaciones;


public class Sobrecrga_de_métodos_6_1 {
    public static void main(String[] args){
    Creacion_de_Métodos_4_6 aritmetica1 = new Creacion_de_Métodos_4_6();
    aritmetica1.a = 3;
    aritmetica1.b = 7;
    aritmetica1.sumarNumeros();   
    
    int resultado = aritmetica1.sumarConRetorno();
    System.out.println("resultado = " + resultado);
    
    resultado = aritmetica1.sumarConArgumentos(12,26);
    System.out.println("Resultado usando argumentos = "+resultado);
    
    System.out.println("aritmetica1 a: " +aritmetica1.a);
    System.out.println("aritmetica1 b: " +aritmetica1.b);
    
    Creacion_de_Métodos_4_6 aritmetica2 = new Creacion_de_Métodos_4_6(5, 8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
    }
}
