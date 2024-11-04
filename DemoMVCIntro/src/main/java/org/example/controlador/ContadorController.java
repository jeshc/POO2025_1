package org.example.controlador;

import org.example.modelo.Contador;
import org.example.vista.VentanaContador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ContadorController {
    private VentanaContador vista;
    private Contador modelo;

    public ContadorController(VentanaContador vista, Contador modelo) {
        this.vista = vista;
        this.modelo = modelo;
        // inicializar
        modelo.setValor(0);
        vista.getLblConteo().setText("" + modelo.getValor());

        this.vista.getBtnIncrementar().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("----");
                vista.getLblConteo().setText("" +modelo.incrementar());
            }
        });

    }


}
