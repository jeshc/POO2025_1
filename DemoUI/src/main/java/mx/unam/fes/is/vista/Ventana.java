package mx.unam.fes.is.vista;

import mx.unam.fes.is.modelo.ModeloComboPelis;
import mx.unam.fes.is.modelo.ModeloTablaPelis;
import mx.unam.fes.is.modelo.Pelicula;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {
    public static final int TAM = 4;
    private GridLayout layout;
    private JPanel[] panels;
    ArrayList<Pelicula> pelis;
    //panel 0
    private JLabel lblId;
    private JTextField txtId;
    private JLabel lblTitulo;
    private JTextField txtTitulo;
    private JLabel lblClasificacion;
    private JTextField txtClasificacion;
    private JLabel lblDirector;
    private JTextField txtDirector;
    private JButton btnAgregar;

    // panel 1
    private JTable tablaPelis;
    private JScrollPane scrTabla;
    private ModeloTablaPelis modelo;

    // panel 2
    private JComboBox cmbPelis;
    private ModeloComboPelis modeloCmbPelis;


    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        layout = new GridLayout(2,2, 20,20);
        this.getContentPane().setLayout(layout);
        panels = new JPanel[TAM];
        for (int i = 0; i < TAM; i++) {
            panels[i] = new JPanel();
        }
        pelis = new ArrayList<>();
        pelis.add(new Pelicula(1,"Matrix","CF","Hnos, Skowaski"));
        pelis.add(new Pelicula(2,"Gldiador","Historica","Noln"));

        // panels[0]
        panels[0].setLayout(new FlowLayout());
        panels[0].setBackground(new Color(210, 163, 239));
        lblId = new JLabel("ID:");
        txtId = new JTextField(3);
        panels[0].add(lblId);
        panels[0].add(txtId);
        lblTitulo = new JLabel("Título");
        txtTitulo = new JTextField(20);
        panels[0].add(lblTitulo);
        panels[0].add(txtTitulo);
        lblDirector = new JLabel("Director");
        txtDirector = new JTextField(20);
        panels[0].add(lblDirector);
        panels[0].add(txtDirector);
        lblClasificacion = new JLabel("Clasificación:");
        txtClasificacion = new JTextField(25);
        panels[0].add(lblClasificacion);
        panels[0].add(txtClasificacion);
        btnAgregar = new JButton("Add");
        panels[0].add(btnAgregar);
        btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pelicula tmp = new Pelicula();
                tmp.setId(Integer.parseInt(txtId.getText()));
                tmp.setTitulo(txtTitulo.getText());
                tmp.setDirector(txtDirector.getText());
                tmp.setClasficacion(txtClasificacion.getText());
                pelis.add(tmp);
                scrTabla.repaint();
                cmbPelis.repaint();
                txtId.setText("");
                txtTitulo.setText("");
                txtClasificacion.setText("");
                txtDirector.setText("");


            }
        });

        // panels[1]
        panels[1].setLayout(new FlowLayout());
        panels[1].setBackground(new Color(215, 232, 180));



        modelo = new ModeloTablaPelis(pelis);
        tablaPelis = new JTable(modelo);

        scrTabla = new JScrollPane(tablaPelis);

        //scrTabla.add(tablaPelis);

        scrTabla.setPreferredSize(new Dimension(350,250));
        panels[1].add(scrTabla);


        // panels[2]
        panels[2].setLayout(new FlowLayout());
        panels[2].setBackground(new Color(145, 188, 204));
        modeloCmbPelis = new ModeloComboPelis(pelis);
        cmbPelis = new JComboBox(modeloCmbPelis);
        panels[2].add(cmbPelis);
        // panels[3]
        panels[3].setLayout(new FlowLayout());
        panels[3].setBackground(new Color(234, 196, 191));


        for (int i = 0; i < TAM; i++) {
            this.getContentPane().add(panels[i]);
        }
        this.setVisible(true);

    }
}
