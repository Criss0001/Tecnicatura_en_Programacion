package Leccion10;

public class Ej_5 {
       public static void main(String[] args) {
        boolean condicion = false;

        if (condicion) {
            System.out.println("Condición verdadera");
        } else {
            System.out.println("Condición falsa");
        }

        int num = 4;
        String numTxt;

        // Con switch
        switch (num) {
            case 1:
                numTxt = "uno";
                break;
            case 2:
                numTxt = "dos";
                break;
            case 3:
                numTxt = "tres";
                break;
            case 4:
                numTxt = "cuatro";
                break;
            default:
                numTxt = "inválido";
        }

        System.out.println("El número es " + numTxt);
    }
}
