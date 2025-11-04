
package domain;

public class Herencia_parte_3_clase_String_Builder_9_3 extends Comenzamos_crear_una_nueva_carpeta_Lección6_estamos_en_herencia_parte_1_9_1 {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //Es para incrementar
    
    //Cosntructor

    public Herencia_parte_3_clase_String_Builder_9_3(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Herencia_parte_3_clase_String_Builder_9_3.contadorEmpleados;
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


