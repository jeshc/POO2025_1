package ico.fesa.unam.mx.ejerciciointegrador;

public class Revista extends Texto {
    //metodos
    private String mesPublicacion;
    private String tituloNoticiaPrincipal;
    //constructore


    public Revista() {
    }

    public Revista(int edicion, String titulo, int numeroPaginas, int anioDePublicacion, String id, String editorial, String categoriaGenero, String mesPublicacion, String tituloNoticiaPrincipal) {

        super(edicion, titulo, numeroPaginas, anioDePublicacion, id, editorial, categoriaGenero);
        this.mesPublicacion = mesPublicacion;
        this.tituloNoticiaPrincipal = tituloNoticiaPrincipal;
    }
    //getters and setters

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    public String getTituloNoticiaPrincipal() {
        return tituloNoticiaPrincipal;
    }

    public void setTituloNoticiaPrincipal(String tituloNoticiaPrincipal) {
        this.tituloNoticiaPrincipal = tituloNoticiaPrincipal;
    }
    //to string

    @Override
    public String toString() {
        return "Revista{" +
                "mesPublicacion='" + mesPublicacion + '\'' +
                ", tituloNoticiaPrincipal='" + tituloNoticiaPrincipal + '\'' +
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
