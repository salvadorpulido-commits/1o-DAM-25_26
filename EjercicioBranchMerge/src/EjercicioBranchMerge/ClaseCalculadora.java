package EjercicioBranchMerge;
public class ClaseCalculadora {

    // Método para sumar dos números
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar dos números
    public int restar(int a, int b) {
        return a - b;
    }

    // Método main para probar
    public static void main(String[] args) {
        ClaseCalculadora calc = new ClaseCalculadora();
        System.out.println("Suma 5 + 3 = " + calc.sumar(5, 3));
        System.out.println("Resta 5 - 3 = " + calc.restar(5, 3));
    }
}
