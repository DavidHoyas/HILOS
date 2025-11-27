package es.etg.dam;

import java.util.concurrent.CountDownLatch;

public class Camiones extends Thread{

    public static final String MENSAJE_CAMIONES = "Ha llegado el camión: ";

    private CountDownLatch cuenta;
    private String id;

    public Camiones(CountDownLatch cuenta, String id) {
        this.cuenta = cuenta;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println(MENSAJE_CAMIONES + this.id);
            cuenta.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
