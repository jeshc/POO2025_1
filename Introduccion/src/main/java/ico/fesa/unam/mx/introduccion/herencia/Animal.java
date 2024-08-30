package ico.fesa.unam.mx.introduccion.herencia;

import java.util.Objects;

public class Animal {
    protected int edad;
    protected int tamanio;
    protected String especie;
    protected String habitat;
    protected boolean conPelo;
    protected boolean acuatico;

    public Animal() {
    }

    public Animal(int edad, int tamanio, String especie, String habitat, boolean conPelo, boolean acuatico) {
        this.edad = edad;
        this.tamanio = tamanio;
        this.especie = especie;
        this.habitat = habitat;
        this.conPelo = conPelo;
        this.acuatico = acuatico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isConPelo() {
        return conPelo;
    }

    public void setConPelo(boolean conPelo) {
        this.conPelo = conPelo;
    }

    public boolean isAcuatico() {
        return acuatico;
    }

    public void setAcuatico(boolean acuatico) {
        this.acuatico = acuatico;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Animal animal = (Animal) object;
        return edad == animal.edad && tamanio == animal.tamanio && conPelo == animal.conPelo && acuatico == animal.acuatico && Objects.equals(especie, animal.especie) && Objects.equals(habitat, animal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad, tamanio, especie, habitat, conPelo, acuatico);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "edad=" + edad +
                ", tamanio=" + tamanio +
                ", especie='" + especie + '\'' +
                ", habitat='" + habitat + '\'' +
                ", conPelo=" + conPelo +
                ", acuatico=" + acuatico +
                '}';
    }
    public void respirar(){
        System.out.println("El animal respira-....");
    }

    public void comer(){
        System.out.println("Comiendo ...");
    }

    public void dormir(int minutos){
        System.out.println("Durmiendo por " + minutos + " Minutos...");
    }

    public void moverse(int metros){
        System.out.println("Moviendose "+ metros + " metros..");
    }


}
