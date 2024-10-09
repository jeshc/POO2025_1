package ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas;

public interface MetodoPago {
    public static final int PAYPAL = 0;
    public static final int TARJETA_CREDITO = 1;
    public static final int TRANSFERENCIA = 2;
    public static final int OTRO = 3;

    public boolean realizarPago(double monto);
    public boolean realizarPago(double monto, int cuenta);

}
