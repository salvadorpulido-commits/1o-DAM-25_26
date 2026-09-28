package ejercicioAnalisis01Vehiculos;

import java.util.Scanner;

public class Main {

    // Calculamos la marcha correcta según la velocidad 
	
    private static int marchaParaVelocidad(int velocidad) {
        if (velocidad <= 0)   return 0;   // punto muerto
        if (velocidad <= 30)  return 1;
        if (velocidad <= 50)  return 2;
        if (velocidad <= 70)  return 3;
        if (velocidad <= 100) return 4;
        return 5;
    }

    // Imprime el estado actual del vehículo 
    
    private static void imprimirEstado(Turismo coche) {
        System.out.println("  Velocidad: " + coche.getVelocidadActual()
                + " km/h  |  Marcha: "
                + (coche.getMarchaActual() == 0 ? "punto muerto" : coche.getMarchaActual() + "ª"));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Crear el turismo 
        
        Turismo coche = new Turismo("Seat", "Ibiza", "rojo", "1234-ABC");
        System.out.println("Vehículo: " + coche);

        // Pedir datos al usuario 
        
        System.out.print("\nIntroduce la velocidad objetivo (km/h): ");
        int velocidadObjetivo = sc.nextInt();

        System.out.print("Introduce el tiempo de mantenimiento (segundos): ");
        int tiempoMantenimiento = sc.nextInt();
    
        // SIMULACIÓN
   
        System.out.println("\n── 1. REPOSO ──────────────────────────────────────");
        imprimirEstado(coche);

        //  Arrancar 
        System.out.println("\n── 2. ARRANCAR ────────────────────────────────────");
        coche.arrancar();
        imprimirEstado(coche);

        //  Acelerar subiendo marchas 
        System.out.println("\n── 3. ACELERAR ────────────────────────────────────");
        while (coche.getVelocidadActual() < velocidadObjetivo) {

            int nuevaVelocidad = Math.min(coche.getVelocidadActual() + 10, velocidadObjetivo);
            coche.setVelocidadActual(nuevaVelocidad);

            int marchaCorrecta = marchaParaVelocidad(nuevaVelocidad);
            if (marchaCorrecta > coche.getMarchaActual()) {
                coche.setMarchaActual(marchaCorrecta);
                System.out.println("  ↑ Subida a " + marchaCorrecta + "ª marcha.");
            }

            imprimirEstado(coche);
        }

        // Mantener velocidad
        
        System.out.println("\n── 4. MANTENER VELOCIDAD ──────────────────────────");
        System.out.println("  Manteniendo " + velocidadObjetivo
                + " km/h durante " + tiempoMantenimiento + " segundos...");
        try {
            Thread.sleep(tiempoMantenimiento * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("  Tiempo de mantenimiento completado.");

        // Frenar bajando marchas
        
        System.out.println("\n── 5. FRENAR ──────────────────────────────────────");
        while (coche.getVelocidadActual() > 0) {

            int nuevaVelocidad = Math.max(coche.getVelocidadActual() - 10, 0);
            coche.setVelocidadActual(nuevaVelocidad);

            int marchaCorrecta = marchaParaVelocidad(nuevaVelocidad);
            if (marchaCorrecta < coche.getMarchaActual()) {
                coche.setMarchaActual(marchaCorrecta);
                String marcha = marchaCorrecta == 0 ? "punto muerto" : marchaCorrecta + "ª";
                System.out.println("  ↓ Bajada a " + marcha + ".");
            }

            imprimirEstado(coche);
        }

        //Parar motor 
        
        System.out.println("\n── 6. PARAR MOTOR ─────────────────────────────────");
        coche.parar();
        imprimirEstado(coche);

        System.out.println("\nEstado final: " + coche);
        sc.close();
    }
}
