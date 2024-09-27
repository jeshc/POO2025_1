package ico.fesa.unam.mx.introduccion.estructuras;

public class NodoArbol<T> {
    private T dato;
    private NodoArbol<T> hijoIzquierdo;
    private NodoArbol<T> hijoDerecho;

    public NodoArbol() {
    }

    public NodoArbol(T dato) {
        this.dato = dato;
    }

    public NodoArbol(T dato, NodoArbol<T> hijoIzquierdo, NodoArbol<T> hijoDerecho) {
        this.dato = dato;
        this.hijoIzquierdo = hijoIzquierdo;
        this.hijoDerecho = hijoDerecho;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoArbol<T> getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbol<T> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbol<T> getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbol<T> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    @Override
    public String toString() {
        return "NodoArbol{" +
                "dato=" + dato +
                ", hijoIzquierdo=" + hijoIzquierdo +
                ", hijoDerecho=" + hijoDerecho +
                '}';
    }
}
