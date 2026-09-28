package English_exercises;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        // Variables
        char dataType1;
        char dataType2;
        double value1;
        double value2;
        double velocity = 0;
        double displacement = 0;
        double time = 0;

        // Open Scanner
        Scanner reader = new Scanner(System.in);

        // Ask first data
        System.out.print("Give me one type of data (V, D, T): ");
        dataType1 = reader.next().toUpperCase().charAt(0);

        System.out.print("Give the value for that data: ");
        value1 = reader.nextDouble();

        // Ask second data
        System.out.print("Give me another type of data (V, D, T): ");
        dataType2 = reader.next().toUpperCase().charAt(0);

        System.out.print("Give the value for that data: ");
        value2 = reader.nextDouble();

        // Assign values depending on type
        if (dataType1 == 'V' || dataType2 == 'V') {
            velocity = (dataType1 == 'V') ? value1 : value2;
        }
        if (dataType1 == 'D' || dataType2 == 'D') {
            displacement = (dataType1 == 'D') ? value1 : value2;
        }
        if (dataType1 == 'T' || dataType2 == 'T') {
            time = (dataType1 == 'T') ? value1 : value2;
        }

        // Calculate the missing value using the formula V = D / T
        if (velocity == 0 && time != 0) {
            velocity = displacement / time;
            System.out.println("RESULT: V = " + velocity);
        } else if (displacement == 0) {
            displacement = velocity * time;
            System.out.println("RESULT: D = " + displacement);
        } else if (time == 0 && velocity != 0) {
            time = displacement / velocity;
            System.out.println("RESULT: T = " + time);
        } else {
            System.out.println("ERROR: Invalid or incomplete data.");
        }

        // Close Scanner
        reader.close();
    }
}
