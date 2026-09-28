package while_exercises;
		
import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
	    int numero;
	    int contador = 0;

	    System.out.println("Introduce números enteros positivos. Para terminar, introduce un número negativo.");

	    numero = 0; // Inicializamos la variable

	    while (numero >= 0) {
	      System.out.print("Número: ");
	      numero = reader.nextInt();

		  if (numero >= 0) {
		  contador++;
		            }
		        }

		        System.out.println("Has introducido " + contador + " números positivos.");
		        reader.close();
		    }
	
	}
