package ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejercicioVehiculos;

public class Helicoptero extends VehiculoAereo{
    private int numeroHelices;
    private boolean deRescate;

    @Override
    public void desplegarAleron() {
        System.out.println("Desplegando alerones");
    }

    @Override
    public void despegar() {
        System.out.println("Despagando");
    }

    public Helicoptero() {
    }

    public Helicoptero(int numeroHelices, boolean deRescate) {
        this.numeroHelices = numeroHelices;
        this.deRescate = deRescate;
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    public boolean isDeRescate() {
        return deRescate;
    }

    public void setDeRescate(boolean deRescate) {
        this.deRescate = deRescate;
    }

    @Override
    public String toString() {
        return "Helicoptero{" +
                "numeroHelices=" + numeroHelices +
                ", deRescate=" + deRescate +
                '}';
    }


    @Override
    public void acelerar() {
        System.out.println("Acelerando vehiculo aereo");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando vehiculo aereo");
    }

    @Override
    public String obtenerTipoCombustible() {
        return Math.random() < 0.5? "Turbosina":"Diesel";
    }
}
