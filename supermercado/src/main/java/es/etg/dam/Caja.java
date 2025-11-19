package es.etg.dam;

public class Caja {

    public static final int TIEMPO_MAX = 1;
    public static final double TIEMPO_MIN = 0.5;
    public static final double TIEMPO_MEDIO = 0.5 + Math.random() * 0.5;
    public static final String MENSAJE_CLIENTE = "El cliente ha pagado su compra";
    public static final String MENSAJE_CAJA = "El cajero cobra al cliente por su compra";
    public static final String MENSAJE_TIEMPO = "Esto es el tiempo que se ha tardado en ejecutar la compra: ";
    private int num_clientes = 1;

    synchronized void cobrar() throws InterruptedException {

        while (num_clientes == 0) {
            wait();
        }
        num_clientes++;
        System.out.println(MENSAJE_CAJA);
        notify();

    }


    synchronized void pagar() throws InterruptedException {

        while (num_clientes == 1) {
            wait(); 
            
        }
        num_clientes--;
        System.out.println(MENSAJE_CLIENTE);
        double tiempo = TIEMPO_MEDIO;
        System.out.println(MENSAJE_TIEMPO + tiempo);
        notify();

    }
    
    
}
