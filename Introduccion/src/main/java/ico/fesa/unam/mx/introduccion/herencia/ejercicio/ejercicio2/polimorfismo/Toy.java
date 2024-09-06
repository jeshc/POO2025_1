package ico.fesa.unam.mx.introduccion.herencia.ejercicio.ejercicio2.polimorfismo;

public class Toy {
    protected String material;

    public Toy() {
    }

    public Toy(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "material='" + material + '\'' +
                '}';
    }

    public void sonar(){
        System.out.println("El juguete emite sonido....");
    }
}
