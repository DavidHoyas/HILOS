package es.etg.dam;

import java.util.concurrent.CountDownLatch;

public class CuentaAtras {

    public static final String MENSAJE_ACABADO = "Han llegado todos los camiones";
    public static final String LLEGADA_CAMION1 = "camión1";
    public static final String LLEGADA_CAMION2 = "camión2";
    public static final String LLEGADA_CAMION3 = "camión3";
    public static final String LLEGADA_CAMION4 = "camión4";
    public static final String LLEGADA_CAMION5 = "camión5";
    public static void main(String[] args) throws Exception {

        CountDownLatch cuenta = new CountDownLatch(5);


        Camiones c1 = new Camiones(cuenta, LLEGADA_CAMION1);
        Camiones c2 = new Camiones(cuenta, LLEGADA_CAMION2);
        Camiones c3 = new Camiones(cuenta, LLEGADA_CAMION3);
        Camiones c4 = new Camiones(cuenta, LLEGADA_CAMION4);
        Camiones c5 = new Camiones(cuenta, LLEGADA_CAMION5);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();

        cuenta.await();

        System.out.println(MENSAJE_ACABADO);
    }
}