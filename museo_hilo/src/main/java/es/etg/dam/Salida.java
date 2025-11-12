package es.etg.dam;

public class Salida implements Runnable {

    protected Sala sala;

    public Salida(Sala sala) {
        this.sala = sala;
    }

    @Override
    public void run() {
        sala.decrementar();
    }
}
