package ico.fesa.unam.mx.introduccion.herencia.ejercicio.ejercicio2.polimorfismo;

public class Chillon extends Toy{
    private String  forma;

    public Chillon() {
    }

    public Chillon(String material, String forma) {
        super(material);
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Chillon{" +
                "forma='" + forma + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public void sonar() {
        System.out.println("Chi gui chigui...");
    }
}
