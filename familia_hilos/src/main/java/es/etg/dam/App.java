package es.etg.dam;

public class App {

    protected static final String NOMBRE_MADRE1 = "Cristina";
    protected static final String NOMBRE_MADRE2 = "Sonia";
    protected static final String NOMBRE_HIJO = "David";
    protected static final String NOMBRE_HIJA = "María";

    protected static final String MSG_DESPERTADOR = "Suena el despertador";

    public static void main(String[] args) {
        Persona madre1 =new Madre(NOMBRE_MADRE1);
        Persona madre2 = new Madre(NOMBRE_MADRE2);
        Persona hijo = new Hijo(NOMBRE_HIJO);
        Persona hija = new Hija(NOMBRE_HIJA);

        System.out.println(MSG_DESPERTADOR);

        madre1.start();
        madre2.start();
        hijo.start();
        hija.start();
    }
    
}
