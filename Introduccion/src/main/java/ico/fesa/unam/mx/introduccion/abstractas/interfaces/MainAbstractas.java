package ico.fesa.unam.mx.introduccion.abstractas.interfaces;

public class MainAbstractas {
    public static void main(String[] args) {
       // RopaInterface ropa1 = new RopaInterface();
        Chaleco ch1 = new Chaleco();
        System.out.println(ch1);
        ch1.setMaarca("Lacoste");
        ch1.quitar();

    }
}
