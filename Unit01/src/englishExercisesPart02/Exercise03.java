package englishExercisesPart02;

import java.util.Scanner;  

public class Exercise03 {

    public static void main(String[] args) {
    	
    	/*
    	 * Design a program that asks the user to enter values for the length and height of a 
    	 * rectangle and then displays the area and perimeter of that rectangle.
    	 */

        
        // Creamos Scanner 
        Scanner sc = new Scanner(System.in);
        
        //Variable longitud
        double length;
        
        //Variable altura
        double height;
        
        //Variable area
        double area;
                
        //Variable perimetro
        double perimeter;
        
        // Pedimos al usuario que introduzca la longitud del rectángulo
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();   
        
        // Pedimos al usuario que introduzca la altura del rectángulo
        System.out.print("Enter the height of the rectangle: ");
       height = sc.nextDouble();   
        
        // Calculamos el área del rectángulo usando la fórmula: área = longitud × altura
        area = length * height;
        
        // Calculamos el perímetro del rectángulo: perímetro = 2 × (longitud + altura)
        perimeter = 2 * (length + height);
        
        // Mostramos los resultados al usuario
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        
        // Cerramos Scanner 
        sc.close();
    }
}

