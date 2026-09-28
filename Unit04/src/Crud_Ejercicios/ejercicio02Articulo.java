package Crud_Ejercicios;

// Creamos la clase Articulo
public class ejercicio02Articulo {

    // Creamos el atributo codigo
    private int codigo;

    // Creamos el atributo descripcion
    private String descripcion;

    // Creamos el atributo precioCompra
    private double precioCompra;

    // Creamos el atributo precioVenta
    private double precioVenta;

    // Creamos el atributo stock
    private int stock;

    // Creamos el constructor con todos los datos
    public ejercicio02Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        // Asignamos el código
        this.codigo = codigo;
        // Asignamos la descripción
        this.descripcion = descripcion;
        // Asignamos el precio de compra
        this.precioCompra = precioCompra;
        // Asignamos el precio de venta
        this.precioVenta = precioVenta;
        // Asignamos el stock
        this.stock = stock;
    }

    // Creamos el método getCodigo
    public int getCodigo() {
        return codigo;
    }

    // Creamos el método getStock
    public int getStock() {
        return stock;
    }

    // Creamos el método setStock
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Sobrescribimos el método toString
    @Override
    public String toString() {
        return "Código: " + codigo +
               " | Descripción: " + descripcion +
               " | P.Compra: " + precioCompra +
               " | P.Venta: " + precioVenta +
               " | Stock: " + stock;
    }
}
