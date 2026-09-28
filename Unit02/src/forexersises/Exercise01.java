package forexersises;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {

        // Declaración de variables
        int n;
        int i;
        
        //Abrimos Scanner
        Scanner reader = new Scanner(System.in);

        // Pedimos al usuario el número
        System.out.print("Introduce un número: ");
        n = reader.nextInt();

        // Bucle for para contar del 1 al n
        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // Cerramos el scanner
        reader.close();
    }
}
