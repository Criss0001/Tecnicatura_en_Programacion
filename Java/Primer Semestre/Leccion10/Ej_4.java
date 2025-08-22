package Leccion10;

import java.util.Scanner;

public class Ej_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número entre 0 y 10: ");
        int calificacion = Integer.parseInt(scanner.nextLine());

        switch (calificacion) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("F");
                break;
            default:
                System.out.println("Fuera de rango");
                break;
        }
        scanner.close();
    }
}
