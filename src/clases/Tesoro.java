package clases;

import java.util.Random;

/**
 * La clase {@code Tesoro} representa un juego sencillo de búsqueda
 * de un tesoro dentro de un tablero cuadrado.
 * 
 * El jugador se mueve por el tablero mediante comandos de texto
 * hasta encontrar la posición del tesoro.
 */
public class Tesoro {

    /**
     * Tamaño del tablero (tablero cuadrado).
     */
    public static final int TAM_TABLERO = 5;

    /**
     * Posición X del tesoro.
     */
    static int xTesoro;

    /**
     * Posición Y del tesoro.
     */
    static int yTesoro;

    /**
     * Posición X del jugador.
     */
    int xJugador = 1;

    /**
     * Posición Y del jugador.
     */
    int yJugador = 1;

    /**
     * Genera una posición aleatoria para el tesoro
     * dentro de los límites del tablero.
     */
    static void generaPosicionTesoro() {
        Random rand = new Random();
        xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
        yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
    }

    /**
     * Muestra por pantalla el tablero del juego y
     * la posición actual del jugador.
     */
    void pintaTablero() {
        // Imprimimos la primera línea de números
        for (int i = 1; i <= TAM_TABLERO; i++) {
            System.out.print("\t" + i);
        }

        // Salto de línea para comenzar con los números de la izquierda
        System.out.println();

        // Bucle para imprimir las líneas
        for (int i = 1; i <= TAM_TABLERO; i++) {
            // Imprimimos el número de línea
            System.out.print(i);

            // Si la línea coincide con la posición X del jugador
            if (xJugador == i) {
                // Imprimimos tantos tabuladores como posición Y del jugador
                for (int j = 1; j <= yJugador; j++) {
                    System.out.print("\t");
                }
                // Imprimimos la ficha del jugador
                System.out.print("J");
            }

            // Salto de línea para pasar a la siguiente línea
            System.out.println();
        }
    }

    /**
     * Mueve al jugador por el tablero según el movimiento indicado.
     * 
     * Movimientos válidos:
     * - arriba
     * - abajo
     * - izquierda
     * - derecha
     * 
     * @param movimiento dirección del movimiento
     * @return 0 si el movimiento es correcto,
     *        -1 si se sale del tablero,
     *        -2 si el movimiento no es válido
     */
    int mueveJugador(String movimiento) {
        int res = 0;
        String movMinuscula = movimiento.toLowerCase();

        switch (movMinuscula) {
        case "arriba":
            if (xJugador - 1 < 1) {
                res = -1;
            } else {
                xJugador--;
            }
            break;

        case "abajo":
            if (xJugador + 1 > TAM_TABLERO) {
                res = -1;
            } else {
                xJugador++;
            }
            break;

        case "izquierda":
            if (yJugador - 1 < 1) {
                res = -1;
            } else {
                yJugador--;
            }
            break;

        case "derecha":
            if (yJugador + 1 > TAM_TABLERO) {
                res = -1;
            } else {
                yJugador++;
            }
            break;

        default:
            res = -2;
            break;
        }

        return res;
    }

    /**
     * Comprueba si el jugador ha encontrado el tesoro.
     * 
     * @return {@code true} si el jugador está en la posición del tesoro,
     *         {@code false} en caso contrario
     */
    boolean buscaTesoro() {
        boolean res = false;

        if (xTesoro == xJugador && yTesoro == yJugador) {
            res = true;
        }
        return res;
    }
}