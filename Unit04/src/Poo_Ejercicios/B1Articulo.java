package Poo_Ejercicios;

public class B1Articulo {

    String nombre;
    double precio;
    int iva;
    int cuantosQuedan;

    // Constructor con validación básica
    public B1Articulo(String nombre, double precio, int iva, int cuantosQuedan) {

        if (nombre != null && !nombre.equals("")) {
            this.nombre = nombre;
        } else {
            this.nombre = "Sin nombre";
        }

        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0;
        }

        if (iva >= 0 && iva <= 100) {
            this.iva = iva;
        } else {
            this.iva = 21;
        }

        if (cuantosQuedan >= 0) {
            this.cuantosQuedan = cuantosQuedan;
        } else {
            this.cuantosQuedan = 0;
        }
    }

    double getPVP() {
        return precio + (precio * iva / 100.0);
    }
}

