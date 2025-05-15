
import java.util.Scanner;




public class HolaMundo {

    public static void main(String[] args) {
        /*System.out.println("Hola Mundo desde Java");
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programación";
        System.out.println(miVariableCadena);
         */
        //Var - inferencia de tipos en Java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableCadena2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab
        //Para ejecutar Shift + F6 es la tecla para mayuscula
        //Reglas para definir una variable en Java
         */
        /* var usuario = "Cristian";
        var titulo = "Técnico";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(a + b);
        //Ejercicio: Caracteres Especiales con Java
        var nombre = "Cristian";
        System.out.println("\nNueva linea: \n" + nombre); //Diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre); //Tabulador un espacio para centrar
        System.out.println("\t\t.:MENÚ:."); 
        System.out.println("Retroceso: \b\b"+nombre);//Caracter de Retroseso
        System.out.println("Comillas simples: \'"+nombre+"\'");
        System.out.println("Comillas Dobles: \""+nombre+"\"");
        
        
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);
        */
        /*
        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: "+ Byte.MIN_VALUE);
        System.out.println("Vamor máximo del Byte: "+ Byte.MAX_VALUE);
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: "+ Short.MIN_VALUE);
        System.out.println("Valor máximo del Short: "+ Short.MAX_VALUE);
        
        int numeroEnteroInt = 2147483647;
        System.out.println("numeroEnteroInt = " + numeroEnteroInt);
        System.out.println("Valor minimo de Int: "+ Integer.MIN_VALUE);
        System.out.println("Valor máximo de Int: "+ Integer.MAX_VALUE);
        
        long numEnteroLong = 9223372036854775807;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del Long: "+ Long.MIN_VALUE);
        System.out.println("Valor máximo del Long: "+Long.MAX_VALUE);
        */
        
        /*float numFloat = (float)3.4028235E38F; //Indica que es Float con F al final
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo de Float: "+ Float.MIN_VALUE);
        System.out.println("Valor máximo de Float: " + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo de Double: "+ Double.MIN_VALUE);
        System.out.println("Valor máximo de Double: "+ Double.MAX_VALUE);
        */
        
        /*//Inferencia de tipos de var y tipos primitivos
        var numEntero = 20; //Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0; //Automaticamente con el punto se transforma en tipo doble
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numFloat = " + numFloat);*/
        /*
        //Tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //Indicamos a Java la asignación con el código unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbol = '$'; //Un caracter especial, podemos copiar y pegar desde uncode
        System.out.println("varCaracterSimbol = " + varCaracterSimbol);
        
        var varCaracter1 = '\u0024'; //Indicamos a Java la asignación con el código unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36; //Valor Entero y le asigna un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbol1 = '$'; //Un caracter especial, podemos copiar y pegar desde uncode
        System.out.println("varCaracterSimbol1 = " + varCaracterSimbol1);

        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'f';
        System.out.println("caracterChar = " + caracterChar);
        
        
        //Tipos primitivos tipos booleanos
        var varBool = false;
        System.out.println("varBool = " + varBool);
        
        if(varBool == true){
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es Roja");
        }
    
        //Algoritmo: ¿Es mayor de edad?
        var edad = 18; //Literal tener presente la inferencia de tipos
        //var adulto = edad >= 18; //Esta es una expresión booleana
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
        */
//        var edad = Integer.parseInt("20");
//        System.out.println("edad = " + (edad + 1));
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//        
//        //Pedir un valor
//        var entrada = new Scanner(System.in);
//        System.out.println("Digite su edad");
//        edad = Integer.parseInt( entrada.nextLine());
//        System.out.println("edad = " + edad);
//        
//        //Conversión de tipos primitivos en Java Parte 2
//        var edadTexto = String.valueOf(10);
//        System.out.println("edadTexto = " + edadTexto);
//        
//        var fraseChar = "programadores".charAt(4);
//        System.out.println("fraseChar = " + fraseChar);
//        
//        System.out.println("Digite un caracter: ");
//        fraseChar = entrada.nextLine().charAt(0);
//        System.out.println("fraseChar = " + fraseChar);
        
        


        
        
        
        
    }

}
