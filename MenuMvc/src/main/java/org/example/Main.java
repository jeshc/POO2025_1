package org.example;

import org.example.controlador.Controller;
import org.example.modelo.ArchivoModelo;
import org.example.vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaPrincipal vista = new VentanaPrincipal("Menus y Joption pane");
        ArchivoModelo modelo  = new ArchivoModelo();
        Controller controlador = new Controller(vista, modelo);
    }
}