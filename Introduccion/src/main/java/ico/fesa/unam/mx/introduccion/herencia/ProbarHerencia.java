package ico.fesa.unam.mx.introduccion.herencia;

import javax.swing.*;

public class ProbarHerencia {
    public static void main(String[] args) {
        Animal animal = new Animal(3,1,"Roedor","campo",true,false);
        System.out.println(animal);
        animal.moverse(200);
        animal.dormir(20);
        System.out.println("Probando herencia");
        Perro dog1 = new Perro();
        System.out.println(dog1);
        dog1.moverse(200);
        dog1.dormir(25);
        System.out.println(dog1);

        MiVentana miVentana = new MiVentana("Hola mundo Swing");
        miVentana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
