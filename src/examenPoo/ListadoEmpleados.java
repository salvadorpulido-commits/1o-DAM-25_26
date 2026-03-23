package examenPoo;

import java.util.ArrayList;


public class ListadoEmpleados {

    private ArrayList<Empleado> lista;

    public ListadoEmpleados() {
        lista = new ArrayList<>();
    }

    // añadir empleado
    public boolean añadirEmpleado(Empleado e) {

        // comprobamos si existe
        for (Empleado emp : lista) {
            if (emp.getDni().equals(e.getDni())) {
                return false;
            }
        }
        
        lista.add(e);
        return true;
    }

    // listamos todos
    
    
    public void listarTodos() {
        for (Empleado e : lista) {
            System.out.println(e);
            System.out.println("------------");
        }
    }

    // buscar  por datros
    public Empleado buscarPorDni(String dni) {
        for (Empleado e : lista) {
            if (e.getDni().equals(dni)) {
                return e;
            }
        }
        return null;
    }

    // modificamos horas
    
    public boolean modificarHorasExtra(String dni, int horas) {
        Empleado e = buscarPorDni(dni);
        if (e != null) {
            e.setHorasExtra(horas);
            return true;
        }
        return false;
    }

    // modificamos bonificacion
    
    public boolean modificarBonificacion(String dni, double porcentaje) {
        Empleado e = buscarPorDni(dni);
        if (e != null) {
            e.setPorcentajeBonificacion(porcentaje);
            return true;
            
        }
        
        return false;
    }

    // eliminamos por dni
    
    public boolean eliminarPorDni(String dni) {
        Empleado e = buscarPorDni(dni);
        if (e != null) {
            lista.remove(e);
            return true;
        }
        
        return false;
    }

    // gasto total
    public double calcularGastoBonificaciones() {
        double total = 0;

        for (Empleado e : lista) {
            total += e.calcularBonificacion();
        }

        return total;
    }

    // listamos por alto desempeño
    public void listarEmpleadosAltoDesempeño() {
        for (Empleado e : lista) {
            if (e.esAltoDesempeño()) {
                System.out.println(e);
                System.out.println("-----------");
            }
        }
    }
}

