package ico.fesa.unam.mx.introduccion.herencia.ejercicio;

public class mainHerencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println(persona1);
        persona1.setNombre("Alejandra");
        persona1.setEdad(19);
        System.out.println(persona1);
        persona1.setAltura(1.62f);
        System.out.println(persona1);

        Estudiante Alumno1 = new Estudiante();
        System.out.println(Alumno1);
        Alumno1.setNombre("Paco");
        Alumno1.comer("pizza");
        Alumno1.beber("kosako");
    }


}
