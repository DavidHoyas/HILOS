package es.etg.dam;

public class Negocio {

    public static final String MENSAJE_ALFARERO = "Se ha colocado una obra de arte en la galería";
    public static final String MENSAJE_VENDEDOR = "Se ha vendido una obra de arte";
    private boolean platos = false;

    synchronized void hacer() throws InterruptedException {
        while (platos) {
            wait();
        }
        platos = true;
        System.out.println(MENSAJE_ALFARERO);
        notify();
    }

    synchronized void vender() throws InterruptedException {
        while (!platos) {
            wait();
        }
        platos = false;
        System.out.println(MENSAJE_VENDEDOR);
        notify();
    }

}
