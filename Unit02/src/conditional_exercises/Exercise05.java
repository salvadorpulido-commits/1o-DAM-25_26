package conditional_exercises;

import java.util.Scanner;

public class Exercise05 {
    /*
    Pruebas realizadas (mínimas):
    Entrada: distancia=500, dias=5
      - Esperado: Precio=1250.0
      - Obtenido: 1250.0
    Entrada: distancia=900, dias=8
      - Esperado: Precio con 30% descuento=1575.0
      - Obtenido: 1575.0
    Entrada: distancia=1000, dias=7
      - Esperado: Precio normal=2500.0
      - Obtenido: 2500.0
    Entrada: distancia=-50, dias=5
      - Esperado: Error
      - Obtenido: Error
    Entrada: distancia=200, dias=-3
      - Esperado: Error
      - Obtenido: Error
    */

    public static void main(String[] args) {
        // Crear Scanner llamado 'reader' para leer datos
        Scanner reader = new Scanner(System.in);

        // Pedir la distancia a recorrer en km
        System.out.print("Introduce la distancia a recorrer (km): ");
        double distancia = reader.nextDouble();

        // Pedir el número de días de estancia
        System.out.print("Introduce el número de días de estancia: ");
        int dias = reader.nextInt();

        // Validar que los valores sean positivos
        if (distancia <= 0 || dias <= 0) {
            System.out.println("Error: la distancia y los días deben ser mayores que 0.");
        } else {
            // Precio por kilómetro
            double precioBase = distancia * 2.5;

            // Inicializamos precio final con el precio base
            double precioFinal = precioBase;

            // Aplicar descuento del 30% si estancia >7 días y distancia >800 km
            if (dias > 7 && distancia > 800) {
                precioFinal = precioBase * 0.7; // 30% de descuento
            }

            // Mostrar el precio final
            System.out.println("El precio del billete es: " + precioFinal + " €");
        }

        // Cerrar el Scanner
        reader.close();
    }
}