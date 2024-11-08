package org.example.reloj;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class VentanaCasio extends JFrame {
    private RelojLabel reloj;

    public VentanaCasio(String title) throws HeadlessException {
        super(title);
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        LocalDateTime local = LocalDateTime.now();
        reloj = new RelojLabel(local.getHour(),local.getMinute(),local.getSecond());
        getContentPane().add(reloj);

        setVisible(true);
    }
}
