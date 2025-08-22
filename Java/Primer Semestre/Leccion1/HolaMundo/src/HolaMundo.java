
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

//          int num1 = 5, num2 = 4;
//          var solucion = num1 + num2;
//          System.out.println("solucion de la suma = " + solucion);
//          
//          solucion = num1 - num2;
//          System.out.println("solucion de la resta = " + solucion);
//          
//          solucion = num1 * num2;
//          System.out.println("solucion de la multiplicacion = " + solucion );
//          
//          solucion = num1 / num2;
//          System.out.println("solucion de la division = " + solucion);
//          
//          var solucion2 = 3.4D / num2;
//          System.out.println("solucion2 resultado de la division = " + solucion2 );
//          
//          solucion = num1 % num2; //Guarda el residuo entero de la division
//          System.out.println("solucion = " + solucion); // 5/4
//          
//          if (num1 % 2 == 0)
//              System.out.println("Es un número Par");
//          else
//              System.out.println("Es un número ");
/*
        int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2; //Una operación
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1; //
        System.out.println("varNum1 = " + varNum1);
        
        
//      -=   +=   /=   %=
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        varNum3 /=4;
        System.out.println("varNum3 = " + varNum3);
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);
        
    */
    /*
    // Operadores Unarios: Cambio de Signo
    var varA = 7;
    var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);//El resultado será un número negativo
        
    //Operador de Negación
    var varC = true; //Esta literal por default en Java es de tipo boolena
    var varD = !varC; //Aquí esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
    //Operadores Unarios de Incremento: Preincremento
    var varE = 9; //Se va modificando su valor
    var varF = ++varE; //Simbolo antes de la variable
    //Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE); //Se incremento en la unidad
        System.out.println("varF = " + varF); //Va a sumar uno
    
    //Postincremento (el simbolo va despues de la variable)
    var varG = 3;
    var varH = varG++; //Primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
    
    //Operadores Unarios de decremento
    var varI = 4;
    var varJ = --varI;
        System.out.println("varI = " + varI); //La varible ya esta con decremento
        System.out.println("varJ = " + varJ);
    
    //Postdecremento
    var varK = 8;
    var varL = varK--; //Primero el valor d ela variable, luego queda el decremento
        System.out.println("varK = " + varK); //Aquí va a decrementar en 1
        System.out.println("varL = " + varL);*/
    
    /*
    //Operadores de Igualdad y Relacionales
    var aNum = 5;
    var bNum = 9;
    var cNum = (aNum == bNum);
    System.out.println("cNum = " + cNum);
    
    var dNum = aNum != bNum;
    System.out.println("dNum = " + dNum);
    
    var cadenaA = "Hello";
    var cadenaB = "Bye Bye";
    var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        
    var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
    
    var gVar = aNum <= bNum; //> >= < <= == !
        System.out.println("gVar = " + gVar);
    if (aNum % 2 == 0){
        System.out.println("El numero es Par");
    } else {
        System.out.println("El numero es Impar");
    }
    
    var edad = 30;
    var adulto = 18;
    if(edad >= adulto) {
        System.out.println("Es mayor de edad");
    }
    else{
        System.out.println("Es menor de edad");
    }
    */
    
    /*
    //Operadores Condicionaless
    var valorA = 7;
    var valorMinimo = 0;
    var valorMaximo = 10;
    var respuesta = valorA >= 0 && valorA <= 10;
    
    if(respuesta)
            System.out.println("Esta dentro del rango establecido");
    else
            System.out.println("Esta fuera del rango establecido");
    
    var vacaciones = false;
    var diaLibre = false;
    if(vacaciones || diaLibre)
            System.out.println("Papá puede asistir al juego");
    else 
            System.out.println("Papá no puede asistir al juego de su hijo");
    */
    /*
    //Operador Ternario
    var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
    
    var numeroT = 4;
    resultadoT = (numeroT % 2 == 0) ? "Es Par" : "Es Impar";
        System.out.println("resultadoT = " + resultadoT);*/
    
    var x = 5;
    var y = 10;
    var z = ++x + y--;
        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 9
        System.out.println("z = " + z); // 16
    
        
    var solucionAritmetica = 4 + 5 * 6 / 3; // 4 + ((5 * 6) / 3) = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    
    solucionAritmetica = (4 + 5) * 6 / 3; // 4 + 5 = 9 * 6 = 54 / 3 = 18    
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    
   }

}
