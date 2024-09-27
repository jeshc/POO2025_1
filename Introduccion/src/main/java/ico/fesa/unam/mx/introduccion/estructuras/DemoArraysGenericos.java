package ico.fesa.unam.mx.introduccion.estructuras;

import java.awt.*;
import java.util.ArrayList;

public class DemoArraysGenericos {

    public static void main(String[] args) {
        ArrayList<Mochila> lista= new ArrayList<>();
        Mochila miMochila= new Mochila("Chenson", "mediana", 1250.0f, new Color(0,255,0));
        Mochila miMochila2= new Mochila("Jansport", "grande", 800.0f, new Color(255,0,0));
        lista.add(miMochila);
        lista.add(miMochila2);
        lista.add(new Mochila("Nike","Mediana",1300.0f,new Color(0,0,0)));
        System.out.println(lista);
        Mochila tmp =lista.get(1);
        System.out.println(".-.-.-.-.-");
        System.out.println(tmp);
        lista.set(1,new Mochila("Partido verde", "grande", 800.0f, new Color(255,0,0)));
        System.out.println(lista);
        System.out.println("\nTEMPO:"+tmp);
        System.out.println("Tam: "+ lista.size());
        lista.add(1,new Mochila("Cruz azul", "Grande", 0.0f, new Color(26, 105, 150)));
        System.out.println(lista);

    }

}
