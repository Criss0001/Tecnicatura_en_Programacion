package Leccion11;

import java.util.Scanner;

public class Ej_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera calificación (1-100): ");
        double nota1 = sc.nextDouble();

        System.out.print("Ingrese la segunda calificación (1-100): ");
        double nota2 = sc.nextDouble();

        System.out.print("Ingrese la tercera calificación (1-100): ");
        double nota3 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 70) {
            System.out.println("El alumno APRUEBA con promedio de: " + promedio);
        } else {
            System.out.println("El alumno REPRUEBA con promedio de: " + promedio);
        }
        sc.close();
    }
}