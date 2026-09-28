package ejercicioInterfaces02Futbolista;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Futbolista[] tabla = {
            new Futbolista(10, "Messi",   36, 30),
            new Futbolista(7,  "Ronaldo", 39, 25),
            new Futbolista(9,  "Benzema", 36, 20),
            new Futbolista(7,  "Neymar",  32, 15),
            new Futbolista(11, "Salah",   32, 28)
        };

        Arrays.sort(tabla);

        for (Futbolista f : tabla) {
            System.out.println(f);
        }
    }
}