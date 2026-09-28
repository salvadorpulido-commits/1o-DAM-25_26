package ejerciciosParte4;

/*Crea una clase llamada Contador que contenga un único atributo entero llamado cont.
Esta clase va a consistir en tener un contador al que se le incrementará o decrementará el valor de cont. 
El contador nunca podrá tener valores negativos. Decide qué constructores y get/set son necesarios.
La clase debe implementar los siguientes métodos:
incrementar: incrementa el contador en una unidad.
decrementar: decrementa el contador en una unidad. 
El contador nunca podrá tener un valor negativo. 
Si al decrementar se alcanza un valor negativo el contador toma el valor cero.
*/

public class ejercicio02Contador {
	
	/**
	 * Representa un contador entero no negativo.
	 * <p>
	 * El contador puede incrementarse o decrementarse en una unidad,
	 * pero nunca tomará un valor negativo: si al decrementar se
	 * alcanzara un valor negativo, el contador se fija automáticamente a cero.
	 * </p>
	 */
	public class Contador {

	    /**
	     * Valor actual del contador. Siempre es mayor o igual a cero.
	     */
	    private int cont;

	    /**
	     * Constructor por defecto.
	     * Inicializa el contador a {@code 0}.
	     */
	    public Contador() {
	        this.cont = 0;
	    }

	    /**
	     * Constructor con valor inicial.
	     * <p>
	     * Si el valor proporcionado es negativo, el contador se inicializa a {@code 0}.
	     * </p>
	     *
	     * @param cont valor inicial del contador; si es negativo se usa {@code 0}
	     */
	    public Contador(int cont) {
	        this.cont = (cont < 0) ? 0 : cont;
	    }

	    /**
	     * Devuelve el valor actual del contador.
	     *
	     * @return valor actual de {@code cont}, siempre mayor o igual a cero
	     */
	    public int getCont() {
	        return cont;
	    }

	    /**
	     * Establece un nuevo valor para el contador.
	     * <p>
	     * Si el valor proporcionado es negativo, el contador se fija a {@code 0}.
	     * </p>
	     *
	     * @param cont nuevo valor del contador; si es negativo se usa {@code 0}
	     */
	    public void setCont(int cont) {
	        this.cont = (cont < 0) ? 0 : cont;
	    }

	    /**
	     * Incrementa el contador en una unidad.
	     */
	    public void incrementar() {
	        cont++;
	    }

	    /**
	     * Decrementa el contador en una unidad.
	     * <p>
	     * Si el contador ya es {@code 0}, no realiza ninguna operación,
	     * garantizando que el valor nunca sea negativo.
	     * </p>
	     */
	    public void decrementar() {
	        if (cont > 0) {
	            cont--;
	        }
	    }

	    /**
	     * Devuelve una representación en cadena del contador.
	     *
	     * @return cadena con el formato {@code Contador{cont=X}}
	     */
	    @Override
	    public String toString() {
	        return "Contador{cont=" + cont + "}";
	    }
	}
	
	}
