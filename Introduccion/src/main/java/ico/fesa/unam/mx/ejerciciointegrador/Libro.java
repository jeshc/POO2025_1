package ico.fesa.unam.mx.ejerciciointegrador;

public class Libro extends Texto{
    private String ISBN;
    private String tamanio;
    private Autor  autor;

    //constructores

    public Libro() {
    }

    public Libro(int edicion, String titulo, int numeroPaginas, int anioDePublicacion, String id, String editorial, String categoriaGenero, String ISBN, String tamanio, Autor autor) {
        super(edicion, titulo, numeroPaginas, anioDePublicacion, id, editorial, categoriaGenero);
        this.ISBN = ISBN;
        this.tamanio = tamanio;
        this.autor = autor;
    }

    //getters and setters

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", autor=" + autor +
                ", edicion=" + edicion +
                ", titulo='" + titulo + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", anioDePublicacion=" + anioDePublicacion +
                ", id='" + id + '\'' +
                ", editorial='" + editorial + '\'' +
                ", categoriaGenero='" + categoriaGenero + '\'' +
                '}';
    }
}



