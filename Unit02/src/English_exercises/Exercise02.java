package English_exercises;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        
        // Variables
        double amount;
        double rate;           // interest earned
        char accountType;
        
        // Interest rates
        final double RATE_A = 1.5;
        final double RATE_B = 2.0;
        final double RATE_C = 1.5;
        final double RATE_X = 5.0;
        
        //Open Scanner
        Scanner reader = new Scanner(System.in);
        
        //Ask user input money
        System.out.print("Enter the amount of money: ");
        amount = reader.nextDouble();
        
        //Start Operations
        if (amount < 0) {
            System.out.println("ERROR: Money cannot be negative.");
        } else {
            
            // Input account type
            System.out.print("Enter the account type (A, B, C, X): ");
            accountType = reader.next().toUpperCase().charAt(0);
            
            // Calculate interest
            switch (accountType) {
                case 'A':
                    rate = (amount * RATE_A) / 100;
                    System.out.println("You can earn " + rate + " EUR in a year.");
                    break;
                case 'B':
                    rate = (amount * RATE_B) / 100;
                    System.out.println("You can earn " + rate + " EUR in a year.");
                    break;
                case 'C':
                    rate = (amount * RATE_C) / 100;
                    System.out.println("You can earn " + rate + " EUR in a year.");
                    break;
                case 'X':
                    rate = (amount * RATE_X) / 100;
                    System.out.println("You can earn " + rate + " EUR in a year.");
                    break;
                default:
                    System.out.println("ERROR: Invalid account type.");
                    break;
            }
        }
        
        // Close scanner
        reader.close();
    }
}


