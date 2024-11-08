package org.example;

public class Contador extends Thread{

    private int idThread;

    public Contador(String name, int idThread) {
        super(name);
        this.idThread = idThread;
    }

    public int getIdThread() {
        return idThread;
    }

    public void setIdThread(int idThread) {
        this.idThread = idThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(this.getName() + " ID: "
                    + this.idThread + " Cont: " + i);
        }
    }
}
