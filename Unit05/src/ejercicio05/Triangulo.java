package ejercicio05;

// Clase hija de Poligono

public class Triangulo extends Poligono {

    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor por defecto
    
    public Triangulo() {
        super(3);
        lado1 = 1;
        lado2 = 1;
        lado3 = 1;
    }

    // Constructor con valores
    
    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    // Calcula el área con la fórmula de Herón
    
    public double area() {
        double s;     // semiperímetro
        double area;  // resultado

        s = (lado1 + lado2 + lado3) / 2;
        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

        return area;
    }

    // Muestra los datos del triángulo
    
    public String toString() {
        return "Triangulo - Lado1: " + lado1 + " Lado2: " + lado2 + " Lado3: " + lado3;
    }
}