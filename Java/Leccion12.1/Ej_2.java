package Leccion12;

import java.util.Scanner;

// Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,
// el usuario debe ingresar el valor de a y el valor de b.
// Formula: (a+b)2=a2+b2+2*a*b

public class Ej_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = sc.nextDouble();

        double resultado = Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b;
        System.out.println("resultado: " + resultado);
        sc.close();
    }
}
