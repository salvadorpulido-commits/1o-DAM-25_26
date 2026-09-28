package clases;

/**
 * La clase {@code Operaciones} permite realizar operaciones
 * matemáticas básicas entre dos números reales.
 * 
 * Incluye operaciones de suma, resta, multiplicación,
 * división y comparación de valores.
 */
public class Operaciones {

    /**
     * Primer número de la operación.
     */
    double num1;

    /**
     * Segundo número de la operación.
     */
    double num2;

    /**
     * Constructor por defecto.
     * Crea un objeto {@code Operaciones} con valores iniciales 0.
     */
    public Operaciones() {
    }

    /**
     * Constructor con parámetros.
     * 
     * @param num1 primer número
     * @param num2 segundo número
     */
    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Calcula la suma de los dos números.
     * 
     * @return resultado de la suma
     */
    public double suma() {
        return num1 + num2;
    }

    /**
     * Calcula la resta del primer número menos el segundo.
     * 
     * @return resultado de la resta
     */
    public double resta() {
        return num1 - num2;
    }

    /**
     * Calcula la multiplicación de los dos números.
     * 
     * @return resultado de la multiplicación
     */
    public double multiplicacion() {
        return num1 * num2;
    }

    /**
     * Calcula la división del primer número entre el segundo.
     * 
     * Si el segundo número es 0, el resultado será 0.
     * 
     * @return resultado de la división
     */
    public double division() {
        double res = 0;

        if (num2 != 0) {
            res = num1 / num2;
        }
        return res;
    }

    /**
     * Devuelve el mayor de los dos números.
     * 
     * @return el valor máximo
     */
    public double max() {
        return num1 > num2 ? num1 : num2;
    }

    /**
     * Devuelve el menor de los dos números.
     * 
     * @return el valor mínimo
     */
    public double min() {
        return num1 < num2 ? num1 : num2;
    }
}
