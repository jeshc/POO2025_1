package ico.fesa.unam.mx.introduccion.composicion;

public class MainBici {
    public static void main(String[] args) {
        System.out.println("probando bici");
        Bicicleta bike = new Bicicleta();
        System.out.println(bike.toString());
        bike.setMarca("Apache");
        System.out.println(bike.toString());
        /*
        Rueda rueda1 = new Rueda(26, "mediana", "Caucho");
        bike.setRuedaDelantera(rueda1);

        Rueda rueda2 = new Rueda();
        rueda2.setMaterial("Caucho");
        rueda2.setRodada(26);
        rueda2.setTamanio("Mediana");
        bike.setRuedaTrasera(rueda2);
        */

        bike.setRuedaDelantera(new Rueda(26, "Mediana","Caucho"));
        bike.setRuedaTrasera(new Rueda(26, "Mediana","Caucho"));
        System.out.println(".-.-.-.");
        System.out.println(bike);
    }
}
