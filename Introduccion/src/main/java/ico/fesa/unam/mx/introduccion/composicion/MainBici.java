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

        Bicicleta bike2 = new Bicicleta();
        Bicicleta bike3 = new Bicicleta("Benotto","Grande","Montaña",
                new Rueda(26, "Mediana", "Caucho blanco"),
                new Rueda(26, "Mediana", "Caucho blanco"),
                new Manubrio(true, true, "Asistida", 4),
                new Asiento("Piel","triangular", "Negro", "Mediano")
        );
        System.out.println("Bike 2:");
        System.out.println(bike2);
        System.out.println("\n Bike 3");
        System.out.println(bike3);
        bike3.setTipo("Carreras");
        System.out.println(bike3);
        bike3.getRuedaDelantera().setMaterial("Caucho Negro!!!");
        System.out.println(bike3);
        bike3.getAsiento().setForma("Cuadrado");
        System.out.println(bike3);
        bike3.getVolante().setNumeroVelocidades(8);
        System.out.println(bike3);
        System.out.println("cambiar aaiento completo");
        // piel , Hexagonal, fiusca, Grande
        bike3.setAsiento(new Asiento("PIel","Hexagonal","Fiusca","Grande"));
        // rueda delantera aumentare en 2 la rodada actual
        bike3.getRuedaDelantera().setRodada(bike3.getRuedaDelantera().getRodada()+2);
        System.out.println(bike3);
    }



}
