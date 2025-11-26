package es.etg.dam;

import java.util.concurrent.Semaphore;

public class Negocio {

    public static final String MENSAJE_ALFARERO = "Se ha colocado una obra de arte en la galería";
    public static final String MENSAJE_VENDEDOR = "Se ha vendido una obra de arte";

    private Semaphore producir = new Semaphore(1);

    private Semaphore vender = new Semaphore(0);

    public void hacer() throws InterruptedException {
        producir.acquire();
        System.out.println(MENSAJE_ALFARERO);
        vender.release();
    }

    public void vender() throws InterruptedException {
        vender.acquire();
        System.out.println(MENSAJE_VENDEDOR);
        producir.release();
    }
}
