package ico.fesa.unam.mx.introduccion.awt;

import ico.fesa.unam.mx.introduccion.awt.eventos.EventoSimple;
import ico.fesa.unam.mx.introduccion.awt.eventos.EventosRaton;
import ico.fesa.unam.mx.introduccion.awt.eventos.EventosVentana;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaDos extends Frame {
    private Button boton;

    public VentanaDos() throws HeadlessException {

    }

    public VentanaDos(String title, int ancho, int alto) throws HeadlessException {
        super(title);
        this.setSize(ancho,alto);
        this.boton = new Button("Presioname");
        this.setLayout(new FlowLayout());
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hola");
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("cerrando...");
                System.exit(0);
            }
        });
        this.add(boton);

    }
}
