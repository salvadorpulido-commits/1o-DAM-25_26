package forexersises;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		// Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
		
		//Abrimos Scanner
		
		Scanner reader = new Scanner(System.in);
		

        // Declaración de variables
		
		// contador del bucle
        int i;   
        // calificación introducida por el usuario
        double nota;   
        // indica si hay algún suspenso
        boolean haySuspenso = false;  
       
        // Pedimos 5 calificaciones
        for (i = 1; i <= 5; i++) {
            System.out.print("Introduce la nota del alumno " + i + ": ");
            nota = reader.nextDouble();

            // Comprobamos si la nota es suspenso
            if (nota < 5) {
                haySuspenso = true;
            }
        }

        // Mostramos el resultado final
        if (haySuspenso) {
            System.out.println("Hay al menos un suspenso entre las notas introducidas.");
        } else {
            System.out.println("Todas las notas son aprobadas.");
        }

		
		//Cerramos scanner
		
		reader.close();
		
		}

}
