package es.etg.dam;

public class ProgramaHilos {
    public static void main(String[] args) {
        Tareas t1 = new Tareas();
        Tareas t2 = new Tareas();
    
        t1.start();
        t2.start();   
    }
}