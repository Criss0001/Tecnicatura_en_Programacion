
package PasoPorValor;

public class POO_Paso_por_valor_6_5 {
    public static void main(String[] arg) {
        var valorX = 20;
        System.out.println("valorX = " + valorX);
        cambioValor(valorX);//Solo le enviamos una copia
    }
    
    public static void cambioValor(int arg1){//Párametros por valor
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }
}
