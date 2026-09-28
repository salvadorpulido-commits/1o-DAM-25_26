package conditional_exercises;

import java.util.Scanner;

public class Exercise03 {
    /*
    Pruebas realizadas (mínimas):
    Entrada: 12345678
      - Esperado: Z
      - Obtenido: Z
    Entrada: 00000000
      - Esperado: T
      - Obtenido: T
    Entrada: 99999999
      - Esperado: R
      - Obtenido: R
    Entrada: -5
      - Esperado: error (fuera de rango)
      - Obtenido: error (fuera de rango)
    Entrada: 123456789
      - Esperado: error (fuera de rango)
      - Obtenido: error (fuera de rango)
    */

    public static void main(String[] args) {
        // Crear el Scanner con el nombre 'reader'
        Scanner reader = new Scanner(System.in);

        // Pedir al usuario el número del DNI (solo la parte numérica)
        System.out.print("Introduce el número del DNI (0 a 99999999): ");

        // Leer el número introducido
        int dni = reader.nextInt();

        // Validar que el número del DNI está dentro del rango permitido
        if (dni < 0 || dni > 99999999) {
            System.out.println("Error: el número de DNI introducido está fuera del rango permitido.");
        } else {
            // Calcular el resto de dividir el DNI entre 23
            int resto = dni % 23;

            // Declarar variable para guardar la letra correspondiente
            char letra;

            // Seleccionar letra según el resto obtenido usando switch
            switch (resto) {
                case 0:  letra = 'T'; break;
                case 1:  letra = 'R'; break;
                case 2:  letra = 'W'; break;
                case 3:  letra = 'A'; break;
                case 4:  letra = 'G'; break;
                case 5:  letra = 'M'; break;
                case 6:  letra = 'Y'; break;
                case 7:  letra = 'F'; break;
                case 8:  letra = 'P'; break;
                case 9:  letra = 'D'; break;
                case 10: letra = 'X'; break;
                case 11: letra = 'B'; break;
                case 12: letra = 'N'; break;
                case 13: letra = 'J'; break;
                case 14: letra = 'Z'; break;
                case 15: letra = 'S'; break;
                case 16: letra = 'Q'; break;
                case 17: letra = 'V'; break;
                case 18: letra = 'H'; break;
                case 19: letra = 'L'; break;
                case 20: letra = 'C'; break;
                case 21: letra = 'K'; break;
                case 22: letra = 'E'; break;
                default: letra = ' '; // No debería darse nunca
            }

            // Mostrar la letra correspondiente del DNI
            System.out.println("La letra correspondiente a ese DNI es: " + letra);
        }

        // Cerrar el Scanner
        reader.close();
    }
}
