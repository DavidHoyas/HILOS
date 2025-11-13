package es.etg.dam;

public class Hilo extends Thread {
    private Contador contador;
    private App app;

    public Hilo(Contador c) {
        contador = c;
    }

    @Override
    public void run() {

        for (int i = 0; i < app.TOTAL; i++) {
            contador.sumar();
        }

    }
}