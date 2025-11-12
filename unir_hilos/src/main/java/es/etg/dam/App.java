package es.etg.dam;

public class App {

    public final static String EJECUCION_ANALISIS_DISEÑO = "Ejecuto la tarea análisis y la tarea diseño";
    public final static String MENSAJE_ESPERA = "Espero a que acaben las tareas análisis y diseño para ejecutar las tareas codificación y pruebas";
    public final static String EJECUCION_CODIFICACION = "Ejecuto codificación";
    public final static String EJECUCION_PRUEBAS = "Ejecuto pruebas";
    public static void main(String[] args) throws InterruptedException{

        Tarea analisis = new Tarea("análisis",3000);
        Tarea diseño = new Tarea("diseño",2000);
        Tarea codificacion = new Tarea("codificación",1000);
        Tarea pruebas = new Tarea("pruebas",2000);
    
        System.out.println(EJECUCION_ANALISIS_DISEÑO);
        analisis.start();
        diseño.start();   

        System.out.println(MENSAJE_ESPERA);
        analisis.join();
        diseño.join();

        System.out.println(EJECUCION_CODIFICACION);
        codificacion.start();  

        System.out.println(EJECUCION_PRUEBAS);
        pruebas.start();  
    }
}