package ico.fesa.unam.mx.introduccion.composicion.dell;

public class Teclado {
    private String marca;
    private String modelo;
    private int numeroTeclas;
    private boolean multimedia;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, int numeroTeclas, boolean multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroTeclas = numeroTeclas;
        this.multimedia = multimedia;
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

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public boolean isMultimedia() {
        return multimedia;
    }

    public void setMultimedia(boolean multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroTeclas=" + numeroTeclas +
                ", multimedia=" + multimedia +
                '}';
    }
}
