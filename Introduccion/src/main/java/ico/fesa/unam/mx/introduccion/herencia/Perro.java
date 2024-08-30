package ico.fesa.unam.mx.introduccion.herencia;

import java.util.Objects;

public class Perro extends Animal {
    private String raza;
    private String color;

    public Perro() {
    }

    public Perro(int edad, int tamanio, String especie, String habitat, boolean conPelo, boolean acuatico, String raza, String color) {
        super(edad, tamanio, especie, habitat, conPelo, acuatico);
        this.raza = raza;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Perro perro = (Perro) object;
        return Objects.equals(raza, perro.raza) && Objects.equals(color, perro.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), raza, color);
    }

    @Override
    public String toString() {
        return  " Perro{" + super.toString() +
                ", raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void ladrar(){
        System.out.println("El perro de especia" +this.especie +  " está ladrando");
    }

    public void olfatear(){
        System.out.println("olfatdar...");
    }

    public void jugar(){
        System.out.println("Jugando...");
    }
    @Override
    public void moverse(int metros){
        System.out.println("EL PERRO SE MUEVE MOVIENDO LA COLA POR " + metros + " Metros..");
    }
}
