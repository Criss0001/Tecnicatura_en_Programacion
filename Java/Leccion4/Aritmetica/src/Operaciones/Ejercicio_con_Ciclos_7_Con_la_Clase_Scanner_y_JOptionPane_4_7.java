package Operaciones;

import java.util.Scanner;
import javax.swing.JOptionPane;


/*
Ejercicio 7: Pedir números hasta que se introduzca un negativo
y calcular el promedio
*/

public class Ejercicio_con_Ciclos_7_Con_la_Clase_Scanner_y_JOptionPane_4_7 {
    public static void main(String[] args){
        //Scanner
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){ //Mientras el número no sea negativo
            suma += numero;
            conteo++;
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if(conteo==0){
        System.out.println("\nError, La división entre cero no existe");
        }
        else{
            promedio = (float)suma/conteo;
            System.out.println("\nEl promedio es: "+promedio);
        }
        // JOptionPane
        int numero1, conteo1 = 0, suma1 = 0;
        float promedio1 = 0;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero1 >= 0){ //Mientras el número no sea negativo
            suma1 += numero1;
            conteo++;
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
        if(conteo==0){
            JOptionPane.showMessageDialog(null, "La división entre cero no existe");
        }
        else{
            promedio1 = (float)suma1/conteo1;
            JOptionPane.showMessageDialog(null, "El promedio es: "+promedio1);
        }
    
    }
}
