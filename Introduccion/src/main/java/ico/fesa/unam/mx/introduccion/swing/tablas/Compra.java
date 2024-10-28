package ico.fesa.unam.mx.introduccion.swing.tablas;

import java.util.Objects;

public class Compra {
    private int id;
    private int cantidad;
    private String nombre;
    private String tipoProducto;
    private float precio;

    public Compra() {
    }

    public Compra(int id, int cantidad, String nombre, String tipoProducto, float precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Compra compra = (Compra) object;
        return id == compra.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Compra{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", tipoProducto='" + tipoProducto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
