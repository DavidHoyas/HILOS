package es.etg.dam;

import java.util.concurrent.Exchanger;

public class App {


    public static void main(String[] args) {

        Exchanger exchanger = new Exchanger<>();

        Thread h1 = new Thread(new Mensajes(exchanger));
        Thread h2 = new Thread(new Mensajes(exchanger));

        h1.start();
        h2.start();

    }
}
