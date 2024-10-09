package ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JButton presioname;
    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        this.setVisible(true);
        presioname = new JButton("Presioname");
        this.getContentPane().add(presioname);
        this.presioname.addMouseListener(new EventosRaton2());
        this.repaint();

    }
}
