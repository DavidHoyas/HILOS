package es.etg.dam;

public class Vendedor extends Thread{

    protected Negocio negocio;

    public Vendedor(Negocio negocio) {
        this.negocio = negocio;
    }

    @Override
    public void run() {
        try {
            negocio.vender();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
