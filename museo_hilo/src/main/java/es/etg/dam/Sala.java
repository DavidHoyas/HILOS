package es.etg.dam;

public class Sala {

    protected int visitantes = 100;

    public void incrementar() {
        visitantes++;
    }

    public void decrementar() {
        visitantes--;
    }

    synchronized int getVisitantes() {
        return visitantes;
        
    }
}
