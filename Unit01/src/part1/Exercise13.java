package part1;

import java.util.Scanner;

public class Exercise13 {
	
	public static void main(String[] args) {
		
		/*
		 * Pedir al usuario mediante booleno si llueve, si ha terminado las tareas y
		 * si tiene que ir a la biblioteca
		 * mostrar mesaje que identifique si puede salir
		 */
		//Creamos scanner
		Scanner reader = new Scanner(System.in);

        //Variable lluvia, tareas y biblioteca

        boolean estaLloviendo;
        boolean tareasTerminadas;
        boolean irBiblioteca;
        
        // Variable para saber si puedo salir a la calle
        boolean salir;

        // Preguntamos al usuario   
     	System.out.println("¿Está lloviendo?");
     	estaLloviendo = reader.nextBoolean();

     	System.out.println("¿Has terminado las tareas?");
     	tareasTerminadas = reader.nextBoolean();

     	System.out.println("¿Tienes que ir a la biblioteca?");
     	irBiblioteca = reader.nextBoolean();

     	/* si no está lloviendo y hemos finalizado nuestras tareas. indistintamente de
     	 * lo anterior, podremos salir a la calle: el hecho de tener que ir a la 
     	 * biblioteca.
     	*/
     	
     	
     	salir = (!estaLloviendo && tareasTerminadas) || irBiblioteca;
     	
     	//Respondemos     		
     	System.out.println("¿Puedo salir a la calle? " + salir );
     	
        //cerramos scanner
     	reader.close();
     	}

}
