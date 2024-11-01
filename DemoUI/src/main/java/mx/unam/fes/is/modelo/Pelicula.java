package mx.unam.fes.is.modelo;

public class Pelicula {
    private int id;
    private String titulo;
    private String clasficacion;
    private String director;

    public Pelicula() {
    }

    public Pelicula(int id, String titulo, String clasficacion, String director) {
        this.id = id;
        this.titulo = titulo;
        this.clasficacion = clasficacion;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClasficacion() {
        return clasficacion;
    }

    public void setClasficacion(String clasficacion) {
        this.clasficacion = clasficacion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", clasficacion='" + clasficacion + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
