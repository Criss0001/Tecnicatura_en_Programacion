
package domain;

public class Comenzamos_crear_una_nueva_carpeta_Lección6_estamos_en_herencia_parte_1_9_1 {
    //Atributos de herenecia
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //Constructor vacio: este es para crear objetos sin necesidad de inicializar
    //los atributos de la clase
    public Comenzamos_crear_una_nueva_carpeta_Lección6_estamos_en_herencia_parte_1_9_1(){ //Constructor 1
        
    }


    public Comenzamos_crear_una_nueva_carpeta_Lección6_estamos_en_herencia_parte_1_9_1(String nombre){ //Constructor 2
        this.nombre = nombre;   
    }

    public Comenzamos_crear_una_nueva_carpeta_Lección6_estamos_en_herencia_parte_1_9_1(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Comenzamos_crear_una_nueva_carpeta_Lecci\u00f3n6_estamos_en_herencia_parte_1_9_1{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }


    
    
    
    
}
