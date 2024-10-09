package ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas;

import ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas.francia.TarjetaCredito;
import ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas.japon.Transferencia;
import ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas.mexico.PayPal;

import java.util.Scanner;

public class VentasDriver {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;
        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        Transferencia transferencia = new Transferencia();
        System.out.println("Elige tu metodo de pago:");
        System.out.print("0) Paypal\n1) Tarjeta credito\n2)Transferencia\nTeclea tu eleccion:");
        opcion = teclado.nextInt();
        switch (opcion) {
            case MetodoPago.PAYPAL:
                System.out.println("paypal");
                payPal.realizarPago(2213.9);
                break;
            case MetodoPago.TARJETA_CREDITO:
                System.out.println("TC");
                tarjetaCredito.realizarPago(2213.9);
                break;
            case MetodoPago.TRANSFERENCIA:
                System.out.println("Transferencia");
                transferencia.realizarPago(2213.9);
                break;
        }
    }
}
