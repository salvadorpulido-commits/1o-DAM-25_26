package Poo_Ejercicios;

public class B1PrincipalArticulo {
    public static void main(String[] args) {

        B1Articulo a1 = new B1Articulo("Pijama", 10, 21, 5);
        B1Articulo a2 = new B1Articulo("", -5, 150, -3);

        System.out.println(a1.nombre + " - Precio: " + a1.precio +
                "€ - IVA: " + a1.iva + "% - PVP: " + a1.getPVP() +
                "€ - Stock: " + a1.cuantosQuedan);

        System.out.println(a2.nombre + " - Precio: " + a2.precio +
                "€ - IVA: " + a2.iva + "% - PVP: " + a2.getPVP() +
                "€ - Stock: " + a2.cuantosQuedan);
    }
}
