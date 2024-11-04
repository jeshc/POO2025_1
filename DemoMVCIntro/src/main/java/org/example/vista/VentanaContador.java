package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaContador extends JFrame {
    private FlowLayout layout;
    private JButton btnIncrementar;
    private JLabel lblConteo;

    public VentanaContador(String title) throws HeadlessException {
        super(title);
        this.setSize(200, 100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(180, 161, 227));
        this.layout = new FlowLayout();
        this.getContentPane().setLayout(layout);

        this.btnIncrementar = new JButton("Incrementar");
        this.getContentPane().add(btnIncrementar);

        this.lblConteo = new JLabel("0");
        this.lblConteo.setFont(new Font("Arial",Font.BOLD, 18));
        this.getContentPane().add(lblConteo);

        this.setVisible(false);
    }

    @Override
    public FlowLayout getLayout() {
        return layout;
    }

    public void setLayout(FlowLayout layout) {
        this.layout = layout;
    }

    public JButton getBtnIncrementar() {
        return btnIncrementar;
    }

    public void setBtnIncrementar(JButton btnIncrementar) {
        this.btnIncrementar = btnIncrementar;
    }

    public JLabel getLblConteo() {
        return lblConteo;
    }

    public void setLblConteo(JLabel lblConteo) {
        this.lblConteo = lblConteo;
    }
}
