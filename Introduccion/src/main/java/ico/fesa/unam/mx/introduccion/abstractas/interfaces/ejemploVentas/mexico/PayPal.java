package ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas.mexico;

import ico.fesa.unam.mx.introduccion.abstractas.interfaces.ejemploVentas.MetodoPago;

import java.util.Scanner;

public class PayPal implements MetodoPago {
    private String usuario;
    private String password;
    private Scanner teclado;

    public PayPal() {
        teclado = new Scanner(System.in);
    }

    public PayPal(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
        teclado = new Scanner(System.in);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    @Override
    public boolean realizarPago(double monto) {
        boolean resultado = false;
        String pssBD = "dios1234";
        String userBD = "jose";
        System.out.println("Iniciando el login el paypal via API REST");
        System.out.print("Proporcionar usuario:");
        this.usuario = teclado.nextLine();
        System.out.print("Proporcionar contraseña:");
        this.password = teclado.nextLine();
        if (this.usuario.equals(userBD) && this.password.equals(pssBD)) {
            System.out.println("El pago por $" + monto + " se ha realizado con éxito...");
            resultado = true;
        }else
            System.out.println("Credenciales no válidas");
        return resultado;
    }

    @Override
    public boolean realizarPago(double monto, int cuenta) {
        boolean resultado = false;
        String pssBD = "dios1234";
        String userBD = "jose";
        System.out.println("Iniciando el login el paypal via API REST");
        System.out.print("Proporcionar usuario:");
        this.usuario = teclado.nextLine();
        System.out.print("Proporcionar contraseña:");
        this.password = teclado.nextLine();
        if (this.usuario.equals(userBD) && this.password.equals(pssBD)) {
            System.out.println("El pago por $" + monto + " se ha realizado con éxito, a la cuenta " + cuenta);
            resultado = true;
        }else
            System.out.println("Credenciales no válidas");
        return resultado;
    }
}
