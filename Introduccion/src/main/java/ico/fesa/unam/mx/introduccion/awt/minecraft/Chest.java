package ico.fesa.unam.mx.introduccion.awt.minecraft;

import java.awt.*;

public class Chest extends Frame {
    public static final int ROWS = 2;
    public static final int COLS = 7;
    public static final int LARGO = 800;
    public static final int ANCHO = 600;
    private Button[] slots;
    private GridLayout layout;

    public Chest(String title) throws HeadlessException {
        super(title);
        slots = new Button[ROWS*COLS];
        layout = new GridLayout(ROWS, COLS);
        this.setLayout(layout);
        this.setSize(LARGO, ANCHO);
        for (int i = 0; i < ROWS * COLS ; i++) {
            slots[i] = new Button("empty");
            slots[i].setForeground(new Color(76, 159, 85));
            this.add(slots[i], i);
        }
        this.setVisible(true);

    }
}
