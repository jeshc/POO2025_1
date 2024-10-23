package ico.fesa.unam.mx.introduccion.swing.listasdesplegables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class DemoCombo extends JFrame {
    private JComboBox<String> cmbDemo;
    private ModeloDemoCombo modelo;
    private JButton boton;

    public DemoCombo(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new FlowLayout());

        this.cmbDemo = new JComboBox<>();
        ArrayList<String> frutas= new ArrayList<>();
        frutas.add("Pera");
        frutas.add("Manzana");
        frutas.add("Kiwi");
        frutas.add("Aguacate");
        modelo = new ModeloDemoCombo(frutas);
        cmbDemo.setModel(modelo);
        // datos
        this.getContentPane().add(cmbDemo);
        boton = new JButton("Check");
        this.getContentPane().add(boton);
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(cmbDemo.getSelectedItem());
                System.out.println(cmbDemo.getSelectedIndex());
            }
        });
        this.setVisible(true);
    }
}
