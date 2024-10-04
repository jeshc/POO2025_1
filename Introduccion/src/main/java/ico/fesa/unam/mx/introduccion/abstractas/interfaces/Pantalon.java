package ico.fesa.unam.mx.introduccion.abstractas.interfaces;

public class Pantalon implements RopaInterface{
    private String marca;
    private boolean tiroAlto;
    private Object talla;

    public Pantalon() {
    }

    public Pantalon(String marca, boolean tiroAlto) {
        this.marca = marca;
        this.tiroAlto = tiroAlto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isTiroAlto() {
        return tiroAlto;
    }

    public void setTiroAlto(boolean tiroAlto) {
        this.tiroAlto = tiroAlto;
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "marca='" + marca + '\'' +
                ", tiroAlto=" + tiroAlto +
                '}';
    }


    @Override
    public void vestir() {
        System.out.println("Luchando por que entre el pantalon");
    }

    @Override
    public boolean quitar() {
        System.out.println("Quitando el pantalon");
        return false;
    }

    @Override
    public String obtenerTalla() {
        return (String) this.talla;
    }

    @Override
    public boolean doblar(int dobleces) {

        System.out.println("Doblando ...");
        return false;
    }
}
