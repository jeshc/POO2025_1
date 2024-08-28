package ico.fesa.unam.mx.introduccion.composicion.dell;

public class Computadora {
    private String marca;
    private String modelo;
    private Mouse mouse;
    private Procesador procesador;
    private Monitor monitor;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Mouse mouse, Procesador procesador, Monitor monitor) {
        this.marca = marca;
        this.modelo = modelo;
        this.mouse = mouse;
        this.procesador = procesador;
        this.monitor = monitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", mouse=" + mouse +
                ", procesador=" + procesador  +
                ", monitor=" + monitor +
                '}';
    }
}
