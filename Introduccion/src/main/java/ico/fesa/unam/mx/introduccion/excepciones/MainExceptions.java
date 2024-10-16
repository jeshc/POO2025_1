package ico.fesa.unam.mx.introduccion.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExceptions {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = 0;

        try {
            System.out.println("Dame un val entre 1 y 4");
            valor = teclado.nextInt();
            if (valor<1 && valor>4){
                throw new TipoOperadorException();
            }
            System.out.println("Uso la opcion");
            System.out.println("Tdos felices");
        }catch (InputMismatchException ime){
            System.out.println("Ingresa numeros en lugar de letra");
        }catch (TipoOperadorException toe){
            System.out.println(toe);
        }
        System.out.println("Fin del prog");


    }

}
