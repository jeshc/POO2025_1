package ico.fesa.unam.mx.introduccion.herencia.ejercicio.ejercicio2;

public class Instrumento {
    protected String marca;
    protected String tipo;
    protected float costo;


    public Instrumento() {
    }

    public Instrumento(String marca, String tipo, float costo) {
        this.marca = marca;
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", costo= $" + costo +
                '}';
    }

    public void tocar(){
        System.out.println("Tocando instrumento...");
    }

    public void afinar(){
        System.out.println("Afinando..");
    }

    public void solear(){
        System.out.println("HAciendo solo con el onstrumento " + this.tipo);
    }
}
