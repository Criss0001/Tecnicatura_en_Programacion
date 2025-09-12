
import javax.swing.JOptionPane;

/*
Ejercicio 9: Pedir el día, mes y año de una fecha e
indicara si la fecha es correcta. Suponiendo que 
todos los meses son de 30 días
*/

public class EjercicioCiclos09ConJOptionPane {
    public static void main(String[] args) {
        //Pedimos datos
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes:"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));
        
        //Verificamos que la fecha sea válida
        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && año > 0) {
            JOptionPane.showMessageDialog(null, 
                "La fecha es CORRECTA: " + dia + "/" + mes + "/" + año);
        } else {
            JOptionPane.showMessageDialog(null, "La fecha es INCORRECTA.");
        }
    }
}
