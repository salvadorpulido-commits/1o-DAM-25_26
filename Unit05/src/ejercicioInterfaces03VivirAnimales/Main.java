package ejercicioInterfaces03VivirAnimales;

public class Main {
    public static void main(String[] args) {

        Perro rex = new Perro("Rex", "Pastor Alemán", 30.0, "negro");
        Gato whiskers = new Gato("Whiskers", "Siamés", 4.5, "blanco");

        rex.comer();
        rex.hacerRuido();
        rex.sacarPaseo();
        System.out.println("¿Rex hace caso? " + rex.hacerCaso());

        System.out.println("---");

        whiskers.dormir();
        whiskers.hacerRuido();
        whiskers.toserBolaPelo();
        System.out.println("¿Whiskers hace caso? " + whiskers.hacerCaso());

        // Polimorfismo: usamos el tipo de la interfaz
        
        Vivir[] animales = {rex, whiskers};
        System.out.println("\n-- Todos hacen ruido --");
        for (Vivir a : animales) {
            a.hacerRuido();
        }
    }
}