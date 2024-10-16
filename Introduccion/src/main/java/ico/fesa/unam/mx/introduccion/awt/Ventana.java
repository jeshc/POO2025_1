package ico.fesa.unam.mx.introduccion.awt;

import ico.fesa.unam.mx.introduccion.awt.eventos.EventoSimple;
import ico.fesa.unam.mx.introduccion.awt.eventos.EventosRaton;
import ico.fesa.unam.mx.introduccion.awt.eventos.EventosVentana;

import java.awt.*;

public class Ventana extends Frame {
    private Button boton;
    private EventoSimple doniaLola;

    public Ventana() throws HeadlessException {

    }

    public Ventana(String title, int ancho, int alto) throws HeadlessException {
        super(title);
        this.setSize(ancho,alto);
        this.boton = new Button("Presioname");
        this.setLayout(new FlowLayout());
        doniaLola = new EventoSimple();
        boton.addActionListener(doniaLola);
        this.addWindowListener(new EventosVentana());
        this.boton.addMouseListener(new EventosRaton());
        this.add(boton);

    }
}
