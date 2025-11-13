package es.etg.dam;

class App {

    public final static int TOTAL = 100;

    public static void main(String[] args) throws InterruptedException {

        Contador contador = new Contador();

        for (int i = 0; i < TOTAL; i++) {
            Hilo h = new Hilo(contador);
            h.start();
        }
        Thread.sleep(TOTAL*10);
        System.out.println(contador.getTotal());

    }

}





