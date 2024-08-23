package ico.fesa.unam.mx.introduccion.composicion;

public class Asiento {
    private String material;
    private String forma;
    private String color;
    private String tamanio;

    public Asiento() {
    }

    public Asiento(String material, String forma, String color, String tamanio) {
        this.material = material;
        this.forma = forma;
        this.color = color;
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "material='" + material + '\'' +
                ", forma='" + forma + '\'' +
                ", color='" + color + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
}
