package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testResta() {
		// Camino 1: num1 mayor que num2 (entrará por el if de resta)
		
		Calculadora calc1 = new Calculadora(20, 10);
		assertEquals(10, calc1.resta(), "20 - 10 debe ser 10");
		
		// Camino 2: num1 menor que num2 (entrará por el else de resta, invirtiendo la resta)
		
		Calculadora calc2 = new Calculadora(10, 20);
		assertEquals(10, calc2.resta(), "Al ser num1 menor, debe restar num2 - num1 (20 - 10)");
	}

	@Test
	void testResta2() {
		// Probamos caso verdadero (num1 >= num2)
		
		Calculadora calcTrue = new Calculadora(20, 10);
		assertTrue(calcTrue.resta2(), "Debe devolver true porque 20 > 10");
		
		// Probamos caso falso (num1 < num2)
		
		Calculadora calcFalse = new Calculadora(10, 20);
		assertFalse(calcFalse.resta2(), "Debe devolver false porque 10 < 20");
	}

	@Test
	void testDivide2() {
		// Probamos división normal (no debe ser null y debe dar un resultado correcto)
		
		Calculadora calcNormal = new Calculadora(20, 2);
		assertNotNull(calcNormal.divide2(), "El resultado no debe ser nulo");
		assertEquals(10, calcNormal.divide2(), "20 / 2 debe ser 10");
		
		// Probamos división por cero (debe devolver null en lugar de una excepción)
		
		Calculadora calcNull = new Calculadora(20, 0);
		assertNull(calcNull.divide2(), "El resultado debe ser nulo al dividir por 0");
	}

	@Test
	void testDivide0() {
		// Probamos que efectivamente lanza la excepción usando JUnit 5
		
	
		Calculadora calcExcepcion = new Calculadora(6, 0);
		
		assertThrows(ArithmeticException.class, () -> calcExcepcion.divide0(), 
				"Debe lanzar ArithmeticException cuando num2 es 0");
	}
	
}