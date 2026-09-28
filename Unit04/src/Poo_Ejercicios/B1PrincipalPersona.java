package Poo_Ejercicios;

public class B1PrincipalPersona {

	    public static void main(String[] args) {

	        // Creamos los objetos usando el constructor
	        B1Persona persona1 = new B1Persona("12345678A", "Azucena", "Luján García", 20);
	        B1Persona persona2 = new B1Persona("87654321B", "Juan", "Pérez López", 16);

	        // Mostrar mensajes por pantalla
	        System.out.println(persona1.nombre + " " + persona1.apellidos +
	                " con DNI " + persona1.dni +
	                (persona1.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));

	        System.out.println(persona2.nombre + " " + persona2.apellidos +
	                " con DNI " + persona2.dni +
	                (persona2.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));
	    }
	}
