package test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();

		double expected = 4.9;
		double actual = cal.add(0.1, 4.8);

		assertEquals(expected, actual, 0.000000001);
	}

	@Test
	public void testSubtract() {
		Calculator cal = new Calculator();

		double expected = 4.0;
		double actual = cal.subtract(8.5, 4.5);

		assertEquals(expected, actual, 0.000000001);
	}

	@Test
	public void testMultiply() {
		Calculator cal = new Calculator();

		double expected = 40.5;
		double actual = cal.multiply(4.5, 9);

		assertEquals(expected, actual, 0.000000001);
	}

	@Test(expected = java.lang.ArithmeticException.class) // Dit is om aan te geven dat je een error verwacht met de 0
															// als deelwaarde
	public void testDivide() {
		Calculator cal = new Calculator();
		double expected = 4/0;
		double actual = cal.divide(4, 0);
		
		assertEquals(expected, actual, 0.000000001);
		
	}

	@Test
	public void testIsPositive() {
		Calculator cal = new Calculator();

		assertTrue(cal.isPositive(10.0));
	}

	@Test
	public void testIsNegative() {
		Calculator cal = new Calculator();

		assertTrue(cal.isNegative(-10.0));
	}

	@Test
	public void testRoundDown() {
		Calculator cal = new Calculator();

		assertTrue(cal.roundDown(7.8) == 7);
	}

	@Test
	public void testRoundUp() {
		Calculator cal = new Calculator();

		assertTrue(cal.roundUp(7.8) == 8);
	}

	@Test
	public void testMemStore() {
		Calculator cal = new Calculator();
		cal.memStore(10.5);
		double expected = 10.5;
		double actual = cal.memory;
		
		assertEquals(expected, actual, 0.000000001);
	}

	@Test
	public void testMemRecall() {
		Calculator cal = new Calculator();
		cal.memory = 10.5;
		
		double expected = 10.5;
		double actual = cal.memRecall();
		
		assertEquals(expected, actual, 0.000000001);
	}

	@Test
	public void testAddAll() {
		Calculator cal = new Calculator();
		double[] array = {0.0, 0.2, 0.4, 1.4, 2.5, 4.3};
		double expected = 8.8;
		double actual = cal.addAll(array);
		
		assertEquals(expected, actual, 0.000000001);
	}

	@Test
	public void testMultiplyAll() {
		Calculator cal = new Calculator();
		double[] array = {0.0, 0.2, 0.4, 1.4, 2.5, 4.3};
		double expected = 0;
		double actual = cal.multiplyAll(array);
		
		assertEquals(expected, actual, 0.000000001);
	}

	@Test
	public void testAddArray() {
		Calculator cal = new Calculator();
		double[] a = {0.0, 0.2, 0.4, 1.4, 2.5, 4.3};
		double[] b = {1.0, -1.2, 2.4, -3.0, 34.2, -10.0};
		
		double[] expected = {1.0, -1.0, 2.8, -1.6, 36.7, -5.7};
		double[] actual = cal.addArray(a, b);
		
		assertArrayEquals(expected, actual, 0.000000001);
	}

}
