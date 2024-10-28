package ico.fesa.unam.mx.introduccion.swing.tablas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class VentanaCompras extends JFrame {
    private JTable tblCompras;
    private ArrayList<Compra> lista;
    private ModeloTablaCompras modelo;
    private JButton btnAgregar;



    public VentanaCompras(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new FlowLayout());
        lista = new ArrayList<>();
        lista.add(new Compra(1,2,"Sopa Maruchan", "Snack",18.5f));
        lista.add(new Compra(2,1,"Huevo", "Basicos",48.0f));
        lista.add(new Compra(3,5,"Coca cola", "Bebida",17.0f));
        lista.add(new Compra(4,8,"Cigarro", "Canasta básica",7.0f));
        modelo = new ModeloTablaCompras(lista);

        tblCompras = new JTable();
        tblCompras.setModel(modelo);
        this.getContentPane().add(tblCompras);
        btnAgregar = new JButton("Agregar");
        this.getContentPane().add(btnAgregar);

        btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Compra tmp2 = new Compra(5,10,"Modelo malta","Alcohol canasta basica",48.0f);
                lista.add(tmp2);
                modelo.agregarCompra(tmp2);
            }
        });

 
            public void mouseClicked(MouseEvent e) {
                System.out.println("Renglon seleccionado: " +tblCompras.getSelectedRow());
            }
        });

        this.tblCompras.repaint();
        this.setVisible(true);
    }
}
