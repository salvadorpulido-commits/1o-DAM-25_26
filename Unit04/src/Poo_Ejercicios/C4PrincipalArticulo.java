package Poo_Ejercicios;

	public class C4PrincipalArticulo {

	    public static void main(String[] args) {

	        // Artículo correcto
	        C4Articulo a1 = new C4Articulo("Cuaderno", 2.5, 21, 10);

	        System.out.println("Artículo: " + a1.getNombre());
	        System.out.println("Precio base: " + a1.getPrecio());
	        System.out.println("IVA: " + a1.getIva() + "%");
	        System.out.println("Precio final: " + a1.getPrecioFinal());
	        System.out.println("Stock: " + a1.getCuantosQuedan());

	        // Modificar con valores correctos
	        a1.setPrecio(3);
	        a1.setCuantosQuedan(5);

	        // Intentar valores incorrectos
	        a1.setPrecio(-10);
	        a1.setIva(15);
	        a1.setCuantosQuedan(-3);

	        System.out.println("\nTras intentar valores incorrectos:");
	        System.out.println("Precio: " + a1.getPrecio());
	        System.out.println("IVA: " + a1.getIva());
	        System.out.println("Stock: " + a1.getCuantosQuedan());
	    }
	}
	