package ico.fesa.unam.mx.ejerciciointegrador;

public class Biblioteca {
    public static void main(String[] args) {
        Libro libro1=new Libro(1,
                "El Perfume",
                328,
                2004,
                "63632784b",
                "Planeta",
                "Novela",
                "random",
                "bolsillo",
                new Autor("Patric ","Suskind","Alemania"));
        System.out.println(libro1);
        libro1.setAutor(new Autor("Vladimir","Navokov","Rusia"));
        System.out.println(libro1);
        Revista revista1=new Revista(3,
                "TV Novelas",
                26,
                2024,
                "273638g",
                "Televisa",
                "Chismes",
                "Enero",
                "Corren a Adrian Marcelo de LCDLFMS");
        System.out.println(revista1);
        revista1.setMesPublicacion("Agosto");
        System.out.println(revista1);















    }
}
