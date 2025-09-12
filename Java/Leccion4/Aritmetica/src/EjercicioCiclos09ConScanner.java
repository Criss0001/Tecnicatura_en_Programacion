
import java.util.Scanner;

/*
Ejercicio 9: Pedir el día, mes y año de una fecha e
indicara si la fecha es correcta. Suponiendo que 
todos los meses son de 30 días
*/
public class EjercicioCiclos09ConScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pedimos los datos
        System.out.println("Ingresá el día: ");
        int dia = sc.nextInt();
        
        System.out.println("Ingresá el mes: ");
        int mes = sc.nextInt();
        
        System.out.println("Ingrese el año: ");
        int año = sc.nextInt();
        
        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && año > 0) {
            System.out.println("La fecha es CORRECTA: " + dia + "/" + mes + "/" + año);
        } else {
            System.out.println("La fecha es INCORRECTA.");
        }
    }
}
