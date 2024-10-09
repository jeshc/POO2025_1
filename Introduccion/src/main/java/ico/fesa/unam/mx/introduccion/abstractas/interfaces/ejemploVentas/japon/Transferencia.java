package ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas.japon;

import ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas.MetodoPago;

public class Transferencia implements MetodoPago {
    private String clabe;
    private String nombre;

    public Transferencia() {
    }

    public Transferencia(String clabe, String nombre) {
        this.clabe = clabe;
        this.nombre = nombre;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Transferencia{" +
                "clabe='" + clabe + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean realizarPago(double monto) {
        System.out.println("introducir clabe de 18 digitos");
        System.out.println("introducir titular");
        System.out.println("Se realizo la tranferencia por $" + monto);
        return true;
    }

    @Override
    public boolean realizarPago(double monto, int cuenta) {
        System.out.println("introducir clabe de 18 digitos " + cuenta);
        System.out.println("introducir titular");
        System.out.println("Se realizo la tranferencia por $" + monto);

        return true;
    }
}
