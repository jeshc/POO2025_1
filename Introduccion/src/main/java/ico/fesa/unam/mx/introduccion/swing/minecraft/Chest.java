package ico.fesa.unam.mx.introduccion.swing.minecraft;


import javax.swing.*;
import java.awt.*;

public class Chest extends JFrame {
    private ChestSection chest;
    private ChestSection inventory;
    private ChestSection hud;
    private GridLayout layout;

    public Chest(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.layout = new GridLayout(3,1);
        this.getContentPane().setLayout(layout);
        //chet
        chest = new ChestSection( 6, 9, "Large Chest" );
        this.getContentPane().add(chest,0);

        // inventory
        inventory = new ChestSection(3,9,"Inventory");
        this.getContentPane().add(inventory,1);

        //hud
        hud= new ChestSection(1,9,"hud");
        this.getContentPane().add(hud,2);

        this.setVisible(true);
    }
}
