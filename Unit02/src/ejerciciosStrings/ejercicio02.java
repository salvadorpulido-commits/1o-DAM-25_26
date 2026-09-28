package ejerciciosStrings;

import java.util.Scanner; 

public class ejercicio02 {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Pedir la contraseña al primer jugador
	        System.out.print("Jugador 1, introduce la contraseña: ");
	        String contrasena = sc.nextLine();
	        System.out.println("\n\n\n\n\n"); // Ocultar la contraseña en pantalla

	        boolean acertado = false;

	        // Bucle de intentos del segundo jugador
	        while (!acertado) {
	            System.out.print("Jugador 2, introduce tu intento: ");
	            String intento = sc.nextLine();

	            // Construir la cadena de aciertos y asteriscos
	            String resultado = "";
	            for (int i = 0; i < contrasena.length(); i++) {
	                if (i < intento.length() && intento.charAt(i) == contrasena.charAt(i)) {
	                    resultado += contrasena.charAt(i);
	                } else {
	                    resultado += "*";
	                }
	            }

	            System.out.println("Intento: " + resultado);

	            // Comprobar si ha acertado
	            if (intento.equals(contrasena)) {
	                System.out.println("¡Has acertado la contraseña!");
	                acertado = true;
	            } else {
	                // Dar pista alfabética
	                if (intento.compareTo(contrasena) < 0) {
	                    System.out.println("Pista: la contraseña es alfabéticamente mayor que tu intento.\n");
	                } else {
	                    System.out.println("Pista: la contraseña es alfabéticamente menor que tu intento.\n");
	                }
	            }
	        }

	        sc.close();
	        
	    }
	}

