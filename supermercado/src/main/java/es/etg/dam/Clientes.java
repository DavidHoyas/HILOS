package es.etg.dam;

public class Clientes extends  Thread{

    protected Caja caja;

    public Clientes(Caja caja) {
        this.caja = caja;
    }
    
    @Override
    public void run() {
        try {
            caja.pagar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
