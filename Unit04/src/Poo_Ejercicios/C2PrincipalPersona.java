package Poo_Ejercicios;

public class C2PrincipalPersona {
    public static void main(String[] args) {

        // Crear dos objetos Persona usando constructor
        C2Persona persona1 = new C2Persona("12345678A", "Azucena", "Luján García", 20);
        C2Persona persona2 = new C2Persona("87654321B", "Juan", "Pérez López", 16);

        // Mostrar si son mayores de edad
        System.out.println(persona1.getNombre() + " " + persona1.getApellidos() +
                " con DNI " + persona1.getDni() +
                (persona1.getEdad() >= 18 ? " es mayor de edad" : " no es mayor de edad"));

        System.out.println(persona2.getNombre() + " " + persona2.getApellidos() +
                " con DNI " + persona2.getDni() +
                (persona2.getEdad() >= 18 ? " es mayor de edad" : " no es mayor de edad"));

        // Modificar edad usando setter
        persona2.setEdad(18);
        System.out.println(persona2.getNombre() + " ahora tiene " + persona2.getEdad() + " años");
    }
}
