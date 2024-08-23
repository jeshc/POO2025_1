package ico.fesa.unam.mx.introduccion.composicion;

public class Silla {
    private String marca;

    public Silla() {
    }

    public Silla(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
