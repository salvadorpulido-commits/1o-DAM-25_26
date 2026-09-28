package Poo_Ejercicios;

		import java.util.Scanner;

		public class PrincipalPersona {
		   
			public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        Persona p1 = new Persona();
		        Persona p2 = new Persona();

		        System.out.print("DNI persona 1: ");
		        p1.dni = sc.nextLine();
		        System.out.print("Nombre: ");
		        p1.nombre = sc.nextLine();
		        System.out.print("Apellidos: ");
		        p1.apellidos = sc.nextLine();
		        System.out.print("Edad: ");
		        p1.edad = sc.nextInt();
		        sc.nextLine();

		        System.out.print("DNI persona 2: ");
		        p2.dni = sc.nextLine();
		        System.out.print("Nombre: ");
		        p2.nombre = sc.nextLine();
		        System.out.print("Apellidos: ");
		        p2.apellidos = sc.nextLine();
		        System.out.print("Edad: ");
		        p2.edad = sc.nextInt();

		        System.out.println(p1.nombre + " " + p1.apellidos +
		                " con DNI " + p1.dni +
		                (p1.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));

		        System.out.println(p2.nombre + " " + p2.apellidos +
		                " con DNI " + p2.dni +
		                (p2.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));
		        
		        sc.close();
		        
		    }
		}

