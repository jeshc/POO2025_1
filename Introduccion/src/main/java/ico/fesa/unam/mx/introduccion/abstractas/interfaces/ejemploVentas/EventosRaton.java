package ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventosRaton extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("El boton se presionó!!!");
    }
}
