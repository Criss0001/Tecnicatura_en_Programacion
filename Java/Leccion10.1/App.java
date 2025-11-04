package Leccion10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número del mes (1 a 12): ");
        int mes = scanner.nextInt();
        String estacion;

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Verano";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Otoño";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Invierno";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Primavera";
        } else {
            estacion = "Valor incorrecto";
        }

        System.out.println("La estación correspondiente es: " + estacion);

        scanner.close();
    }
}
