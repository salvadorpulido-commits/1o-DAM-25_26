package part2;

import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {
        /* Cada problema tiene un identificador único, empezando en 100.
         * Los problemas se archivan en volúmenes de 100 problemas cada uno.
         * 
         * Dado un identificador de problema, determinar en qué volumen está.
         * Por ejemplo:
         *  - Problemas 100-199 -> volumen 1
         *  - Problemas 200-299 -> volumen 2
         */

        // Creamos scanner
        Scanner sc = new Scanner(System.in);
        
        //Declaramos variables
        int idProblema
        int volumen

        // Pedir el identificador del problema
        System.out.print("Introduce el identificador del problema: ");
        int idProblema = sc.nextInt();

        // Cálculo del volumen
        // Restamos 100 para empezar desde 0 y luego dividimos entre 100
        int volumen = (idProblema - 100) / 100 + 1;

        // Mostrar el resultado
        System.out.println("El problema " + idProblema + " está en el volumen " + volumen);

        // Cerramos scanner
        sc.close();
    }
}
