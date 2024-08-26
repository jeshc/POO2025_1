package ico.fesa.unam.mx.introduccion.composicion.dell;

public class Monitor {
    private String marca;
    private String modelo;
    private float pulgadas;
    private String tecnologia; // LED, plasma..... TRC

    public Monitor() {
    }

    public Monitor(String marca, String modelo, float pulgadas, String tecnologia) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.tecnologia = tecnologia;
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

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pulgadas=" + pulgadas +
                ", tecnologia='" + tecnologia + '\'' +
                '}';
    }
}
