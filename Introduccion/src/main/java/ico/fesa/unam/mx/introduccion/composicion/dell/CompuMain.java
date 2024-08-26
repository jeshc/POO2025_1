package ico.fesa.unam.mx.introduccion.composicion.dell;

public class CompuMain {
    public static void main(String[] args) {
        Computadora compu1 = new Computadora();
        System.out.println(compu1);
        compu1.setProcesador(new Procesador("Intel","i9",4.5f, 15));
        System.out.println(compu1);
    }
}
