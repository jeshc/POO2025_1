package ico.fesa.unam.mx.introduccion.composicion.dell;

public class CompuMain {
    public static void main(String[] args) {
        Computadora compu1 = new Computadora();
        System.out.println(compu1);
        compu1.setProcesador(new Procesador("Intel","i9",4.5f, 15));
        System.out.println(compu1);
        compu1.setMarca("Dell");
        System.out.println("Marca: " + compu1.getMarca() );
        compu1.setProcesador(new Procesador("AMD","Ryzen 5", 3.1f, 2));
        System.out.println(compu1);
        compu1.getProcesador().setFrecuencia(4.1f);
        System.out.println(compu1);
        compu1.setMonitor(new Monitor("Sony", "M30",32.5f, "Led"));
        System.out.println(compu1);
        //SN400
        compu1.getMonitor().setModelo("SN400");
        System.out.println(compu1);
        Computadora compu2 = new Computadora(
                "Huawei",
                "L15",
                new Mouse("Logitech","NJ15", false, 3),
                new Procesador("Intel", "core i9", 3.2f, 3),
                new Monitor("Sony","MJ14",64.0f,"Plasma")
        );
        System.out.println(compu2);
        //se cambio el mouse por otr nuevo
        compu2.setMouse(new Mouse("Microsoft","MS223",true,2));
        System.out.println(compu2);
        compu2.getMouse().setNumeroBotones(3);
        System.out.println(compu2);
        compu2.getProcesador().setGeneracion(compu2.getProcesador().getGeneracion()+1);
        System.out.println(compu2);
        String saludo = "HOLA";
        System.out.println(saludo.toLowerCase());
        compu2.getMouse().setMarca(compu2.getMouse().getMarca().toUpperCase());
        System.out.println(compu2);
        compu2.getMonitor().setModelo(compu2.getMonitor().getModelo().toLowerCase());
        System.out.println(compu2);
        // modelo FT32 del muse

        compu2.getMouse().setModelo("FT32");
        System.out.println(compu2);
    }
}
