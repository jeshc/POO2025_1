package ico.fesa.unam.mx.introduccion.herencia.ejercicio.ejercicio2.polimorfismo;

public class MascotaCanina {
    private String raza;
    private String nombre;
    private Toy juguete;

    public MascotaCanina() {
    }

    public MascotaCanina(String raza, String nombre, Toy juguete) {
        this.raza = raza;
        this.nombre = nombre;
        this.juguete = juguete;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Toy getJuguete() {
        return juguete;
    }

    public void setJuguete(Toy juguete) {
        this.juguete = juguete;
    }

    @Override
    public String toString() {
        return "MascotaCanina{" +
                "raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", juguete=" + juguete +
                '}';
    }
    public void jugar(){
        System.out.println(this.nombre+ " empieza a jugar con " + juguete);
        this.juguete.sonar();
    }

    public void comer(){
        System.out.println("comiendo");
    }
    public void correr(){
        System.out.println("Corriendo");
    }
}
