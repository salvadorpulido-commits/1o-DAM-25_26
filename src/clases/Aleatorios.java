package clases;

import java.util.Random;

/**
 * La clase {@code Aleatorios} contiene métodos estáticos
 * para generar y mostrar números aleatorios por pantalla.
 * 
 * Permite generar:
 * - Números decimales entre 0 y 1
 * - Números enteros hasta un valor máximo
 * - Números enteros dentro de un rango determinado
 * 
 * No es necesario crear objetos de esta clase para usar sus métodos.
 */
public class Aleatorios {

    /**
     * Genera y muestra por pantalla una cantidad determinada
     * de números aleatorios decimales entre 0.0 y 1.0.
     * 
     * @param cantidad número de valores aleatorios a generar
     */
    public static void numerosAletorios(int cantidad) {
        double aleatorio;

        for (int i = 1; i <= cantidad; i++) {
            aleatorio = Math.random();
            System.out.println(aleatorio);
        }
    }

    /**
     * Genera y muestra por pantalla una cantidad determinada
     * de números aleatorios enteros entre 0 y un valor máximo.
     * 
     * @param cantidad número de valores aleatorios a generar
     * @param max valor máximo posible (no incluido)
     */
    public static void numerosAleatorios(int cantidad, int max) {
        int aleatorio;

        for (int i = 1; i <= cantidad; i++) {
            aleatorio = (int) (Math.random() * max);
            System.out.println(aleatorio);
        }
    }

    /**
     * Genera y muestra por pantalla una cantidad determinada
     * de números aleatorios enteros dentro de un rango definido.
     * 
     * @param cantidad número de valores aleatorios a generar
     * @param minimo valor mínimo incluido
     * @param maximo valor máximo incluido
     */
    public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
        int aleatorio;
        Random rand = new Random();

        for (int i = 1; i <= cantidad; i++) {
            aleatorio = rand.nextInt(minimo, maximo + 1);
            System.out.println(aleatorio);
        }
    }
}
