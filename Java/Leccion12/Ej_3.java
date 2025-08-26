package Leccion12;

import java.util.Scanner;

// Ejercicio 3: La calificacion final de un estudiante de informática
// se calcula con base a las calificaciones de cuatro aspectos de su
// rendimiento académico: participación, primer examen parcial, segundo
// examen parcial y examen final. Sabiendo que las calificaciones anteriores
// entran a la calificación final con ponderaciones de 10%, 25%, 25%
// y 40%, Hacer un programa que calcule e imprima la calificación final
// obtenida por un estudiante. 
// Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,
// la calificación final.

public class Ej_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la calificación de participación (10%): ");
        double participacion = sc.nextDouble();

        System.out.print("Ingrese la calificación del primer parcial (25%): ");
        double parcial1 = sc.nextDouble();

        System.out.print("Ingrese la calificación del segundo parcial (25%): ");
        double parcial2 = sc.nextDouble();

        System.out.print("Ingrese la calificación del examen final (40%): ");
        double examenFinal = sc.nextDouble();

        double notaFinal = (participacion * 0.10) + (parcial1 * 0.25) +
                (parcial2 * 0.25) + (examenFinal * 0.40);

        System.out.println("La calificación final es: " + notaFinal);
        sc.close();
    }

}
