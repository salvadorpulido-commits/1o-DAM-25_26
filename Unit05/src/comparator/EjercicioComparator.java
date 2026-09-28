package comparator;

import java.util.*;

// Clase comparadora para orden decreciente

class ComparadorDecreciente implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        // b - a invierte el orden natural (decreciente)
        return b - a;
    }
}

public class EjercicioComparator {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] tabla = new Integer[20];

        // Rellenar con números aleatorios entre 1 y 100
        
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = random.nextInt(100) + 1;
        }

        System.out.println("Original: " + Arrays.toString(tabla));

        // Ordenar con el comparador personalizado
        
        Arrays.sort(tabla, new ComparadorDecreciente());

        System.out.println("Ordenado: " + Arrays.toString(tabla));
    }
}
