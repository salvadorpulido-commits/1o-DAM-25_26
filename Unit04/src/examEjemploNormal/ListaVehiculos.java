package examEjemploNormal;

import java.util.ArrayList;

public class ListaVehiculos {

    // ─── ATRIBUTO ─────────────────────────────────────────────────────────────

    // ArrayList que almacena todos los objetos Vehiculo de la flota
    private ArrayList<Vehiculo> vehiculos;

    // ─── CONSTRUCTOR ──────────────────────────────────────────────────────────

    // Inicializamos la lista vacía al crear el objeto
    public ListaVehiculos() {
        vehiculos = new ArrayList<Vehiculo>();
    }

    // ─── MÉTODOS ──────────────────────────────────────────────────────────────

    // Añade un vehículo a la lista si no existe ya uno con la misma matrícula
    // Retorna true si se añadió correctamente, false si ya existía
    public boolean anadirVehiculo(Vehiculo v) {
        if (vehiculos.contains(v)) { // contains usa el equals que definimos (por matrícula)
            return false;            // Ya existe un vehículo con esa matrícula
        }
        vehiculos.add(v);
        return true;
    }

    // Muestra por consola todos los vehículos de la lista usando su toString()
    public void listarTodos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
            return;
        }
        for (Vehiculo v : vehiculos) {
            System.out.println(v);           // Llama automáticamente a toString()
            System.out.println("----------");
        }
    }

    // Busca un vehículo por matrícula
    // Retorna el objeto Vehiculo si lo encuentra, null si no existe
    public Vehiculo buscarPorMatricula(String matricula) {
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) { // Ignora mayúsculas/minúsculas
                return v;
            }
        }
        return null; // No encontrado
    }

    // Modifica los días alquilados de un vehículo identificado por matrícula
    // Retorna true si se modificó correctamente, false si no se encontró
    public boolean modificarDiasAlquilados(String matricula, int dias) {
        Vehiculo v = buscarPorMatricula(matricula); // Reutilizamos el método de búsqueda
        if (v != null) {
            v.setDiasAlquilados(dias);
            return true;
        }
        return false; // No existe el vehículo
    }

    // Modifica el porcentaje de recargo premium de un vehículo
    // Retorna true si se modificó, false si no se encontró o el porcentaje no es válido
    public boolean modificarRecargoPremium(String matricula, double porcentaje) {
        Vehiculo v = buscarPorMatricula(matricula);
        if (v != null && porcentaje >= 0 && porcentaje <= 25) { // Validamos rango 0-25%
            v.setPorcentajeRecargo(porcentaje);
            return true;
        }
        return false;
    }

    // Elimina el vehículo con la matrícula indicada de la lista
    // Retorna true si se eliminó, false si no existía
    public boolean eliminarPorMatricula(String matricula) {
        Vehiculo v = buscarPorMatricula(matricula);
        if (v != null) {
            vehiculos.remove(v); // remove usa equals, así que lo encontrará por matrícula
            return true;
        }
        return false;
    }

    // Suma el importe de recargo premium de todos los vehículos de la lista
    // Retorna el total acumulado
    public double calcularIngresoTotalRecargos() {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            total += v.getImporteRecargoPremium(); // Acumulamos el recargo de cada uno
        }
        return total;
    }

    // Muestra únicamente los vehículos cuyo recargo premium supera el 12%
    public void listarVehiculosPremium() {
        boolean hayPremium = false;
        for (Vehiculo v : vehiculos) {
            if (v.esPremium()) {       // Usamos el método esPremium() de la clase Vehiculo
                System.out.println(v);
                System.out.println("----------");
                hayPremium = true;
            }
        }
        if (!hayPremium) {
            System.out.println("No hay vehículos premium en la flota.");
        }
    }
}