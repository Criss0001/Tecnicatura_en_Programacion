
package Clases;

public class Creacion_de_un_Objeto_mas {
    public static void main(String[] args) {
        Métodos persona1;
        persona1 = new Métodos();//Llamamos al constructor
        persona1.nombre = "Ariel"; //El valor headecimal normalmente comienza con 0x
        persona1.apellido = "Betancud";
        persona1.obtenerInformacion();
        
        Métodos persona2 = new Métodos();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona2);
        persona2.obtenerInformacion();
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordanini";
        persona2.obtenerInformacion();
    }
}
