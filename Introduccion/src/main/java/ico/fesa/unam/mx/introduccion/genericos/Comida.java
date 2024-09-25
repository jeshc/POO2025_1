package ico.fesa.unam.mx.introduccion.genericos;

public class Comida {
    private String nombre;
    private boolean requiereRefrigeracion;

    public Comida() {
    }

    public Comida(String nombre, boolean requiereRefrigeracion) {
        this.nombre = nombre;
        this.requiereRefrigeracion = requiereRefrigeracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRequiereRefrigeracion() {
        return requiereRefrigeracion;
    }

    public void setRequiereRefrigeracion(boolean requiereRefrigeracion) {
        this.requiereRefrigeracion = requiereRefrigeracion;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                ", requiereRefrigeracion=" + requiereRefrigeracion +
                '}';
    }
}
