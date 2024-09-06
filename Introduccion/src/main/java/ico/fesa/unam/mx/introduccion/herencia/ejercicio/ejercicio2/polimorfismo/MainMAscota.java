package ico.fesa.unam.mx.introduccion.herencia.ejercicio.ejercicio2.polimorfismo;

public class MainMAscota {
    public static void main(String[] args) {
        MascotaCanina mas1 = new MascotaCanina("Snauzer","Manchas", new Pelota("Caucho",4.2));
        mas1.comer();
        mas1.jugar();
        mas1.setJuguete(new Chillon("Goma","Hueso"));
        mas1.jugar();
    }
}
