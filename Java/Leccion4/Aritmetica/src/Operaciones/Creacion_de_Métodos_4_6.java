
package Operaciones;

public class Creacion_de_Métodos_4_6 {
    //Atributos de la clase
    int a;
    int b;
    
    //El constructor es un método especial
    public Creacion_de_Métodos_4_6(){ //Constructor 1 vacio
        System.out.println("Se está ejecutando este constructor número 1");
    }
    //Estamos viendo lo que se llama sobrecarga de constructores
    public Creacion_de_Métodos_4_6(int a, int b){//Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando ete constructor número dos");
    }
    
    //Método
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = "+resultado);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b;
        //return a + b;
        return sumarConRetorno();
    }
}
