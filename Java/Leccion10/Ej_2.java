package Leccion10;

import java.util.Scanner;

public class Ej_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número del mes (1 a 12): ");
        int mes = scanner.nextInt();
        String estacion;

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Verano";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Otoño";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Invierno";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Primavera";
                break;
            default:
                estacion = "Valor incorrecto";
        }

        System.out.println("La estación correspondiente es: " + estacion);
        scanner.close();
    }
}
