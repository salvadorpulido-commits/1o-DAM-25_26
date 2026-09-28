package Poo_Ejercicios;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		
		        Rectangulo r1 = new Rectangulo();
		        r1.x1 = 0; r1.y1 = 0;
		        r1.x2 = 5; r1.y2 = 5;

		        Rectangulo r2 = new Rectangulo();
		        r2.x1 = 7; r2.y1 = 9;
		        r2.x2 = 2; r2.y2 = 3;

		        int ancho = Math.abs(r1.x2 - r1.x1);
		        int alto = Math.abs(r1.y2 - r1.y1);

		        System.out.println("Área r1: " + (ancho * alto));
		        System.out.println("Perímetro r1: " + (2 * (ancho + alto)));

		        r1.x2 += 2;
		        r1.y2 += 3;

		        ancho = Math.abs(r1.x2 - r1.x1);
		        alto = Math.abs(r1.y2 - r1.y1);

		        System.out.println("Nueva área r1: " + (ancho * alto));
		    }
		}
