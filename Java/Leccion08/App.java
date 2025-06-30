package Leccion08;

public class App {
    public static void main(String[] args) {

        //  Ejercicio 1 
        long perimetro;
        long area;
        long alto = 8;
        long ancho = 14;

        perimetro = 2 * (alto+ancho);
        area = alto * ancho;

        System.out.println("El perimetro es " + perimetro + " cm");
        System.out.println("El área es " + area + " cm");


        // Ejercicio 2

        int firstNum = 10;
        int secondNum = 5;

        boolean isBigger = firstNum >= secondNum ?  true : false;

        if(isBigger)
            System.out.println("El primer número " + firstNum + " es el más grande");
        else
            System.out.println("El segundo número " + secondNum + " es el más grande");
    }
}