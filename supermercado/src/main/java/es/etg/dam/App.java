package es.etg.dam;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Caja caja = new Caja();

        Clientes clientes = new Clientes(caja);
        Cajero cajero = new Cajero(caja);

        clientes.start();
        cajero.start();

        clientes.join();

    }
}