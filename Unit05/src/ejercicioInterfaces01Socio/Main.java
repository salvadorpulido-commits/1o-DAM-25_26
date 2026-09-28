// Main.java
package ejercicioInterfaces01Socio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Socio s1 = new Socio(3, "Ana", 25);
        Socio s2 = new Socio(1, "Luis", 30);
        Socio s3 = new Socio(2, "Marta", 22);

        // Probamos compareTo manualmente
        System.out.println(s1.compareTo(s2)); // positivo s1 va después de s2
        System.out.println(s2.compareTo(s1)); // negativo s2 va antes que s1

        // Ordenamos el array
        Socio[] socios = {s1, s2, s3};
        Arrays.sort(socios);

        for (Socio s : socios) {
            System.out.println(s);
        }
    }
}