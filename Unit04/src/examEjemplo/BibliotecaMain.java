package examEjemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Socio> socios = new ArrayList<>();
        ArrayList<Prestamo> prestamos = new ArrayList<>();

        int opcion;
        
    
        do {
            System.out.println("\n--- BIBLIOTECA ---");
            System.out.println("1. Alta libro");
            System.out.println("2. Alta socio");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Mostrar libros");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("ID: ");
                    String idL = sc.nextLine();

                    if (buscarLibro(libros, idL) != null) {
                        System.out.println("Libro ya existe");
                        break;
                    }

                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    System.out.print("Ejemplares: ");
                    int ej = sc.nextInt();

                    libros.add(new Libro(idL, titulo, autor, ej));
                    break;

                case 2:
                    System.out.print("ID: ");
                    String idS = sc.nextLine();

                    if (buscarSocio(socios, idS) != null) {
                        System.out.println("Socio ya existe");
                        break;
                    }

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    socios.add(new Socio(idS, nombre, 0, 3));
                    break;

                case 3:
                    System.out.print("ID libro: ");
                    String idLibro = sc.nextLine();

                    System.out.print("ID socio: ");
                    String idSocio = sc.nextLine();

                    Libro l = buscarLibro(libros, idLibro);
                    Socio s = buscarSocio(socios, idSocio);

                    if (l == null || s == null) {
                        System.out.println("No existen");
                    } else if (!l.disponible()) {
                        System.out.println("Sin stock");
                    } else if (!s.puedePrestar()) {
                        System.out.println("Limite alcanzado");
                    } else {
                        l.prestar();
                        s.sumarPrestamo();
                        prestamos.add(new Prestamo(idLibro, idSocio));
                        System.out.println("Prestamo realizado");
                    }
                    break;

                case 4:
                    System.out.print("ID libro: ");
                    String idDev = sc.nextLine();

                    for (Prestamo p : prestamos) {
                        if (p.idLibro.equals(idDev) && !p.devuelto) {

                            Libro lib = buscarLibro(libros, p.idLibro);
                            Socio soc = buscarSocio(socios, p.idSocio);

                            lib.devolver();
                            soc.restarPrestamo();
                            p.devolver();

                            System.out.println("Devuelto");
                            break;
                        }
                    }
                    break;

                case 5:
                    for (Libro lib : libros) {
                        System.out.println(lib.id + " - " + lib.titulo +
                                " (" + lib.ejemplaresDisponibles + ")");
                    }
                    break;
            }

        } while (opcion != 6);
        
        sc.close();
    }

    public static Libro buscarLibro(ArrayList<Libro> libros, String id) {
        for (Libro l : libros) {
            if (l.id.equals(id)) return l;
        }
        return null;
    }

    public static Socio buscarSocio(ArrayList<Socio> socios, String id) {
        for (Socio s : socios) {
            if (s.id.equals(id)) return s;
        }
        return null;
    }
}