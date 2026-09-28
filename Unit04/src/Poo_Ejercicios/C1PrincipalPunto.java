package Poo_Ejercicios;

public class C1PrincipalPunto {
	
    public static void main(String[] args) {

        // Crear objetos usando constructor
        C1Punto p1 = new C1Punto(2, 3);
        C1Punto p2 = new C1Punto(-1, 5);

        // Mostrar valores con getters
        System.out.println("Punto 1: (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("Punto 2: (" + p2.getX() + "," + p2.getY() + ")");

        // Modificar valores con setters
        p1.setX(10);
        p1.setY(20);

        System.out.println("Punto 1 modificado: (" + p1.getX() + "," + p1.getY() + ")");
    }
}
