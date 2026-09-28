package englishExercisesPart02;

import java.time.Year;

import java.util.Scanner;   

public class Exercise02 {

    public static void main(String[] args) {
    	
    	/*
		 * Implement a program that prompts for the user’s age 
		 * and then attempts to work out the year in which the user was born.
		 */
        
        // Creamos Scanner
        Scanner sc = new Scanner(System.in);
        
        //Creamos variable edad
        
        int age;
        
        //Creamos variable año en curso
        
        int currentYear;
        
        //Variable fecha de nacimiento
        
        int birthYear;
        
        // Pedimos al usuario que introduzca su edad
        System.out.print("Please enter your age: ");
        age = sc.nextInt();   
        
        // Obtenemos el año actual usando la clase Year del paquete java.time
        currentYear = Year.now().getValue();
        
        // Calculamos el año de nacimiento restando la edad al año actual
        birthYear = currentYear - age;
        
        // Mostramos el resultado en pantalla
        System.out.println("You were born in approximately: " + birthYear);
        
        // Cerramos el Scanner
        sc.close();
    }
}
