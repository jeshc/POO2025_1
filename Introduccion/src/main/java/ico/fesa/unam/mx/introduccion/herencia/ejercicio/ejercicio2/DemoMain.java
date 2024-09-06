package ico.fesa.unam.mx.introduccion.herencia.ejercicio.ejercicio2;

public class DemoMain {
    public static void main(String[] args) {
        Instrumento instrumento = new Instrumento("Yamaha","Cuerdas",15000.0f);
        System.out.println(instrumento);

        Instrumento guitarra1 = new Guitarra();
        guitarra1.setTipo("Electrica");
        guitarra1.setCosto(25000.0f);
        ((Guitarra) guitarra1).setElectrica(true);
        System.out.println(guitarra1);

        float edad = 23.5f;
        System.out.println("Edad :" + edad);
        System.out.println("Parte entera: " + (int)edad );

        Guitarra guitarra2 = new Guitarra();
        guitarra2.setTipo("Cuerdas");
        guitarra2.setCosto(1500.0f);
        guitarra2.setMarca("De paracho");
        guitarra2.setTipoGuitarra("Acústica");
        guitarra2.setElectrica(false);
        guitarra2.setNumeroCuerdas(6);
        System.out.println(guitarra2);

        System.out.println("Tocar una cancion a duo");
        guitarra1.tocar();
        guitarra2.tocar();
        ((Instrumento)guitarra2).tocar();

    }
}
