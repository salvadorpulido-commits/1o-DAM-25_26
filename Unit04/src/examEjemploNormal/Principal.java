package examEjemploNormal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // Scanner para leer la entrada del usuario por consola
        Scanner sc = new Scanner(System.in);

        // Creamos la lista que gestionará todos los vehículos
        ListaVehiculos lista = new ListaVehiculos();

        int opcion; // Variable para guardar la opción elegida por el usuario

        // ─── BUCLE PRINCIPAL DEL MENÚ ─────────────────────────────────────────
        // Se repite hasta que el usuario elija la opción 9 (Salir)
        do {
            // Mostramos las opciones disponibles
            System.out.println("\n====== GESTIÓN DE ALQUILER DE VEHÍCULOS ======");
            System.out.println("1. Añadir vehículo");
            System.out.println("2. Listar vehículos");
            System.out.println("3. Buscar vehículo por matrícula");
            System.out.println("4. Modificar días alquilados");
            System.out.println("5. Modificar recargo premium");
            System.out.println("6. Modificar precio seguro diario");
            System.out.println("7. Eliminar vehículo");
            System.out.println("8. Ver estadísticas");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiamos el salto de línea que deja nextInt()

            // ─── GESTIÓN DE CADA OPCIÓN ───────────────────────────────────────
            switch (opcion) {

                case 1: // ── AÑADIR VEHÍCULO ──────────────────────────────────
                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine().toUpperCase(); // Guardamos en mayúsculas

                    // Comprobamos si ya existe un vehículo con esa matrícula antes de continuar
                    if (lista.buscarPorMatricula(matricula) != null) {
                        System.out.println("❌ Ya existe un vehículo con esa matrícula.");
                        break;
                    }

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Precio base por día: ");
                    double precio = sc.nextDouble();

                    System.out.print("Porcentaje de recargo premium (0-25): ");
                    double recargo = sc.nextDouble();
                    sc.nextLine(); // Limpiamos buffer

                    // Validamos que el porcentaje esté en el rango correcto
                    if (recargo < 0 || recargo > 25) {
                        System.out.println("❌ El porcentaje debe estar entre 0 y 25.");
                        break;
                    }

                    // Creamos el vehículo y lo añadimos a la lista
                    Vehiculo nuevo = new Vehiculo(matricula, modelo, precio, recargo);
                    if (lista.anadirVehiculo(nuevo)) {
                        System.out.println("✅ Vehículo añadido correctamente.");
                    } else {
                        System.out.println("❌ No se pudo añadir el vehículo.");
                    }
                    break;

                case 2: // ── LISTAR TODOS LOS VEHÍCULOS ───────────────────────
                    System.out.println("\n─── LISTA DE VEHÍCULOS ───");
                    lista.listarTodos(); // Muestra todos usando su toString()
                    break;

                case 3: // ── BUSCAR POR MATRÍCULA ─────────────────────────────
                    System.out.print("Introduce la matrícula: ");
                    String matBuscar = sc.nextLine().toUpperCase();
                    Vehiculo encontrado = lista.buscarPorMatricula(matBuscar);

                    if (encontrado != null) {
                        System.out.println("\n─── VEHÍCULO ENCONTRADO ───");
                        System.out.println(encontrado); // Usa el toString()
                    } else {
                        System.out.println("❌ No se encontró ningún vehículo con esa matrícula.");
                    }
                    break;

                case 4: // ── MODIFICAR DÍAS ALQUILADOS ────────────────────────
                    System.out.print("Matrícula del vehículo: ");
                    String matDias = sc.nextLine().toUpperCase();
                    System.out.print("Nuevos días alquilados: ");
                    int dias = sc.nextInt();
                    sc.nextLine();

                    if (lista.modificarDiasAlquilados(matDias, dias)) {
                        System.out.println("✅ Días alquilados actualizados correctamente.");
                    } else {
                        System.out.println("❌ No se encontró el vehículo con esa matrícula.");
                    }
                    break;

                case 5: // ── MODIFICAR RECARGO PREMIUM ────────────────────────
                    System.out.print("Matrícula del vehículo: ");
                    String matRecargo = sc.nextLine().toUpperCase();
                    System.out.print("Nuevo porcentaje de recargo (0-25): ");
                    double nuevoRecargo = sc.nextDouble();
                    sc.nextLine();

                    // La validación del rango 0-25 también está dentro de modificarRecargoPremium
                    if (lista.modificarRecargoPremium(matRecargo, nuevoRecargo)) {
                        System.out.println("✅ Recargo premium actualizado correctamente.");
                    } else {
                        System.out.println("❌ Vehículo no encontrado o porcentaje fuera de rango (0-25).");
                    }
                    break;

                case 6: // ── MODIFICAR PRECIO SEGURO DIARIO ───────────────────
                    // Este valor es estático: afecta a TODOS los vehículos a la vez
                    System.out.print("Nuevo precio del seguro diario: ");
                    double nuevoSeguro = sc.nextDouble();
                    sc.nextLine();
                    Vehiculo.setPrecioSeguroDiario(nuevoSeguro); // Llamada al setter estático
                    System.out.println("✅ Precio del seguro diario actualizado a " + nuevoSeguro + "€ para todos los vehículos.");
                    break;

                case 7: // ── ELIMINAR VEHÍCULO ────────────────────────────────
                    System.out.print("Matrícula del vehículo a eliminar: ");
                    String matEliminar = sc.nextLine().toUpperCase();

                    // Pedimos confirmación antes de eliminar
                    System.out.print("¿Estás seguro de que quieres eliminarlo? (s/n): ");
                    String confirmacion = sc.nextLine();

                    if (confirmacion.equalsIgnoreCase("s")) {
                        if (lista.eliminarPorMatricula(matEliminar)) {
                            System.out.println("✅ Vehículo eliminado correctamente.");
                        } else {
                            System.out.println("❌ No se encontró el vehículo con esa matrícula.");
                        }
                    } else {
                        System.out.println("Operación cancelada.");
                    }
                    break;

                case 8: // ── VER ESTADÍSTICAS ─────────────────────────────────
                    System.out.println("\n─── ESTADÍSTICAS ───");
                    // Mostramos el ingreso total acumulado por recargos premium
                    System.out.println("Ingreso total por recargos premium: "
                            + lista.calcularIngresoTotalRecargos() + "€");
                    System.out.println("\n─── VEHÍCULOS PREMIUM (recargo > 12%) ───");
                    lista.listarVehiculosPremium();
                    break;

                case 9: // ── SALIR ─────────────────────────────────────────────
                    // Mensaje de despedida indicado en el enunciado
                    System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                    break;

                default: // Cualquier número que no sea del 1 al 9
                    System.out.println("❌ Opción no válida. Introduce un número del 1 al 9.");
            }

        } while (opcion != 9); // El bucle termina cuando el usuario elige salir

        sc.close(); // Cerramos el Scanner al terminar el programa
    }
}