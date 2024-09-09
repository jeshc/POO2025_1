package ico.fesa.unam.mx.ejerciciointegrador;

public class Autor {
    private String nombre;
    private String apellidos;
    private String paisOrigen;

    // Constructores


    public Autor() {
    }

    public Autor(String nombre, String apellidos, String paisOrigen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.paisOrigen = paisOrigen;
    }

    // Getters ana Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    // To String


    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
