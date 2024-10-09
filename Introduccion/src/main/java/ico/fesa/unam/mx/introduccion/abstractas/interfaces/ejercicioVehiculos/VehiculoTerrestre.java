package ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejercicioVehiculos;

import java.awt.*;

public abstract class VehiculoTerrestre implements Vehiculo {
    private Color color;

    public abstract void cabiarMneumatico();

    public abstract void encenderLuces();

    public void sonarClaxon() {
        System.out.println("mit MIT !!!");
    }

    public void abrirVentanas() {
        System.out.println("Abriendo ventanas");
    }

    public void acelerar() {
        System.out.println("Acelarando...");
    }

}
