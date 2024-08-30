package ico.fesa.unam.mx.introduccion.herencia;

import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame {

    public MiVentana(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 600);
        this.setVisible(true);
    }
}
