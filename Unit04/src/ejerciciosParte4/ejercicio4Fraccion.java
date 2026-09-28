package ejerciciosParte4;

public class ejercicio4Fraccion {
	
	/**
	 * Clase que representa una fracción con numerador y denominador
	 * y permite realizar operaciones entre fracciones.
	 */
	public class Fraccion {

	    /** Numerador de la fracción */
	    private int numerador;

	    /** Denominador de la fracción */
	    private int denominador;

	    /**
	     * Constructor por defecto. Inicializa la fracción 0/1.
	     */
	    public Fraccion() {
	        numerador = 0;
	        denominador = 1;
	    }

	    /**
	     * Constructor con parámetros.
	     * 
	     * @param numerador numerador de la fracción
	     * @param denominador denominador de la fracción
	     */
	    public Fraccion(int numerador, int denominador) {
	        this.numerador = numerador;
	        if (denominador == 0) {
	            this.denominador = 1;
	        } else {
	            this.denominador = denominador;
	        }
	    }

	    /**
	     * Devuelve el numerador.
	     * 
	     * @return numerador
	     */
	    public int getNumerador() {
	        return numerador;
	    }

	    /**
	     * Modifica el numerador.
	     * 
	     * @param numerador nuevo numerador
	     */
	    public void setNumerador(int numerador) {
	        this.numerador = numerador;
	    }

	    /**
	     * Devuelve el denominador.
	     * 
	     * @return denominador
	     */
	    public int getDenominador() {
	        return denominador;
	    }

	    /**
	     * Modifica el denominador.
	     * Si es 0 se mantiene el valor anterior.
	     * 
	     * @param denominador nuevo denominador
	     */
	    public void setDenominador(int denominador) {
	        if (denominador != 0) {
	            this.denominador = denominador;
	        }
	    }

	    /**
	     * Suma la fracción actual con otra fracción.
	     * No modifica la fracción actual.
	     * 
	     * @param f fracción a sumar
	     * @return nueva fracción con el resultado simplificado
	     */
	    public Fraccion suma(Fraccion f) {

	        int num = numerador * f.denominador + f.numerador * denominador;
	        int den = denominador * f.denominador;

	        Fraccion resultado = new Fraccion(num, den);
	        resultado.simplifica();
	        return resultado;
	    }

	    /**
	     * Resta una fracción a la fracción actual.
	     * No modifica la fracción actual.
	     * 
	     * @param f fracción a restar
	     * @return nueva fracción con el resultado simplificado
	     */
	    public Fraccion resta(Fraccion f) {

	        int num = numerador * f.denominador - f.numerador * denominador;
	        int den = denominador * f.denominador;

	        Fraccion resultado = new Fraccion(num, den);
	        resultado.simplifica();
	        return resultado;
	    }

	    /**
	     * Multiplica la fracción actual por otra fracción.
	     * No modifica la fracción actual.
	     * 
	     * @param f fracción a multiplicar
	     * @return nueva fracción con el resultado simplificado
	     */
	    public Fraccion multiplica(Fraccion f) {

	        int num = numerador * f.numerador;
	        int den = denominador * f.denominador;

	        Fraccion resultado = new Fraccion(num, den);
	        resultado.simplifica();
	        return resultado;
	    }

	    /**
	     * Divide la fracción actual entre otra fracción.
	     * No modifica la fracción actual.
	     * 
	     * @param f fracción por la que se divide
	     * @return nueva fracción con el resultado simplificado
	     */
	    public Fraccion divide(Fraccion f) {

	        int num = numerador * f.denominador;
	        int den = denominador * f.numerador;

	        Fraccion resultado = new Fraccion(num, den);
	        resultado.simplifica();
	        return resultado;
	    }

	    /**
	     * Simplifica la fracción actual usando el máximo común divisor.
	     */
	    public void simplifica() {

	        int mcd = mcd(numerador, denominador);

	        numerador = numerador / mcd;
	        denominador = denominador / mcd;
	    }

	    /**
	     * Calcula el máximo común divisor de dos números.
	     * 
	     * @param a primer número
	     * @param b segundo número
	     * @return máximo común divisor
	     */
	    private int mcd(int a, int b) {

	        a = Math.abs(a);
	        b = Math.abs(b);

	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }

	        return a;
	    }
	}

}
