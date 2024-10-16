package ico.fesa.unam.mx.introduccion.awt.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosRaton implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Presionaste el botón");
        System.out.println("X="+e.getX());
        System.out.println("Y="+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
