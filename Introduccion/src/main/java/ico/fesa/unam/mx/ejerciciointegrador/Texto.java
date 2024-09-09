package ico.fesa.unam.mx.ejerciciointegrador;

public class Texto {
    //ATRIBUTOS
    protected int edicion;
    protected String titulo;
    protected int numeroPaginas;
    protected int anioDePublicacion;
    protected String id;
    protected String editorial;
    protected String categoriaGenero;

    //CONSTRUCTORES

    public Texto(int edicion, String titulo, int numeroPaginas, int anioDePublicacion, String id, String editorial, String categoriaGenero) {
        this.edicion = edicion;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.anioDePublicacion = anioDePublicacion;
        this.id = id;
        this.editorial = editorial;
        this.categoriaGenero = categoriaGenero;
    }

    public Texto() {
    }
    //getter and setter

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(int anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategoriaGenero() {
        return categoriaGenero;
    }

    public void setCategoriaGenero(String categoriaGenero) {
        this.categoriaGenero = categoriaGenero;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "edicion=" + edicion +
                ", titulo='" + titulo + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", anioDePublicacion=" + anioDePublicacion +
                ", id='" + id + '\'' +
                ", editorial='" + editorial + '\'' +
                ", categoriaGenero='" + categoriaGenero + '\'' +
                '}';
    }
}
