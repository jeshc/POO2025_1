package ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejercicioVehiculos;

public abstract class VehiculoAereo implements Vehiculo{
    public abstract void desplegarAleron();
    public abstract void despegar();

    public VehiculoAereo() {
    }

    public void aterrizar(){
        System.out.println("Aterrizando...");
    }

}
