package ejercicioInterfaces03VivirAnimales;

public class Gato extends AnimalDomestico {

    public Gato(String nombre, String raza, double peso, String color) {
        super(nombre, raza, peso, color);
    }

    @Override
    public void hacerRuido() {
        System.out.println(nombre + ": Miauu ");
    }

    @Override
    public boolean hacerCaso() {
        return Math.random() < 0.05;
    }

    public void toserBolaPelo() {
        System.out.println(nombre + " está tosiendo una bola de pelo ");
    }
}