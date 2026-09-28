package ejercicioAnalisis02Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //  Crearmos la lista de fichas
        List<Ficha> biblioteca = new ArrayList<>();

        biblioteca.add(new Libro(1, "El Quijote",
                "Miguel de Cervantes", "Planeta"));
        biblioteca.add(new Libro(2, "Cien años de soledad",
                "Gabriel García Márquez", "Sudamericana"));

        biblioteca.add(new Revista(3, "National Geographic",
                352, 2024));
        biblioteca.add(new Revista(4, "Muy Interesante",
                489, 2023));

        biblioteca.add(new DVD(5, "Interstellar",
                "Christopher Nolan", 2014, "película"));
        biblioteca.add(new DVD(6, "Planet Earth",
                "David Attenborough", 2006, "documental"));
        biblioteca.add(new DVD(7, "Breaking Bad",
                "Vince Gilligan", 2008, "serie"));
        biblioteca.add(new DVD(8, "Tipo Inválido",
                "Director Desconocido", 2020, "cortometraje")); // tipo inválido → "película"

        //  Recorrer la lista
        System.out.println("======= FICHAS DE LA BIBLIOTECA =======\n");

        for (Ficha f : biblioteca) {
            System.out.println(f);
            System.out.println("  Días de préstamo: " + f.diasPrestamo() + " días");
            System.out.println();
        }
    }
}

