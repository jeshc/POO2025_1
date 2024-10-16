package ico.fesa.unam.mx.introduccion.excepciones;


import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExcepciones {
    public static void main(String[] args) {
        // Entrada estandar System.in
        //Salida estandar  System.out
        System.out.println(System.getProperty("user.name"));
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int valor = 10;
        System.out.println("Ingresa un valor entero positivo");

        try {
            num = teclado.nextInt();
            System.out.println("dentro de try pre");
            System.out.println(valor / num);
            System.out.println("dentro de try pos");
        }catch(ArithmeticException em){
            System.out.println(em);
        }catch (InputMismatchException ime){
            System.out.println("No ingresaste un numero válido");
            JOptionPane.showMessageDialog(null, "No ingresaste un numero válido ");
        }catch (Exception e){
            System.out.println();
            System.out.println(e);
        }

        System.out.println("10 / 3= " + 10/3 );
        System.out.println("EL programa terminó correctamente");
    }
}
