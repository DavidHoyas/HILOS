package es.etg.dam;

public class App {

    public static final String AFORO = "Visitantes: ";
    public static final String TOTAL = "Total de Visitantes: ";

    public static void main(String[] args) {
        Sala sala = new Sala();
        for (int i = 0; i < 10; i++) {
            Thread entrada = new Thread(new Entrada(sala));
            entrada.start();
            System.out.println(AFORO + sala.getVisitantes());
            
        }
        
        for (int i = 0; i < 15; i++) {
            Thread salida = new Thread(new Salida(sala));
            salida.start();
            System.out.println(AFORO + sala.getVisitantes());
            
        }
    
        System.out.println(TOTAL + sala.visitantes);

    }
    
}