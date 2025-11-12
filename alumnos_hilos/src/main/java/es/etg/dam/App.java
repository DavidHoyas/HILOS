package es.etg.dam;

public class App {
    public static void main(String[] args) {

        String[] alumnos = {"alumno1", "alumno2", "alumno3", "alumno4", "alumno5", "alumno6", "alumno7", "alumno8", "alumno9", "alumno10"};

        for(String alum : alumnos) {
            new Alumno(alum).start();
        }

    }

}
