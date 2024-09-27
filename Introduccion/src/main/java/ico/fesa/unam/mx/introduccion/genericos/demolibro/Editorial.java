package ico.fesa.unam.mx.introduccion.genericos.demolibro;

public class Editorial {
    private String nombre;
    private String direccion;
    private  String pais;

    public Editorial() {
    }

    public Editorial(String nombre, String direccion, String pais) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
