package ico.fesa.unam.mx.introduccion.arreglos;

public class Ejemplos {
    public static void main(String[] args) {
        // Declaración de un arreglo de enteros
        int[] numeros = new int[5];
        // Asignación de valores al arreglo
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        // Imprimir los valores del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
        // Declaración de un arreglo de cadenas
        String[] nombres = new String[3];
        // Asignación de valores al arreglo
        nombres[0] = "Juan";
        nombres[1] = "Pedro";
        nombres[2] = "María";
        // Imprimir los valores del arreglo
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombres[" + i + "] = " + nombres[i]);
        }


        //
        double[] existencias  = new double[5];
        existencias[0] =100;
        existencias[1] =23;
        existencias[2] =50;
        existencias[3] =66;
        existencias[4] =1000;
        int[] iExist = new int[5];
        for (int i = 0; i < existencias.length; i++) {
            System.out.println("Double["+i+"] = " + existencias[i]);
        }

        for (int i = 0; i < existencias.length; i++) {
            iExist[i] = (int)existencias[i];
        }
        System.out.println("-.-.-.-.-.-.-");

        for (int i = 0; i < existencias.length; i++) {
            System.out.println("Double["+i+"] = " + iExist[i]);
        }


        String[] numeros2 = new String[5];
        numeros2[0] = "1";
        numeros2[1] = "33";
        numeros2[2] = "44";
        numeros2[3] = "43";
        numeros2[4] = "5656566";

        int cantidad = Integer.parseInt(numeros2[2]);
        System.out.println(cantidad+1);





    }
}
