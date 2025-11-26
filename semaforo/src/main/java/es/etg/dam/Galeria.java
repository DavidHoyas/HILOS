package es.etg.dam;

public class Galeria {

    public static final int VENTA = 10;
    public static void main(String[] args) throws InterruptedException {

        Negocio negocio = new Negocio();

        for (int i = 0; i < VENTA; i++) {
            Alfarero alfarero = new Alfarero(negocio);
            alfarero.start();
                   
            Vendedor vendedor = new Vendedor(negocio);
            vendedor.start();     
        }

    }
}