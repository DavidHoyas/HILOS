package es.etg.dam;

public abstract class Saludo extends Thread {

    protected String saludos;

    public void setSaludos(String saludos) {
        this.saludos = saludos;
    }

    @Override
    public void run() {
        System.out.println(saludos);
    }

}