package ico.fesa.unam.mx.introduccion.swing.ejemplo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaConversor extends JFrame {
    public static final int ANCHO = 800;
    public static final int ALTO = 600;
    private JLabel lblEtiqueta1;
    private JTextField txtGradosCelcius;
    private JButton btnConvierte;
    private JLabel lblFarenheith;

    private FlowLayout layout;

    public VentanaConversor(String title) throws HeadlessException {
        super(title);
        this.setSize(ANCHO,ALTO);
        layout = new FlowLayout();
        this.getContentPane().setLayout(layout);
        lblEtiqueta1 = new JLabel("Nuevo valor:");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(lblEtiqueta1);

        this.txtGradosCelcius = new JTextField(3);
        this.getContentPane().add(txtGradosCelcius);

        this.btnConvierte = new JButton("Convertir");
        this.getContentPane().add(btnConvierte);
        this.lblFarenheith = new JLabel("Resultado");
        this.lblFarenheith.setFont(new Font("Arial",Font.BOLD,32));
        this.lblFarenheith.setBackground(new Color(216, 102, 245));
        this.lblFarenheith.setOpaque(true);
        this.lblFarenheith.setForeground(new Color(47, 206, 43));

        this.getContentPane().add(lblFarenheith);

        this.btnConvierte.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //super.mouseClicked(e);
                System.out.println("Hola");
                Toolkit.getDefaultToolkit().beep();
                float centigrados = 0.0f;
                float farenheith = 0.0f;
                centigrados =Float.parseFloat( txtGradosCelcius.getText());
                farenheith = (centigrados * 9.0f / 5.0f) + 32.0f;
                lblFarenheith.setText(centigrados + " ºC es igual a " + farenheith + " ºF.");
            }
        });

        this.setVisible(true);
    }
}
