package ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejercicioVehiculos;

public class Coche extends VehiculoTerrestre {
    private String marca;
    private String modelo;

    public Coche() {
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void frenar() {
        System.out.println("Frenado");
    }

    @Override
    public String obtenerTipoCombustible() {
        return Math.random() < 0.5? "Gasolina":"Diesel";
    }

    @Override
    public void cabiarMneumatico() {
        System.out.println("cambiando neumatico");
    }

    @Override
    public void encenderLuces() {
        System.out.println("Encender luces");
    }
}
