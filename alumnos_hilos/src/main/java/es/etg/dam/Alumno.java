package es.etg.dam;

class Alumno extends Thread {

    protected static final int MIN_NUMERO = 1;
    protected static final int MAX_NUMERO = 10;
    protected static final String MSG_ERROR = " Error al contar.";
    protected static final String MESSAGE = " cuenta: ";

    protected String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        contar();
    }

    public void contar() {
        try {
            for (int i = MIN_NUMERO; i <= MAX_NUMERO; i++) {
                System.out.println(nombre + MESSAGE + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(nombre + MSG_ERROR);
        }
    }
}
