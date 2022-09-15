package app;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void twoPlusTwoEqualsFour() {
		Calculadora calculadora = new Calculadora();
		assertEquals(4, calculadora.somar(2, 2));
	}
	@Test
	void twoPlusOneEqualsThree() {
		Calculadora calculadora = new Calculadora();
		assertEquals(3, calculadora.somar(2, 1));
	}

}
