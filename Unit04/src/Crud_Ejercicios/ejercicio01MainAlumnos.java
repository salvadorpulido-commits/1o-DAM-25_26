package Crud_Ejercicios;

// Importamos la clase Scanner
import java.util.Scanner;

// Creamos la clase principal
public class ejercicio01MainAlumnos {

    // Creamos el método main
    public static void main(String[] args) {

        // Creamos el Scanner para leer datos por teclado
        Scanner sc = new Scanner(System.in);

        // Creamos el gestor de alumnos
        ejercicio01GestionAlumno gestion = new ejercicio01GestionAlumno();

        // Declaramos la variable opción
        int opcion;

        // Declaramos la variable nombre
        String nombre;

        // Declaramos la variable nota
        double nota;

        // Creamos el menú con un do-while
        do {
            // Mostramos el menú
            System.out.println("\nALUMNOS/AS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo Alumno");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            // Leemos la opción
            opcion = sc.nextInt();
            // Limpiamos el buffer
            sc.nextLine();

            // Evaluamos la opción elegida
            switch (opcion) {

                case 1:
                    // Mostramos el listado de alumnos
                    gestion.listarAlumnos();
                    break;

                case 2:
                    // Pedimos el nombre del alumno
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    // Pedimos la nota del alumno
                    System.out.print("Nota: ");
                    nota = sc.nextDouble();
                    // Añadimos el alumno a la lista
                    gestion.añadirAlumno(new ejercicio01Alumnos(nombre, nota));
                    break;

                case 3:
                    // Pedimos el nombre del alumno a modificar
                    System.out.print("Nombre del alumno: ");
                    nombre = sc.nextLine();
                    // Pedimos la nueva nota
                    System.out.print("Nueva nota: ");
                    nota = sc.nextDouble();

                    // Comprobamos si se ha modificado
                    if (gestion.modificarNota(nombre, nota)) {
                        System.out.println("Nota modificada correctamente.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case 4:
                    // Pedimos el nombre del alumno a borrar
                    System.out.print("Nombre del alumno a borrar: ");
                    nombre = sc.nextLine();

                    // Comprobamos si se ha borrado
                    if (gestion.borrarAlumno(nombre)) {
                        System.out.println("Alumno eliminado.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case 5:
                    // Mensaje de salida
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    // Mensaje si la opción no es válida
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 5);

        // Cerramos el Scanner
        sc.close();
    }
}
