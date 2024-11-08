package org.example.modelo;

import java.io.FileInputStream;

public class ArchivoModelo {
    private String ruta;
    //private FileInputStream archivoLectura;


    public ArchivoModelo() {
    }

    public ArchivoModelo(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "ArchivoModelo{" +
                "ruta='" + ruta + '\'' +
                '}';
    }
}
