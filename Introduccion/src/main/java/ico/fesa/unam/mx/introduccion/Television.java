package ico.fesa.unam.mx.introduccion;

/**
 * Esta es la clase television jlkajdklajdlask {djasd
 * alkdjalkdjalkdjada  akd ladk lak d
 * as lda ldka l d a }dka ldka slkda  ld
 * aasdokasdkas ldkas dsd
 *
 */
public class Television {
    private String marca;
    private String modelo;
    private float tamanio;
    private String tipoTecnologia;
    private int volumen;

    // especiales

    /**
     * CONSTRUCTOR PO DEFECTO
     */

    public Television() {
    }

    /**
     * Este es el metodo constructor sobrecargado akdjakdjlk
     * @param marca - String y representa al fabricante...
     * @param modelo
     * @param tamanio
     * @param tipoTecnologia
     * @param volumen
     */
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

    /**
     * SET ESTABLECE UN NUEVO VALOR A UN ATRIBUTO
     *
     */

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

    // uso general --> definidos o disenados por el usuario

    public String obtenerInformacion(){
        String resultado = "";

        resultado = "Marca: " + this.marca + "\n";
        resultado = "Modelo: " + this.modelo + "\n";
        resultado = "Tamano(pulgadas): " + this.tamanio + "\n";
        resultado = "Tipo tecnologia: " + this.tipoTecnologia + "\n";
        resultado = "Volumen: " + this.volumen + "\n";

        return resultado;
    }

    public boolean actualizar(){
        // codigo para comunicarse con los seervers o etc.
        return true;
    }

    /**
     * Metodo para modificar el volumen tomando en cuanta el volumen actual
     *
     * @param volumen puede ser positivo o negativo.
     * @return el nuevo valor de volumen
     */
    public int modificarVolumen(int volumen){
        System.out.println("Volumen actual es: " + this.volumen);
        this.volumen = this.volumen + volumen;
        if (this.volumen < 0) this.volumen = 0;
        if (this.volumen > 100) this.volumen = 100;
        return this.volumen;
    }

    /**
     * Metodo sobrecargado de @see modificarVolumen() para modificar voluman usado un boolean
     * @param volumen int - el volumen a mdifica
     * @param subir boolean - true significa subir, false significa bajar.
     * @return int - el valor resultante despues de modificar el vol.
     */
    public int modificarVolumen(int volumen, boolean subir){
        System.out.println("Volumen actual es: " + this.volumen);
        if(subir){
            this.volumen += volumen; //  this.volumen = this.volumen + volumen;
        }else{
            this.volumen -= volumen;
        }
        return this.volumen;
    }

    public int modificarVolumen(double volumen){
        System.out.println("Volumen actual es: " + this.volumen);
        this.volumen = this.volumen + (int)volumen;
        if (this.volumen < 0) this.volumen = 0;
        if (this.volumen > 100) this.volumen = 100;
        return this.volumen;
    }



    public boolean vincular(String id){
        // codigo para vincular TV y Dispositivio via red local
        return true;
    }


    /**
     * Metodo que suma dos numeros.
     * @param a Primer numero.
     * @param b Segundo numero.
     * @return La suma de a y b.
     * @throws IllegalArgumentException si alguno de los numeros es negativo.
     *
     */
    public int sumar(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Los numeros deben ser positivos");
        }
        return a + b;
    }


}
