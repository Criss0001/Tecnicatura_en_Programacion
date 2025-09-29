
package Operaciones;

public class Engineer_Java_Memoria_stack_y_heap_tratamiento_de_residuos_6_3 {
    public static void main(String[] args){
        var a = 10; //Variable local(solo interna)
        int b = 7; //Memoria stack
        miMetodo(); //Llamamos al método nuevo
    Creacion_de_Métodos_4_6 aritmetica1 = new Creacion_de_Métodos_4_6();
    aritmetica1.a = 3;
    aritmetica1.b = 7;
    aritmetica1.sumarNumeros();  
    //Para almacenar un objeto o los atributos se utiliza la memoria heap    
    int resultado = aritmetica1.sumarConRetorno();
    System.out.println("resultado = " + resultado);
    
    resultado = aritmetica1.sumarConArgumentos(12,26);
    System.out.println("Resultado usando argumentos = "+resultado);
    
    System.out.println("aritmetica1 a: " +aritmetica1.a);
    System.out.println("aritmetica1 b: " +aritmetica1.b);
    
    Creacion_de_Métodos_4_6 aritmetica2 = new Creacion_de_Métodos_4_6(5, 8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
        //aritmetica1 = null; nunca utilixar esto, no se debe hacer
        //System.gc(); método para limpiar residuos,es pesado,no utilizar
    }
    
    public static void miMetodo(){
        int a = 10;
        System.out.println("Aquí hay otro método");
    }
}
