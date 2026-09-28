package englishExercisesPart02;

import java.util.Scanner;   

public class Exercise04 {

    public static void main(String[] args) {
        
    	/*
    	 * The following pseudocode has been arrived at for a program that converts 
    	 * pounds to kilos (1 kilo = 2.2 lb):
    	 * BEGIN
    	 * PROMPT for value in pounds
    	 * ENTER value in pounds
    	 * SET value to old value ÷ 2.2
    	 * DISPLAY value in kilos
    	 * END
    	 * Implement this program, remembering to declare any variables that are necessary.
    	 */
    	
        // Creamos Scanner
        Scanner sc = new Scanner(System.in);
        
        //Declaramos variable Libras
        
        double pounds;
        
        //Declaramos variable Kilogramos
        
        double kilos;
        
        // Pedimos al usuario que introduzca el valor en libras
        System.out.print("Enter the value in pounds: ");
        pounds = sc.nextDouble(); 
        
        // Convertimos libras a kilos dividiendo entre 2.2 (ya que 1 kilo = 2.2 libras)
        kilos = pounds / 2.2;
        
        // Mostramos el resultado en pantalla
        System.out.println(pounds + " pounds are equivalent to " + kilos + " kilos.");
        
        // Cerramos Scanner
        sc.close();
    }
}

