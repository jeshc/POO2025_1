package org.example.modelo;

public class Contador {
    private int valor;

    public Contador() {
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Contador{" +
                "valor=" + valor +
                '}';
    }
    public int incrementar(){
        //return this.valor++; // this.valor = this.valor +1;
        return this.valor += 10; // this.valor = this.valor + 10 ;
    }
}
