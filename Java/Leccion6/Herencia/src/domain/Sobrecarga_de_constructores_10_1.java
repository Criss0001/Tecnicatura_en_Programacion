
package domain;

public class Sobrecarga_de_constructores_10_1 extends Comenzamos_crear_una_nueva_carpeta_Lección6_estamos_en_herencia_parte_1_9_1 {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //Es para incrementar
    
    //Cosntructor
    public Sobrecarga_de_constructores_10_1(){
        this.idEmpleado = ++Herencia_parte_3_clase_String_Builder_9_3.contadorEmpleados;
    }

    public Sobrecarga_de_constructores_10_1(String nombre, double sueldo) {
        //super(nombre);
        this(); //Estamos llamando desde aqui al constructor vacio(llamar a un constructor interno)
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Herencia_parte_3_clase_String_Builder_9_3{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
