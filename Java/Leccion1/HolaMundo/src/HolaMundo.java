
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
        
        float numFloat = (float)3.4028235E38F; //Indica que es Float con F al final
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo de Float: "+ Float.MIN_VALUE);
        System.out.println("Valor máximo de Float: " + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo de Double: "+ Double.MIN_VALUE);
        System.out.println("Valor máximo de Double: "+ Double.MAX_VALUE);
        

    }

}
