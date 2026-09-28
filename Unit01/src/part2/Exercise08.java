package part2;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {
        /* La FILA realiza una competición donde cada participante escribe un algoritmo en un papel y lo lanza.
         * La longitud del lanzamiento se mide en metros (con decimales), 
         * pero para el ranking solo se tiene en cuenta la longitud en centímetros (sin decimales).
         * 
         * Realiza un programa que solicite la longitud (en metros) de un lanzamiento 
         * y muestre la parte entera correspondiente en centímetros.
         * Utiliza la conversión de tipos.
         */

        // Creamos scanner
        Scanner sc = new Scanner(System.in);
        
        //Declaramos variables
        double metros
        double centimetros
        int centimetrosEnteros

        // Pedir la longitud en metros
        System.out.print("Introduce la longitud del lanzamiento en metros: ");
        double metros = sc.nextDouble();

        // Conversión a centímetros
        double centimetros = metros * 100;

        // Obtener la parte entera
        int centimetrosEnteros = (int) centimetros;

        // Mostrar el resultado
        System.out.println("La longitud a tener en cuenta es: " 
                           + centimetrosEnteros + " cm");

        // Cerramos scanner
        sc.close();
    }
}
