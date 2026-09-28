package Poo_Ejercicios;

public class C3PrincipalRectangulo {

	public static void main(String[] args) {
		
		        // Crear rectángulo correcto
		        C3Rectangulo r1 = new C3Rectangulo(5, 3);

		        System.out.println("Base: " + r1.getBase());
		        System.out.println("Altura: " + r1.getAltura());
		        System.out.println("Área: " + r1.calcularArea());
		        System.out.println("Perímetro: " + r1.calcularPerimetro());

		        // Modificar valores correctos
		        r1.setBase(10);
		        r1.setAltura(4);

		        System.out.println("\nRectángulo modificado:");
		        System.out.println("Base: " + r1.getBase());
		        System.out.println("Altura: " + r1.getAltura());

		        // Probar valores incorrectos
		        r1.setBase(-2);
		        r1.setAltura(0);

		        System.out.println("\nTras intentar valores incorrectos:");
		        System.out.println("Base: " + r1.getBase());
		        System.out.println("Altura: " + r1.getAltura());
		    }
	

	}


