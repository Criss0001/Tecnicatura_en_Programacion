package Leccion09;

import java.util.Scanner;

public class App {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera calificación: ");
        double cal1 = sc.nextDouble();

        System.out.print("Ingrese la segunda calificación: ");
        double cal2 = sc.nextDouble();

        System.out.print("Ingrese la tercera calificación: ");
        double cal3 = sc.nextDouble();

        double suma = cal1 + cal2 + cal3;

        System.out.println("La suma de las tres calificaciones es: " + suma);

        sc.close();
    }
}

