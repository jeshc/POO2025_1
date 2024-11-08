package org.example;

public class Main {
    public static void main(String[] args) {
        Contador hilo1 = new Contador("H1", 1001);
        Contador hilo2 = new Contador("H2", 1002);
        Contador hilo3 = new Contador("H3", 1003);
        Contador hilo4 = new Contador("H4", 1004);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}