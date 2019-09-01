package dit.niet.veranderen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BreukTest {

	@Test
	void testTelop() {
		 Breuk b = new Breuk(1, 2);
		 Breuk actual=b.telop(b);
		 assertEquals(expected, actual); 
	}

	@Test
	void testVermenigvuldig() {
		fail("Not yet implemented");
	}

}
