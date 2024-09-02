package ico.fesa.unam.mx.introduccion.herencia.ejercicio;

public class Estudiante extends Persona {
    //caracteristicas
    private String numeroCuenta;
    private int semestre;
    private String carrera;
    private float promedio;
    private boolean aprobado;

    //contsructores

    public Estudiante() {
    }

    public Estudiante(int edad, String nombre, String genero, float altura, String numeroCuenta, int semestre, String carrera, float promedio, boolean aprobado) {
        super(edad, nombre, genero, altura);
        this.numeroCuenta = numeroCuenta;
        this.semestre = semestre;
        this.carrera = carrera;
        this.promedio = promedio;
        this.aprobado = aprobado;
    }
    //getters and setters

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }
    //to String

    @Override
    public String toString() {
        return "Estudiante{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", semestre=" + semestre +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                ", aprobado=" + aprobado +
                '}';

    }
    public void estudiar(){
        System.out.println("modo estudioso");

    }
    public void irAlShine(){
        System.out.println(getNombre() + "va al shine los lunes");
    }

    public void hacerTarea() {
        System.out.println(getNombre() + "Esta haciendo tarea y no va al shine a bellakear");
    }

    @Override
    public void comer(String platillo){
        System.out.println("El estudiante"+getNombre()+"come"+platillo);

    }
    @Override
    public void beber(String bebida){
        System.out.println("El estudiante "+ getNombre() + "bebe" + bebida);
    }

}

