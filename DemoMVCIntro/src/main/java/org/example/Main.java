package org.example;

import org.example.controlador.ContadorController;
import org.example.modelo.Contador;
import org.example.vista.VentanaContador;

public class Main {
    public static void main(String[] args) {
        VentanaContador vista = new VentanaContador("Hola MVC Swing");
        Contador modelo = new Contador();
        ContadorController controlador = new ContadorController(vista, modelo);
        System.out.println("Iniciaalizando...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        vista.setVisible(true);
    }
}