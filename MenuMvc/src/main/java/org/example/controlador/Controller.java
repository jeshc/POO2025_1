package org.example.controlador;

import org.example.modelo.ArchivoModelo;
import org.example.vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private VentanaPrincipal view;
    private ArchivoModelo model;

    public Controller(VentanaPrincipal view, ArchivoModelo model) {
        this.view = view;
        this.model = model;

        this.view.getMnuAbrirArchivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hola");
                JFileChooser jfc = new JFileChooser();
                int seleccion = jfc.showOpenDialog(view);
                switch (seleccion) {
                    case JFileChooser.APPROVE_OPTION:
                        System.out.println("Elegiste ok");
                        model.setRuta(jfc.getSelectedFile().getAbsolutePath());
                        view.getLblRutaArchivo().setText(model.getRuta());
                        break;
                    case JFileChooser.CANCEL_OPTION:
                        System.out.println("Cancelar");
                        break;
                    case JFileChooser.ERROR_OPTION:
                        System.out.println("Error");
                        break;
                }
            }
        });

        this.view.getMnuSaludar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(view, "Hola cawn!!", "Mensaje del mas allá", JOptionPane.WARNING_MESSAGE);
            }
        });

        this.view.getMnuConfirmacionDialog().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int res = JOptionPane.showConfirmDialog(view, "¿Estas seguro???");
                switch (res) {
                    case JOptionPane.YES_OPTION:
                        System.out.println("Seleccionaste si");
                        break;

                    case JOptionPane.NO_OPTION:
                        System.out.println("Seleccionaste NO");
                        break;

                    case JOptionPane.CANCEL_OPTION:
                        System.out.println("Seleccionaste Cancel");
                        break;
                }
            }
        });

        this.view.getMnuInputDialog().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entrada = JOptionPane.showInputDialog("¿Cual es tu nombre?");
                view.getLblRutaArchivo().setText(entrada);
            }
        });

        this.view.setVisible(true);
    }
}
