package ico.fesa.unam.mx.introduccion.genericos.demolibro;

public class MainLibro {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("El perfume");
        libro.getAutores().add(new Autor("Patrik suskind","hola",23));
        libro.getAutores().add(new Autor("El otro","MExico",23));
        System.out.println(libro);
    }
}
