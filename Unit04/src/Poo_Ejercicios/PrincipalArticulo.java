package Poo_Ejercicios;

public class PrincipalArticulo {
    
	public static void main(String[] args) {

        Articulo a = new Articulo();
        a.nombre = "Pijama";
        a.precio = 10;
        a.iva = 21;
        a.cuantosQuedan = 5;

        double pvp = a.precio * 1.21;
        System.out.println(a.nombre + " - Precio:" + a.precio +
                "€ - IVA:" + a.iva + "% - PVP:" + pvp + "€");

        a.precio = 12;
        pvp = a.precio * 1.21;
        System.out.println("Nuevo PVP: " + pvp + "€");
    }
}

