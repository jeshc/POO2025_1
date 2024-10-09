package ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas.francia;

import ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas.MetodoPago;

public class TarjetaCredito implements MetodoPago {
    private String numeroTarjeta;
    private String validez;
    private String nombreTitular;
    private String ccv;

    public TarjetaCredito() {
    }

    public TarjetaCredito(String numeroTarjeta, String validez, String nombreTitular, String ccv) {
        this.numeroTarjeta = numeroTarjeta;
        this.validez = validez;
        this.nombreTitular = nombreTitular;
        this.ccv = ccv;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getValidez() {
        return validez;
    }

    public void setValidez(String validez) {
        this.validez = validez;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "numeroTarjeta='" + numeroTarjeta + '\'' +
                ", validez='" + validez + '\'' +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", ccv='" + ccv + '\'' +
                '}';
    }

    @Override
    public boolean realizarPago(double monto) {
        System.out.println("El pago se realizo con TC");
        return true;
    }

    @Override
    public boolean realizarPago(double monto, int cuenta) {
        System.out.println("El pago se realizo con TC");
        return true;
    }
}
