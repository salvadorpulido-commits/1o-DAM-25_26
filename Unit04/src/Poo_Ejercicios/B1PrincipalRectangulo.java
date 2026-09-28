package Poo_Ejercicios;

public class B1PrincipalRectangulo {

	    public static void main(String[] args) {

	        B1Rectangulo r1 = new B1Rectangulo(0, 0, 5, 5);
	        B1Rectangulo r2 = new B1Rectangulo(7, 9, 2, 3); // Coordenadas inválidas

	        System.out.println(r1);
	        System.out.println("Perímetro r1: " + r1.getPerimetro());
	        System.out.println("Área r1: " + r1.getArea());

	        System.out.println(r2);
	        System.out.println("Perímetro r2: " + r2.getPerimetro());
	        System.out.println("Área r2: " + r2.getArea());
	    }

	}


