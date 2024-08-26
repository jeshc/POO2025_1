package ico.fesa.unam.mx.introduccion.composicion.dell;

public class Mouse {
    private String marca;
    private String modelo;
    private boolean mecanico;
    private int numeroBotones;

    public Mouse() {
    }

    public Mouse(String marca, String modelo, boolean mecanico, int numeroBotones) {
        this.marca = marca;
        this.modelo = modelo;
        this.mecanico = mecanico;
        this.numeroBotones = numeroBotones;
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

    public boolean isMecanico() {
        return mecanico;
    }

    public void setMecanico(boolean mecanico) {
        this.mecanico = mecanico;
    }

    public int getNumeroBotones() {
        return numeroBotones;
    }

    public void setNumeroBotones(int numeroBotones) {
        this.numeroBotones = numeroBotones;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", mecanico=" + mecanico +
                ", numeroBotones=" + numeroBotones +
                '}';
    }
}
