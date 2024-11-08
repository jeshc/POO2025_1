package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    //menus
    private JMenuBar menuPrincipal;
    private JMenu mnuArchivo;
    private JMenu mnuDialogo;

    private JMenuItem mnuAbrirArchivo;
    private JMenuItem mnuSaludar;
    private JMenuItem mnuInputDialog;
    private JMenuItem mnuConfirmacionDialog;

    // panel 1 comoennetes
    private JLabel lblRutaArchivo;


    public VentanaPrincipal(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        layout = new GridLayout(1, 2, 10, 10);
        this.getContentPane().setLayout(layout);
        menuPrincipal = new JMenuBar();
        mnuArchivo = new JMenu("File");
        mnuAbrirArchivo = new JMenuItem("Abrir archivo ...");
        mnuSaludar = new JMenuItem("Saludar");
        mnuArchivo.add(mnuAbrirArchivo);
        mnuArchivo.add(mnuSaludar);

        mnuDialogo = new JMenu("Cuadros de Dialogo");
        mnuConfirmacionDialog =new JMenuItem("Confirmacion");
        mnuInputDialog =new JMenuItem("de entarda");
        mnuDialogo.add(mnuConfirmacionDialog);
        mnuDialogo.add(mnuInputDialog);

        menuPrincipal.add(mnuArchivo);
        menuPrincipal.add(mnuDialogo);



        //this.getContentPane().add(menuPrincipal);
        this.setJMenuBar(menuPrincipal);
        //panel 1
        panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createTitledBorder("Zona de archivos"));
        panel1.setBackground(new Color(231, 221, 32));
        lblRutaArchivo = new JLabel("HHHHH");
        lblRutaArchivo.setFont(new Font("Arial",Font.BOLD,18));
        panel1.add(lblRutaArchivo);

        //panel 2
        panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createTitledBorder("Cuadros dialogo"));
        panel2.setBackground(new Color(94, 225, 65));


        this.getContentPane().add(panel1);
        this.getContentPane().add(panel2);
        this.setVisible(false);
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JMenuBar getMenuPrincipal() {
        return menuPrincipal;
    }

    public void setMenuPrincipal(JMenuBar menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    public JMenu getMnuArchivo() {
        return mnuArchivo;
    }

    public void setMnuArchivo(JMenu mnuArchivo) {
        this.mnuArchivo = mnuArchivo;
    }

    public JMenuItem getMnuAbrirArchivo() {
        return mnuAbrirArchivo;
    }

    public void setMnuAbrirArchivo(JMenuItem mnuAbrirArchivo) {
        this.mnuAbrirArchivo = mnuAbrirArchivo;
    }

    public JMenuItem getMnuSaludar() {
        return mnuSaludar;
    }

    public void setMnuSaludar(JMenuItem mnuSaludar) {
        this.mnuSaludar = mnuSaludar;
    }

    public JLabel getLblRutaArchivo() {
        return lblRutaArchivo;
    }

    public void setLblRutaArchivo(JLabel lblRutaArchivo) {
        this.lblRutaArchivo = lblRutaArchivo;
    }

    public JMenu getMnuDialogo() {
        return mnuDialogo;
    }

    public void setMnuDialogo(JMenu mnuDialogo) {
        this.mnuDialogo = mnuDialogo;
    }

    public JMenuItem getMnuInputDialog() {
        return mnuInputDialog;
    }

    public void setMnuInputDialog(JMenuItem mnuInputDialog) {
        this.mnuInputDialog = mnuInputDialog;
    }

    public JMenuItem getMnuConfirmacionDialog() {
        return mnuConfirmacionDialog;
    }

    public void setMnuConfirmacionDialog(JMenuItem mnuConfirmacionDialog) {
        this.mnuConfirmacionDialog = mnuConfirmacionDialog;
    }
}
