package ico.fesa.unam.mx.introduccion.awt.eventos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoSimple implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Ocurrio un evento");
        Toolkit.getDefaultToolkit().beep();
    }
}
