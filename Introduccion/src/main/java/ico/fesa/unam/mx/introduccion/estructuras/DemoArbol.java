package ico.fesa.unam.mx.introduccion.estructuras;

public class DemoArbol {
    public static void main(String[] args) {
        NodoArbol<Integer> raiz = new NodoArbol<>();
        raiz.setDato(50);
        raiz.setHijoIzquierdo(new NodoArbol<>(40));
        raiz.setHijoDerecho(new NodoArbol<>(80));
        raiz.getHijoDerecho().setHijoDerecho(new NodoArbol<>(85));
        raiz.getHijoDerecho().setHijoIzquierdo(new NodoArbol<>(70));
        System.out.println(raiz.getHijoDerecho().getHijoIzquierdo());
        System.out.println(raiz.getHijoDerecho());
        System.out.println("-.-.-.-.-.-.-.-");
        System.out.println(raiz);
    }
}
