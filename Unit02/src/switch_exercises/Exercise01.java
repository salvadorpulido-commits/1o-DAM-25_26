package switch_exercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		
		//Abrimos Scanner	
		Scanner reader = new Scanner(System.in);
		
		//Pedimos que introduzca la nota        
		System.out.print("Introduce una nota entera (0 a 10): ");
		int nota = reader.nextInt();

		//Calcula la nota y devuelve valor 
		switch (nota) {
		            case 0:
		            case 1:
		            case 2:
		            case 3:
		            case 4:
		                System.out.println("Insuficiente");
		                break;
		            case 5:
		                System.out.println("Suficiente");
		                break;
		            case 6:
		                System.out.println("Bien");
		                break;
		            case 7:
		            case 8:
		                System.out.println("Notable");
		                break;
		            case 9:
		            case 10:
		                System.out.println("Sobresaliente");
		                break;
		            default:
		                System.out.println("Nota no válida. Debe estar entre 0 y 10.");
		                break;
		        }
		        reader.close();
		        
		    }
		}
