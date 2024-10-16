package ico.fesa.unam.mx.introduccion.excepciones;

public class TipoOperadorException extends Exception{

    public TipoOperadorException() {
    }

    public TipoOperadorException(String message) {
        super(message);
    }

    public String getMensaje(){
        return "Debe ser entre 1 y 4";
    }

}
