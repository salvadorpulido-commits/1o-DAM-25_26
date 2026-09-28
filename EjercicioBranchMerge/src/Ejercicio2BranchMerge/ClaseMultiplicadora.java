package Ejercicio2BranchMerge;
public class ClaseMultiplicadora {

    // Método para multiplicar dos números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dos números
    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: división por cero");
            return 0;
        }
        return (double) a / b;
    }

    // Método main para probar
    public static void main(String[] args) {
        ClaseMultiplicadora calc = new ClaseMultiplicadora();
        System.out.println("Multiplica 4 * 2 = " + calc.multiplicar(4, 2));
        System.out.println("Divide 4 / 2 = " + calc.dividir(4, 2));
    }
}

