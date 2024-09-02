package ico.fesa.unam.mx.introduccion.herencia.ejercicio;

public class Persona {
    private int edad;
    private String nombre;
    private String genero;
    private float altura;

    public Persona() {
    }

    public Persona(int edad, String nombre, String genero, float altura) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", altura=" + altura +
                '}';
    }

    //metodos

    public void respirar() {
     System.out.println(nombre + "esta respirando");
    }
        public void comer(String platillo){
            //la persona esta comiendo (nombre del platillo)
            System.out.println(nombre+"Esta comiendo"+platillo);
        }

        public void beber (String bebida){
           //la persona esta bebiendo (nombre de la bebida)
            System.out.println(nombre+"Esta bebiendo"+bebida);

        }

        public void dormir (int minutos){
            System.out.println(nombre + "durmio" + minutos + "minutos");

        }
    }

