package es.etg.dam;

public class Entrada implements Runnable {

    protected Sala sala;

    public Entrada(Sala sala) {
        this.sala = sala;
    }

    @Override
    public void run() {
        sala.incrementar();
    }
}
