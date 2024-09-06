package ico.fesa.unam.mx.introduccion.herencia.ejercicio.ejercicio2;

public class Guitarra extends Instrumento{
    private String tipoGuitarra;
    private boolean electrica;
    private int numeroCuerdas;

    public Guitarra() {
    }

    public Guitarra(String marca, String tipo, float costo, String tipoGuitarra, boolean electrica, int numeroCuerdas) {
        super(marca, tipo, costo);
        this.tipoGuitarra = tipoGuitarra;
        this.electrica = electrica;
        this.numeroCuerdas = numeroCuerdas;
    }

    public String getTipoGuitarra() {
        return tipoGuitarra;
    }

    public void setTipoGuitarra(String tipoGuitarra) {
        this.tipoGuitarra = tipoGuitarra;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "tipoGuitarra='" + tipoGuitarra + '\'' +
                ", electrica=" + electrica +
                ", numeroCuerdas=" + numeroCuerdas +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", costo=" + costo +
                '}';
    }

    public void ponerCapotraste(int numeroTraste){
        System.out.println("Poniendo capotraste en el traste " + numeroTraste);
    }

    @Override
    public void tocar(){
        System.out.println("Pisando las cuerdas en un traste específico");
        System.out.println("rasgar cuerdas");
        System.out.println("traaaan traaaan");
    }
}
