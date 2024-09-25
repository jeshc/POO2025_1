package ico.fesa.unam.mx.introduccion.genericos;

import java.util.Arrays;

public class CajaCarton<T> {
    private T[] data;
    private int tam;

    public CajaCarton() {
        //data = new T[10];
    }

    public CajaCarton(T[] data, int tam) {
        this.data = data;
        this.tam = tam;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "CajaCarton{" +
                "data=" + Arrays.toString(data) +
                ", tam=" + tam +
                '}';
    }

    public void agregar(int indice, T dato){
        // validar el indice
        this.data[indice] = dato;
    }

    public T obtener(int index){
        return this.data[index];
    }
}
