package es.etg.dam;

class Tareas extends Thread{

    //Tarea a realizar
    public void run(){
        System.out.println("Esto se ha ejecutado en thread"+ this.getId());
    }
}
