package ico.fesa.unam.mx.introduccion;

public class Television {
    private String marca;
    private String modelo;
    private float tamanio;
    private String tipoTecnologia;
    private int volumen;

    // especiales

    public Television() {
    }

    public Television(String marca, String modelo, float tamanio, String tipoTecnologia, int volumen) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanio = tamanio;
        this.tipoTecnologia = tipoTecnologia;
        this.volumen = volumen;
    }

    public Television(String marca, float tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
    }

    //private String marca;

    // SET ESTABLECE UN NUEVO VALOR A UN ATRIBUTO
    public void setMarca(String marca){
        this.marca = marca;
    }

    //GET REGRESA EL VALOR ACTUAL DEL ESTADO DEL ATRIBUTO
    public String getMarca(){
        return  this.marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipoTecnologia() {
        return tipoTecnologia;
    }

    public void setTipoTecnologia(String tipoTecnologia) {
        this.tipoTecnologia = tipoTecnologia;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    // utileria


    @Override
    public String toString() {
        return "Television{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanio=" + tamanio +
                ", tipoTecnologia='" + tipoTecnologia + '\'' +
                ", volumen=" + volumen +
                '}';
    }

    // uso general --> definidos o diseñados por el usuario
    public String obtenerInformacion(){
        String resultado = "";

        resultado = "Marca: " + this.marca + "\n";
        resultado = "Modelo: " + this.modelo + "\n";
        resultado = "Tamaño(pulgadas): " + this.tamanio + "\n";
        resultado = "Tipo tecnología: " + this.tipoTecnologia + "\n";
        resultado = "Volumen: " + this.volumen + "\n";

        return resultado;
    }

    public boolean actualizar(){
        // código para comunicarse con los seervers o etc.
        return true;
    }

    public int modificarVolumen(int volumen){
        this.volumen = this.volumen + volumen;
        if (this.volumen < 0) this.volumen = 0;
        if (this.volumen > 100) this.volumen = 100;
        return this.volumen;
    }

    public boolean vincular(String id){
        // codigo para vincular TV y Dispositivio via red local
        return true;
    }



}
