package ejercicio01;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Probando clase Hora ---");
        Hora h1 = new Hora(23, 59);
        System.out.println("Hora inicial: " + h1.toString()); // Imprime 23:59
        h1.inc();
        System.out.println("Tras hacer un inc(): " + h1.toString()); // Imprime 0:00
        
        System.out.println("\n--- Probando clase HoraExacta ---");
        HoraExacta he1 = new HoraExacta(3, 5, 59);
        System.out.println("Hora Exacta inicial: " + he1.toString()); // Imprime 03:05:59
        he1.inc();
        System.out.println("Tras hacer un inc(): " + he1.toString()); // Imprime 03:06:00
        
        // Prueba de validaciones
        System.out.println("\n--- Probando validaciones ---");
        HoraExacta he2 = new HoraExacta(25, 70, -5); // Valores inválidos
        System.out.println("Hora creada con valores inválidos: " + he2.toString()); // Imprime 00:00:00
    }
}