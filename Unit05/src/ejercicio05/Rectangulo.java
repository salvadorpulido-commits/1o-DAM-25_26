package ejercicio05;

// Clase hija de Poligono

public class Rectangulo extends Poligono {

    private double lado1;
    private double lado2;

    // Constructor por defecto (valores 1)
    
    public Rectangulo() {
        super(2);
        lado1 = 1;
        lado2 = 1;
    }

    // Constructor con valores
    
    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Getters y Setters
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    // Calcula el área
    
    public double area() {
        return lado1 * lado2;
    }

    // Muestra los datos del rectángulo
    
    public String toString() {
        return "Rectangulo - Lado1: " + lado1 + " Lado2: " + lado2;
    }
}
