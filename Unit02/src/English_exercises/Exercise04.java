package English_exercises;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

    	//Open Scanner
    	Scanner reader = new Scanner(System.in);
    	
        // Variables
         
        int amountDue, amountGiven;
        int change;
        int coins2e, coins1e, coins50c, coins20c, coins10c, coins5c, coins2c, coins1c;

        // Coin values in cents
        final int COIN_2E = 200;
        final int COIN_1E = 100;
        final int COIN_50C = 50;
        final int COIN_20C = 20;
        final int COIN_10C = 10;
        final int COIN_5C = 5;
        final int COIN_2C = 2;
        final int COIN_1C = 1;

       
        // Input
        System.out.print("Enter amount due and amount given (in cents): ");
        amountDue = reader.nextInt();
        amountGiven = reader.nextInt();

        // Calculate change
        change = amountGiven - amountDue;

        // Calculate coins
        coins2e = change / COIN_2E;
        change = change % COIN_2E;

        coins1e = change / COIN_1E;
        change = change % COIN_1E;

        coins50c = change / COIN_50C;
        change = change % COIN_50C;

        coins20c = change / COIN_20C;
        change = change % COIN_20C;

        coins10c = change / COIN_10C;
        change = change % COIN_10C;

        coins5c = change / COIN_5C;
        change = change % COIN_5C;

        coins2c = change / COIN_2C;
        change = change % COIN_2C;

        coins1c = change / COIN_1C;
        change = change % COIN_1C;

        // Output
        System.out.println(coins2e + " " + coins1e + " " + coins50c + " " + coins20c + " "
                + coins10c + " " + coins5c + " " + coins2c + " " + coins1c);

        // Close scanner
        reader.close();
    }
}

