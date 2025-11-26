package es.etg.dam;

import java.util.concurrent.Exchanger;

public class Mensajes implements Runnable {

    public static final String MENSAJE_HILO1 = "Hilo1 envía: Hola!";
    public static final String MENSAJE_HILO2 = "Hilo2 envía: Adios!";

    private Exchanger<String> exchanger = new Exchanger<>();

    String mensaje_recibido;

    public Mensajes(Exchanger exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {

        try {
            mensaje_recibido = exchanger.exchange(MENSAJE_HILO1);
            System.out.println(mensaje_recibido);

            System.out.println(MENSAJE_HILO2);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
