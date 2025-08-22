package Leccion09;

import java.util.Scanner;

public class Ej_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dolares que tiene Guillermo: ");
        double guillermo = scanner.nextDouble();

        double luis = guillermo / 2;
        double juan = (guillermo + luis) / 2;

        double total = guillermo + luis + juan;

        System.out.println("Guillermo tiene: $" + guillermo);
        System.out.println("Luis tiene: $" + luis);
        System.out.println("Juan tiene: $" + juan);
        System.out.println("El total entre los tres es: $" + total);

        scanner.close();

    }
}
