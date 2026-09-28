package ejercicio03;

import java.util.Objects;

public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método calcular
    public double calcular(int cantidad) {
        return this.precio * cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Precio base: " + precio + "€";
    }

    // Implementación de equals y hashCode para evitar duplicados en la colección
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(nombre.toLowerCase(), producto.nombre.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase());
    }

    // Implementación de Comparable para ordenar la colección automáticamente
    @Override
    public int compareTo(Producto o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
}