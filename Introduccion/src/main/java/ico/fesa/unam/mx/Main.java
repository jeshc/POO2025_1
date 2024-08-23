package ico.fesa.unam.mx;
import ico.fesa.unam.mx.introduccion.Television;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int edad = 10;
        Television  tele1 = new Television(); // crear el objeto
        tele1.setMarca("Samsung");
        tele1.setTamanio(70.0f);
        tele1.setVolumen(5);
        System.out.println("Marca: " + tele1.getMarca());
        System.out.println("Tam: " +tele1.getTamanio());
        System.out.println("Vol: " +tele1.getVolumen());
        System.out.println(tele1.toString());
        tele1.modificarVolumen(20);
        System.out.println(tele1.toString());
        tele1.modificarVolumen(10, false);
        System.out.println(tele1.toString());
        tele1.modificarVolumen(10.0);

        System.out.println(tele1.toString());
    }
}