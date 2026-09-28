package ejercicio04;

public class Main {

    public static void main(String[] args) {

        // Crear array de electrodomésticos
    	
        Electrodomestico[] lista = new Electrodomestico[6];

        // Electrodomésticos genéricos
        lista[0] = new Electrodomestico(100, "blanco", 'A', 10);  // consumo A, 10 kg
        lista[1] = new Electrodomestico(200, 60);                  // defaults: color blanco, consumo F, 60 kg

        // Lavadoras
        lista[2] = new Lavadora(300, "gris", 'B', 25, 8);          // carga 8 kg  (sin extra)
        lista[3] = new Lavadora(300, "negro", 'C', 40, 35);        // carga 35 kg (+50 €)

        // Televisiones
        lista[4] = new Television(500, "negro", 'A', 15, 32, false); // 32" sin TDT
        lista[5] = new Television(400, "blanco", 'D', 12, 55, true); // 55" con TDT (+30% y +50€)

        //Recorrer la lista y mostrar precioFinal de cada objeto 
        
        System.out.println("======= PRECIO FINAL DE CADA ELECTRODOMÉSTICO =======");
        double totalElectrodomesticos = 0;
        double totalLavadoras         = 0;
        double totalTelevisiones      = 0;

        for (Electrodomestico e : lista) {
            double precio = e.precioFinal();
            System.out.println(e + "  -->  Precio final: " + precio + " €");

            totalElectrodomesticos += precio;

            if (e instanceof Lavadora) {
                totalLavadoras += precio;
            } else if (e instanceof Television) {
                totalTelevisiones += precio;
            }
        }

        // Resumen final 
        System.out.println("\n======= RESUMEN =======");
        System.out.println("Suma total Electrodomésticos (todos): " + totalElectrodomesticos + " €");
        System.out.println("Suma total Lavadoras:                 " + totalLavadoras         + " €");
        System.out.println("Suma total Televisiones:              " + totalTelevisiones       + " €");
    }
}