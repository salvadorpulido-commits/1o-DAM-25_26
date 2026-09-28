package Poo_Ejercicios;

public class C3Rectangulo {

	    private double base;
	    private double altura;

	    // Constructor
	    public C3Rectangulo(double base, double altura) {
	        setBase(base);
	        setAltura(altura);
	    }

	    // Getters
	    public double getBase() {
	        return base;
	    }

	    public double getAltura() {
	        return altura;
	    }

	    // Setters con validación
	    public void setBase(double base) {
	        if (base > 0) {
	            this.base = base;
	        }
	    }

	    public void setAltura(double altura) {
	        if (altura > 0) {
	            this.altura = altura;
	        }
	    }

	    // Métodos útiles
	    public double calcularArea() {
	        return base * altura;
	    }

	    public double calcularPerimetro() {
	        return 2 * (base + altura);
	    }
	}

