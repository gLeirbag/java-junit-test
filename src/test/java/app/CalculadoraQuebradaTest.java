package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraQuebradaTest {

	@Test
	void twoPlusTwoEqualsFour() {
		CalculadoraQuebrada calculadora = new CalculadoraQuebrada();
		assertEquals(4, calculadora.somar(2, 2));
	}
	@Test
	void twoPlusOneEqualsThree() {
		CalculadoraQuebrada calculadora = new CalculadoraQuebrada();
		assertEquals(3, calculadora.somar(2, 1));
	}

}
