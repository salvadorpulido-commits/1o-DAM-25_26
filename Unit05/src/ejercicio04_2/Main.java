package ejercicio04_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EquipoHosteleria> catalogo = new ArrayList<>();
        
        catalogo.add(new LavadoraIndustrial("L1", "Fagor", "MaxWash 3000", 1200, 2.5, 3, 3.5, true));
        catalogo.add(new ArconCongelador("A1", "Bosch", "FreezePro", 800, 1.2, 5, 1.5, false));
        catalogo.add(new HornoIndustrial("H1", "Rational", "iCombi Pro", 4500, 5.0, 2, 10.0, true));

        double sumaTotalInstalacion = 0;

        System.out.println("=== RESUMEN DE EQUIPOS ===");

        for (EquipoHosteleria equipo : catalogo) {
            System.out.println("\nEquipo: " + equipo.getClass().getSimpleName() + " (" + equipo.getMarca() + " " + equipo.getModelo() + ")");
            System.out.printf("Precio Final: %.2f €\n", equipo.calcularPrecioFinal());
            System.out.printf("Coste Mantenimiento Anual: %.2f €\n", equipo.calcularCosteMantenimientoAnual());

            if (equipo instanceof Instalable) {
                Instalable instalable = (Instalable) equipo;
                sumaTotalInstalacion += instalable.calcularCosteInstalacion();
                
                if (instalable.requiereTecnicoEspecializado()) {
                    System.out.println("ATENCIÓN: Este equipo requiere instalación por un TÉCNICO ESPECIALIZADO.");
                } else {
                    System.out.println("Instalación estándar permitida.");
                }
            } else {
                System.out.println("Equipo Plug & Play (No requiere instalación especial).");
            }
        }

        System.out.println("\n==================================");
        System.out.printf("COSTE TOTAL DE INSTALACIONES: %.2f €\n", sumaTotalInstalacion);
        System.out.println("==================================");
    }
}