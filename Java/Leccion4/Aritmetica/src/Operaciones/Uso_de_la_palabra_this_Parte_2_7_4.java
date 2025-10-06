
package Operaciones;

public class Uso_de_la_palabra_this_Parte_2_7_4 {
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
        Persona persona = new Persona("Ariel", "Betancud");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: "+persona.nombre);
        System.out.println("persona apellido: "+persona.apellido);
    }
    //Modularidad creamos un nuevo método
    public static void miMetodo(){
        int a = 10;
        System.out.println("Aquí hay otro método");
    }
}
//Creamos una nueva clase
class Persona1{
    String nombre;
    String apellido;
    
    Persona1(String nombre, String apellido){ //Constructor
        super(); //Llamada al constructor de la clase Padre object
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Object persona usando this: "+this);
    }   
}

class Imprimir{
    public Imprimir(){
        super(); //el constructor de la clase padre,para resercar memoria
    }
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: "+persona);
        System.out.println("Impresión del objeto actual (this): "+this);
    }
}