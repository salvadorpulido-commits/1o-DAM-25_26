package while_exercises;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero;
        int contador;
        int suma;
        double media;

        contador = 0;
        suma = 0;
        numero = 0;
        media = 0;

        System.out.println("Introduce números enteros positivos. Para terminar, introduce un número negativo.");

        while (numero >= 0) {
            System.out.print("Número: ");
            numero = reader.nextInt();

            if (numero >= 0) {
                suma = suma + numero;
                contador = contador + 1;
            }
        }

        if (contador > 0) {
            media = (double) suma / contador;
            
            System.out.println("La media de los números positivos es: " + media);
            
        } else {
            System.out.println("No has introducido ningún número positivo.");

        }

        reader.close();
        
    }
    
}

