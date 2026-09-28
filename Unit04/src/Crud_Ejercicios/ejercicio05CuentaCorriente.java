package Crud_Ejercicios;

// Creamos la clase ejercicio05CuentaCorriente
public class ejercicio05CuentaCorriente {

    // Declaramos los atributos
    private String dni;
    private String nombre;
    private double saldo;
    private String nacionalidad;

    // Constructor solo con DNI (para búsquedas)
    public ejercicio05CuentaCorriente(String dni) {
        this.dni = dni;
    }

    // Constructor con DNI y saldo
    public ejercicio05CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
        this.nacionalidad = "Española";
    }

    // Constructor con DNI, nombre y saldo
    public ejercicio05CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        this.nacionalidad = "Española";
    }

    // Constructor completo
    public ejercicio05CuentaCorriente(String dni, String nombre, double saldo, String nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        this.nacionalidad = nacionalidad;
    }

    // Getter del DNI
    public String getDni() {
        return dni;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Getter del saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para ingresar dinero
    public boolean ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
            return true;
        }
        return false;
    }

    // Método para sacar dinero
    public boolean sacarDinero(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
            return true;
        }
        return false;
    }

    // Método toString
    @Override
    public String toString() {
        return "DNI: " + dni +
               ", Nombre: " + nombre +
               ", Saldo: " + saldo +
               ", Nacionalidad: " + nacionalidad;
    }

    // Método equals (comparando SOLO el DNI)
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ejercicio05CuentaCorriente otra = (ejercicio05CuentaCorriente) obj;

        return this.dni.equals(otra.dni);
    }
}

