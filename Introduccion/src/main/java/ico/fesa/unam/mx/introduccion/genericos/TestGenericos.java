package ico.fesa.unam.mx.introduccion.genericos;

public class TestGenericos {
    public static void main(String[] args) {
        CajaCarton<Comida> cajaComida= new CajaCarton<>(new Comida[10], 10);
        cajaComida.agregar(0, new Comida("Carne",true));
        cajaComida.agregar(1, new Comida("Papa",false));
        cajaComida.agregar(2, new Comida("Chiles en vinagre",false));

        System.out.println(cajaComida.obtener(0));

    }
}
