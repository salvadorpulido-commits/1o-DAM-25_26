package englishExercisesPart02;

import java.util.Scanner;   

public class Exercise05 {

    public static void main(String[] args) {
    	
    	/*
    	 * An individual’s Body Mass Index (BMI) is a measure of a person’s weight 
    	 * in relation to their height. It is calculated as follows:
    	 * Divide a person’s weight (in kg) by the square of their height (in meters)
    	 */
        
        // Creamos Scanner
        Scanner sc = new Scanner(System.in);
        
        //Declaramos variable Peso
        double weight;
        
        //Declaramos variable Altura
        
        double height;
        
        //Declaramos variable Indice masa corporal
        
        double bmi;
        
        // Pedimos al usuario que introduzca su peso en kilogramos
        System.out.print("Enter your weight in kilograms: ");
        weight = sc.nextDouble();  
        
        // Pedimos al usuario que introduzca su altura en metros
        System.out.print("Enter your height in meters: ");
        height = sc.nextDouble(); 
        
        // Calculamos el BMI usando la fórmula: peso / (altura al cuadrado)
        bmi = weight / (height * height);
        
        // Mostramos el resultado al usuario
        System.out.println("Your Body Mass Index (BMI) is: " + bmi);
        
        // Cerramos Scanner
        sc.close();
    }
}
