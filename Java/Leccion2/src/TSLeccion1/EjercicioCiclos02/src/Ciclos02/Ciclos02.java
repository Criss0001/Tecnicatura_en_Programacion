/*
Ejercicio 2: Leer un núnmero e indicar si es positivo o 
negativo. El proceso se repetira hasta que se introduzca
un cero
Hacer este ejercicio con la clase Scanner,
luego hacerlo nuevamente con la clase JOptionPane
*/
package Ciclos02;
import javax.swing.JOptionPane;
public class Ciclos02 {
        public static void main(String[] args) {
            /* EJERCICIO HECHO COMO TAREA POR MI
            int numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
            while(numero != 0){
                if(numero > 0){
                    System.out.println("El número "+numero+" es POSITIVO");
                }
                else{
                    System.out.println("El número "+numero+" es NEGATIVO");
                }
            System.out.println("Digite otro número: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero "+numero+" Es distinto a cero"));
        }
        System.out.println("El número "+numero+" finaliza el programa");
        */
            var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            while(numero != 0){
                if(numero > 0){
                    JOptionPane.showMessageDialog(null, "El número"+numero+" es POSITIVO");
                }
                else{
                    JOptionPane.showMessageDialog(null, "El número"+numero+" es NEGATIVO");
                }
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "+numero+" Es distinto a cero"));
            }
            JOptionPane.showMessageDialog(null, "El número "+numero+" finaliza el programa");
    }
}
