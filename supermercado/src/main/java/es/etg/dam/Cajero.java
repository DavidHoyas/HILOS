package es.etg.dam;

public class Cajero extends Thread{

    protected Caja caja;

    public Cajero(Caja caja) {
        this.caja = caja;
    }

    @Override
    public void run() {
        try {
            caja.cobrar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
