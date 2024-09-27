package ico.fesa.unam.mx.introduccion.genericos.demolibro;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private int edicion;
    private String isbn;
    private Editorial editorial;
    private ArrayList<Autor> autores;

    public Libro() {
        autores = new ArrayList<>();
        editorial = new Editorial();
    }

    public Libro(String titulo, int edicion, String isbn, Editorial editorial, ArrayList<Autor> autores) {
        this.titulo = titulo;
        this.edicion = edicion;
        this.isbn = isbn;
        this.editorial = editorial;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", edicion=" + edicion +
                ", isbn='" + isbn + '\'' +
                ", editorial=" + editorial +
                ", autores=" + autores +
                '}';
    }
}
