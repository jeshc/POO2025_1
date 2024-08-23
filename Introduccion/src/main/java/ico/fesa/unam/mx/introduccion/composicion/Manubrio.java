package ico.fesa.unam.mx.introduccion.composicion;

public class Manubrio {
    private boolean cambiosDeVelocidad;
    private boolean conFrenos;
    private String direccion;
    private int numeroVelocidades;

    public Manubrio() {
    }

    public Manubrio(boolean cambiosDeVelocidad, boolean conFrenos, String direccion, int numeroVelocidades) {
        this.cambiosDeVelocidad = cambiosDeVelocidad;
        this.conFrenos = conFrenos;
        this.direccion = direccion;
        this.numeroVelocidades = numeroVelocidades;
    }

    public boolean isCambiosDeVelocidad() {
        return cambiosDeVelocidad;
    }

    public void setCambiosDeVelocidad(boolean cambiosDeVelocidad) {
        this.cambiosDeVelocidad = cambiosDeVelocidad;
    }

    public boolean isConFrenos() {
        return conFrenos;
    }

    public void setConFrenos(boolean conFrenos) {
        this.conFrenos = conFrenos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroVelocidades() {
        return numeroVelocidades;
    }

    public void setNumeroVelocidades(int numeroVelocidades) {
        this.numeroVelocidades = numeroVelocidades;
    }

    @Override
    public String toString() {
        return "Manubrio{" +
                "cambiosDeVelocidad=" + cambiosDeVelocidad +
                ", conFrenos=" + conFrenos +
                ", direccion='" + direccion + '\'' +
                ", numeroVelocidades=" + numeroVelocidades +
                '}';
    }
}
