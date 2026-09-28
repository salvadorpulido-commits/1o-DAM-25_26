package clases;

/**
 * La clase {@code Esfera} representa una esfera matemática
 * definida por su radio.
 * 
 * Permite calcular la superficie y el volumen de la esfera
 * a partir del valor de su radio.
 */
public class Esfera {

    /**
     * Radio de la esfera.
     */
    double radio = 1.0;

    /**
     * Constructor por defecto.
     * Crea una esfera con radio 1.0.
     */
    public Esfera() {
        super();
    }

    /**
     * Constructor con parámetro.
     * Crea una esfera con el radio indicado.
     * 
     * @param radio valor del radio de la esfera
     */
    public Esfera(double radio) {
        super();
        this.radio = radio;
    }

    /**
     * Calcula la superficie de la esfera.
     * 
     * Fórmula: 4 · π · r²
     * 
     * @return superficie de la esfera
     */
    public double superficie() {
        double superficie = 4 * Math.PI * Math.pow(radio, 2);
        return superficie;
    }

    /**
     * Calcula el volumen de la esfera.
     * 
     * Fórmula: (4 · π · r³) / 3
     * 
     * @return volumen de la esfera
     */
    public double volumen() {
        double volumen = (4 * Math.PI / 3) * Math.pow(radio, 3);
        return volumen;
    }
}
