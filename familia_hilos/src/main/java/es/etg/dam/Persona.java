package es.etg.dam;

import java.util.Random;

abstract class Persona extends Thread {

    protected static final int TIEMPO_MIN = 3000;
    protected static final int TIEMPO_MAX = 10000;
    protected static final String MENSAJE_LEVANTARSE = " se ha levantado tras ";
    protected static final String UNIDAD_SEGUNDOS = " segundos. ";
    protected static final String MSG_ERROR = " no se ha podido levantar.";

    protected String nombre;
    protected Random rand = new Random();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            int tiempo = TIEMPO_MIN + rand.nextInt(TIEMPO_MAX - TIEMPO_MIN);
            Thread.sleep(tiempo);
            System.out.println(nombre + MENSAJE_LEVANTARSE + (tiempo / 1000.0) + UNIDAD_SEGUNDOS);
            
        } catch (InterruptedException interrupcionAlDespertar) {
            System.out.println(nombre + MSG_ERROR);
        }
    }
}