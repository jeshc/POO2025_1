package ico.fesa.unam.mx.introduccion.herencia.ejercicio.ejercicio2.polimorfismo;

public class Pelota extends Toy{
    private double diametro;

    public Pelota() {
    }

    public Pelota(String material, double diametro) {
        super(material);
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "diametro=" + diametro +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public void sonar() {
        System.out.println("Toing... toingggg");
    }
}
