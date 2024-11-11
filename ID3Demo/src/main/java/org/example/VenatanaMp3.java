package org.example;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class VenatanaMp3 extends JFrame {
    private JLabel lblTitulo;
    private JLabel lblAlbum;
    private JLabel lblFoto;

    public VenatanaMp3(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        lblTitulo = new JLabel("Titulo:");
        lblAlbum = new JLabel("Album:");
        lblFoto = new JLabel("");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 100));
        lblAlbum.setFont(new Font("Arial", Font.BOLD, 100));


        try {
            Mp3File mp3File = new Mp3File("/Users/jesushc/08love.mp3"); // JFileChooser
            if (mp3File.hasId3v1Tag()){
                System.out.println("Id3V1");
            }
            if (mp3File.hasId3v2Tag()){
                System.out.println("Id3V2");
                ID3v2 id3 = mp3File.getId3v2Tag();
                mup3File.get
                lblTitulo.setText(id3.getTitle());
                lblAlbum.setText(id3.getAlbum());
                byte[] imageCrudo =  id3.getAlbumImage();
                if (imageCrudo == null){
                    ImageIcon icono = new ImageIcon("default.png");
                    lblFoto.setIcon(icono);
                }else {
                    ImageIcon icono = new ImageIcon(imageCrudo);
                    lblFoto.setIcon(icono);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedTagException e) {
            throw new RuntimeException(e);
        } catch (InvalidDataException e) {
            throw new RuntimeException(e);
        }


        getContentPane().add(lblTitulo);
        getContentPane().add(lblAlbum);
        getContentPane().add(lblFoto);
        setVisible(!false);
    }
}
