package org.example.reloj;

import javax.swing.*;
import java.awt.*;

public class RelojLabel extends JLabel implements Runnable {
    private int hora;
    private int minuto;
    private int segundo;
    private int HoraAlarma;
    private int minutoAlarma;


    public RelojLabel(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        Thread hilo = new Thread(this);
        this.setFont(new Font("Arial",Font.BOLD,24));
        this.setBackground(new Color(0,0,0));
        this.setOpaque(true);
        this.setForeground(new Color(113, 255, 67));
        hilo.start();
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                this.incrementaSegundo();
                this.setText(hora+":"+minuto+":"+segundo);
                // comparando hora con hora de alrma
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    private void incrementaSegundo(){
        segundo++;
        if(segundo == 60){
            segundo = 0;
            this.incrementaMinuto();
        }
    }

    private void incrementaMinuto() {
        minuto++;
        if(minuto == 60){
            minuto = 0;
            this.incrementaHora();
        }
    }

    private void incrementaHora() {
        hora++;
        if (hora == 24){
            hora = 0;
        }
    }


}
