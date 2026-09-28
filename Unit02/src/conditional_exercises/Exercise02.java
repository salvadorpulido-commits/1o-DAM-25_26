package conditional_exercises;

import java.util.Scanner;

public class Exercise02 {
    /* Pruebas realizadas (mínimas):
     * Entrada: 5.5
     *- Esperado: 5.5
     *- Obtenido: 5.5
     *Entrada: -3.2
     *- Esperado: 3.2
     *- Obtenido: 3.2
     * Entrada: 0
     * - Esperado: 0
     * - Obtenido: 0
    */

    public static void main(String[] args) {
        // Crear un Scanner llamado 'reader' para leer desde teclado
        Scanner reader = new Scanner(System.in);

        // Pedir al usuario un número de tipo float
        System.out.print("Introduce un número (puede ser decimal): ");

        // Leer el número introducido por el usuario y guardarlo como float
        float num = reader.nextFloat();

        // Calcular el valor absoluto usando el operador ternario
        // Si num es menor que 0, se convierte a positivo multiplicando por -1; si no, se queda igual
        float absoluto = (num < 0) ? -num : num;

        // Mostrar el resultado por pantalla
        System.out.println("El valor absoluto es: " + absoluto);

        // Cerrar el Scanner
        reader.close();
    }
}
