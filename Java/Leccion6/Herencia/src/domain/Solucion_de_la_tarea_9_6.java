
package domain;

import java.util.Date;


public class Solucion_de_la_tarea_9_6 extends Comenzamos_crear_una_nueva_carpeta_Lección6_estamos_en_herencia_parte_1_9_1{
    //Atributos
    private int idCliente;
    private Date fechaRegistro; //importar la clase Date
    private boolean vip; //Very important person
    private static int contadorCliente; //Tipo estatico
    
    //Constructos
    public Solucion_de_la_tarea_9_6(Date fechaRegistro, boolean vip, String nombre,
            char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Solucion_de_la_tarea_9_6.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }


    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
