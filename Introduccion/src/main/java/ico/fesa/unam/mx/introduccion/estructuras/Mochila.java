package ico.fesa.unam.mx.introduccion.estructuras;

import java.awt.*;

public class Mochila {
    private String marca;
    private String tamanio;
    private float precio;
    private Color color;

    public Mochila() {
    }

    public Mochila(String marca, String tamanio, float precio, Color color) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.precio = precio;
        this.color = color;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mochila{" +
                "marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", precio=" + precio +
                ", color=" + color +
                '}';
    }

    public void abrir(){
        System.out.println("abriendo la mochivla marca "+ this.marca);
    }
}
