package Leccion11;

import java.util.Scanner;

public class Ej_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el total de la compra: $");
        double compra = sc.nextDouble();

        double totalPagar;

        if (compra > 100) {
            totalPagar = compra * 0.80;
            System.out.println("Se aplica un 20% de descuento.");
        } else {
            totalPagar = compra;
            System.out.println("No se aplica descuento.");
        }

        System.out.println("Total a pagar: $" + totalPagar);
        sc.close();
    }
}
