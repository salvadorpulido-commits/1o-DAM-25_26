package ejerciciosParte4;

public class Fraccion {
	
	
	    public static void main(String[] args) {

	        Fraccion f1 = new Fraccion(1, 2);
	        Fraccion f2 = new Fraccion(3, 4);

	        Fraccion resultado = f1.suma(f2);

	        System.out.println(resultado.getNumerador() + "/" + resultado.getDenominador());
	    }
	}

}
