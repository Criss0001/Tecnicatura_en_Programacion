//Hacer un programa que calcule e imprima la suma de tres calificaciones.
package ejercicio_2;
import java.util.Scanner;

public class Ejercicio_2 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,suma;
        
        System.out.println("Digite las tres clasificaciones; ");
        nota1 = Float.parseFloat(entrada.nextLine());
        nota2 = Float.parseFloat(entrada.nextLine());
        nota3 = Float.parseFloat(entrada.nextLine());
        
        suma = nota1 + nota2 + nota3;
        
        System.out.println("\nLa suma es: " +suma);
    }
    
}
