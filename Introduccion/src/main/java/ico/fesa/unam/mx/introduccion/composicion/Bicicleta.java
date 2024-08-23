package ico.fesa.unam.mx.introduccion.composicion;

public class Bicicleta {
    private String marca;
    private String tamanio;
    private String tipo;
    private Rueda ruedaTrasera;
    private Rueda ruedaDelantera;
    private Manubrio volante;
    private Asiento asiento;


    public Bicicleta() {
    }

    public Bicicleta(String marca, String tamanio, String tipo, Rueda ruedaTrasera, Rueda ruedaDelantera, Manubrio volante, Asiento asiento) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.tipo = tipo;
        this.ruedaTrasera = ruedaTrasera;
        this.ruedaDelantera = ruedaDelantera;
        this.volante = volante;
        this.asiento = asiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    public Manubrio getVolante() {
        return volante;
    }

    public void setVolante(Manubrio volante) {
        this.volante = volante;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ruedaTrasera=" + ruedaTrasera +
                ", ruedaDelantera=" + ruedaDelantera +
                ", volante=" + volante +
                ", asiento=" + asiento +
                '}';
    }

    public void rodar(){
        System.out.println("Rodando...");
    }

    public void frenar(){
        System.out.println("Frenando...");
    }

    public void girar(){
        System.out.println("Girando...");
    }

}
