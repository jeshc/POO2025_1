package ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejercicioVehiculos;

import java.awt.*;

public class MainVehiculos {
    public static void main(String[] args) {
        Coche car = new Coche("VW","Vento");
        Helicoptero helicoptero = new Helicoptero(2, false);
        car.frenar();
        helicoptero.frenar();
        car.cabiarMneumatico();
        helicoptero.despegar();

    }
}
