package Bucles;

import java.util.Scanner;

public class Exercise04 {
	
	/*De forma similar a la actividad 3, realiza un programa 
	 * que calcule el mínimo común múltiplo de dos números dados. 
	 * En este caso, habrá que partir del máximo de los dos e ir 
	 * incrementando hasta encontrar el primer número que sea múltiplo 
	 * de los dos números.
	 */


    public static void main(String[] args) {

        // Primer número
        int num1;

        // Segundo número
        int num2;

        // Máximo común múltiplo
        int mcm = 0;

        // Variable donde almacenar el máximo de los dos números
        int max;

        // Variable para ir probando números
        int candidato;

        // Scanner para leer los números
        Scanner reader = new Scanner(System.in);

        // Pedimos dos números al usuario
        System.out.println("Introduzca el primer número:");
        num1 = reader.nextInt();

        System.out.println("Introduzca el segundo número:");
        num2 = reader.nextInt();

        // Obtenemos el mayor de los dos números
        max = Math.max(num1, num2);

        // El primer candidato será el máximo
        candidato = max;

        // Mientras no encontremos un múltiplo común
        while (mcm == 0) {
            // Si el candidato es múltiplo de ambos, ya tenemos el m.c.m.
            if (candidato % num1 == 0 && candidato % num2 == 0) {
                mcm = candidato;
            } else {
                // Si no, probamos con el siguiente número
                candidato++;
            }
        }

        // Mostramos el resultado
        System.out.println("El m.c.m. de " + num1 + " y " + num2 + " es: " + mcm);

        // Cerramos Scanner
        reader.close();

    }

}
