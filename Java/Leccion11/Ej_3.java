package Leccion11;

import java.util.Scanner;

public class Ej_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            int producto = num1 * num2;
            System.out.println("Son iguales. Resultado de la multiplicación: " + producto);
        } else if (num1 > num2) {
            int resta = num1 - num2;
            System.out.println("El primero es mayor. Resultado de la resta: " + resta);
        } else {
            int suma = num1 + num2;
            System.out.println("El segundo es mayor. Resultado de la suma: " + suma);
        }
        sc.close();

    }
}
