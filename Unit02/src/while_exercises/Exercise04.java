package while_exercises;

import java.util.Scanner;

public class Exercise04 {

		    public static void main(String[] args) {
		        Scanner reader = new Scanner(System.in);
		        int numero;
		        int contador;
		        int sumaPositivos;
		        int sumaNegativos;
		        int contadorNegativos;
		        int contadorCeros;
		        double mediaNegativos;

		        contador = 0;
		        sumaPositivos = 0;
		        sumaNegativos = 0;
		        contadorNegativos = 0;
		        contadorCeros = 0;
		        mediaNegativos = 0;

		        System.out.println("Introduce 10 números enteros (positivos, negativos o cero):");

		        while (contador < 10) {
		            System.out.print("Número " + (contador + 1) + ": ");
		            numero = reader.nextInt();

		            if (numero > 0) {
		                sumaPositivos = sumaPositivos + numero;
		            } else if (numero < 0) {
		                sumaNegativos = sumaNegativos + numero;
		                contadorNegativos = contadorNegativos + 1;
		            } else {
		                contadorCeros = contadorCeros + 1;
		            }

		            contador = contador + 1;
		        }

		        if (contadorNegativos > 0) {
		            mediaNegativos = (double) sumaNegativos / contadorNegativos;
		        }

		        System.out.println("Suma de los números positivos: " + sumaPositivos);
		        System.out.println("Media de los números negativos: " + mediaNegativos);
		        System.out.println("Cantidad de ceros introducidos: " + contadorCeros);

		        reader.close();

	}

}
