package ico.fesa.unam.mx.introduccion.abstractas.interfaces;

import java.awt.*;
import java.util.Objects;

public class Chaleco implements RopaInterface{
    private String maarca;
    private boolean conGorra;
    private Color color;
    private Object talla;

    public Chaleco() {
    }

    public Chaleco(String maarca, boolean conGorra, Color color, Object talla) {
        this.maarca = maarca;
        this.conGorra = conGorra;
        this.color = color;
        this.talla = talla;
    }

    public String getMaarca() {
        return maarca;
    }

    public void setMaarca(String maarca) {
        this.maarca = maarca;
    }

    public boolean isConGorra() {
        return conGorra;
    }

    public void setConGorra(boolean conGorra) {
        this.conGorra = conGorra;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Object getTalla() {
        return talla;
    }

    public void setTalla(Object talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Chaleco{" +
                "maarca='" + maarca + '\'' +
                ", conGorra=" + conGorra +
                ", color=" + color +
                ", talla=" + talla +
                '}';
    }


    @Override
    public void vestir() {
        System.out.println("Vistiendo el chaleco " + this.maarca);
    }

    @Override
    public boolean quitar() {
        System.out.println("Quitando el chaleco " + this.maarca);
        return Math.random() < 0.5;
    }

    @Override
    public String obtenerTalla() {
        return (String) this.talla;
    }

    @Override
    public boolean doblar(int dobleces) {
        for (int i = 0; i < dobleces; i++) {
            System.out.println("Hacer doblez");
        }
        return true;
    }
    // metodos de uso general


}
