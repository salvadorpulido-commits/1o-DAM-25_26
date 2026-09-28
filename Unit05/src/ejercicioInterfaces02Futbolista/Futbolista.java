package ejercicioInterfaces02Futbolista;

public class Futbolista implements Comparable<Futbolista> {

    private int numeroCamiseta;
    private String nombre;
    private int edad;
    private int goles;

    public Futbolista(int numeroCamiseta, String nombre, int edad, int goles) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.edad = edad;
        this.goles = goles;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Futbolista)) return false;
        Futbolista otro = (Futbolista) obj;
        return this.numeroCamiseta == otro.numeroCamiseta
            && this.nombre.equals(otro.nombre);
    }

    @Override
    public int compareTo(Futbolista otro) {
        if (this.numeroCamiseta != otro.numeroCamiseta) {
            return this.numeroCamiseta - otro.numeroCamiseta;
        }
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return "Futbolista{camiseta=" + numeroCamiseta
            + ", nombre=" + nombre
            + ", edad=" + edad
            + ", goles=" + goles + "}";
    }
}