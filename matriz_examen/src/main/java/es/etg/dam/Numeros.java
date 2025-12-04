package es.etg.dam;

public class Numeros implements Runnable {

    protected Matriz matriz;
    private int[] num1;
    private int[] num2;

    public Numeros(Matriz matriz) {
        this.matriz = matriz;
    }

    @Override
    public void run() {
        try {
            matriz.multiplicar();
            matriz.restar();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
