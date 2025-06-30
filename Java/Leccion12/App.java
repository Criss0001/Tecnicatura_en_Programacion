package Leccion12;

import java.util.Scanner;

// Ejercicio 1: Construir un programa que, dado un número total de
// horas, devuelve el número de semanas, días y horas equivalentes.
// Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,
// 6 días y 16 horas

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el total de horas: ");
        int totalHoras = sc.nextInt();

        int semanas = totalHoras / (7 * 24);
        int dias = (totalHoras % (7 * 24)) / 24;
        int horas = totalHoras % 24;

        System.out.println(totalHoras + " horas equivalen a:");
        System.out.println(semanas + " semanas, " + dias + " días y " + horas + " horas.");
        sc.close();
    }

}