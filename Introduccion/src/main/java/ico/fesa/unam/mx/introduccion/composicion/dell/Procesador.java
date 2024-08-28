package ico.fesa.unam.mx.introduccion.composicion.dell;

public class Procesador {
    private String marca;
    private String modelo;
    private float frecuencia; // 3.1nGHz
    private int generacion;

    public Procesador() {
    }

    public Procesador(String marca, String modelo, float frecuencia, int generacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.frecuencia = frecuencia;
        this.generacion = generacion;
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

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frecuencia=" + frecuencia +" GHz. "+
                ", generacion=" + generacion +
                '}';
    }
}
