package Crud_Ejercicios;

import java.util.Scanner;

// Creamos la clase principal
public class ejercicio05MainCuentaCorriente {

    public static void main(String[] args) {

        // Declaramos el Scanner
        Scanner sc = new Scanner(System.in);

        // Creamos el gestor de cuentas
        ejercicio05GestionCuentaCorriente gestion = new ejercicio05GestionCuentaCorriente();

        int opcion;

        // Bucle del menú
        do {
            System.out.println("\nCUENTAS CORRIENTES");
            System.out.println("====================");
            System.out.println("1. Listado");
            System.out.println("2. Nueva cuenta");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Sacar dinero");
            System.out.println("5. Borrar cuenta");
            System.out.println("6. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    gestion.listarCuentas();
                    break;

                case 2:
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Saldo inicial: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine();

                    ejercicio05CuentaCorriente nueva =
                            new ejercicio05CuentaCorriente(dni, nombre, saldo);

                    if (gestion.altaCuenta(nueva)) {
                        System.out.println("Cuenta creada correctamente.");
                    } else {
                        System.out.println("Ya existe una cuenta con ese DNI.");
                    }
                    break;

                case 3:
                    System.out.print("DNI: ");
                    dni = sc.nextLine();

                    ejercicio05CuentaCorriente cIngreso = gestion.buscarPorDni(dni);

                    if (cIngreso != null) {
                        System.out.print("Cantidad a ingresar: ");
                        double cantidad = sc.nextDouble();
                        sc.nextLine();

                        cIngreso.ingresarDinero(cantidad);
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("DNI: ");
                    dni = sc.nextLine();

                    ejercicio05CuentaCorriente cSacar = gestion.buscarPorDni(dni);

                    if (cSacar != null) {
                        System.out.print("Cantidad a sacar: ");
                        double cantidad = sc.nextDouble();
                        sc.nextLine();

                        if (!cSacar.sacarDinero(cantidad)) {
                            System.out.println("Saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("DNI: ");
                    dni = sc.nextLine();

                    if (gestion.borrarCuenta(dni)) {
                        System.out.println("Cuenta borrada.");
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 6);

        sc.close();
    }
}

