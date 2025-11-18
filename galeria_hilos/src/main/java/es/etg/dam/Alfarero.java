package es.etg.dam;

public class Alfarero extends Thread{
    
    protected Negocio negocio;

    public Alfarero(Negocio negocio) {
        this.negocio = negocio;
    }

    @Override
    public void run() {
        try {
            negocio.hacer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
