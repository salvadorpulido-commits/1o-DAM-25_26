package poo_Ejercicios02;

// Creamos la clase Main para probar ejercicio01CuentaCorriente
public class ejercicio01BaseMainCuentaCorriente {

    public static void main(String[] args) {

        // Creamos varias cuentas corrientes
        ejercicio01CuentaCorriente c1 =
                new ejercicio01CuentaCorriente("12345678A", 1000);

        ejercicio01CuentaCorriente c2 =
                new ejercicio01CuentaCorriente("87654321B", "Ana", 500);

        ejercicio01CuentaCorriente c3 =
                new ejercicio01CuentaCorriente("87654321B", "Ana", 500, "Extranjera");

        // Mostramos las cuentas
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Ingresamos dinero en la cuenta 1
        c1.ingresarDinero(200);

        // Sacamos dinero de la cuenta 2
        c2.sacarDinero(100);

        // Mostramos saldos actualizados
        System.out.println("Saldo cuenta 1: " + c1.getSaldo());
        System.out.println("Saldo cuenta 2: " + c2.getSaldo());

        // Comprobamos equals
        System.out.println("¿c2 y c3 son iguales? " + c2.equals(c3));
    }
}

