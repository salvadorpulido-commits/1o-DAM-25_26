package ejercicioInterfaces03VivirAnimales;

public class Perro extends AnimalDomestico {

    public Perro(String nombre, String raza, double peso, String color) {
        super(nombre, raza, peso, color);
    }

    @Override
    public void hacerRuido() {
        System.out.println(nombre + ": ¡Guau!");
    }

    @Override
    public boolean hacerCaso() {
        return Math.random() < 0.90;
    }

    public void sacarPaseo() {
        System.out.println(nombre + " está saliendo de paseo.");
    }
}