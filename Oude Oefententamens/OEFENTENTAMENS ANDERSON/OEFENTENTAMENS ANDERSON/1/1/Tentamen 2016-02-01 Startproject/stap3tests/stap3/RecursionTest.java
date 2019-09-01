package stap3;

import static org.junit.Assert.*;

import org.junit.Test;

import stap2.Recursion;

public class RecursionTest {

	@Test
	public void testInvert() {
		// lege string
		Recursion rec = new Recursion();
		String actual = rec.invert("");
		String expected = "";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInvert2() {
		// lege string
		Recursion rec = new Recursion();
		String actual = rec.invert("op");
		String expected = "po";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInvert3() {
		// lege string
		Recursion rec = new Recursion();
		String actual = rec.invert("h");
		String expected = "h";
		
		assertEquals(expected, actual);
	}

	@Test
	public void testIsPalinDroom() {
		Recursion rec = new Recursion();
		boolean actual = rec.isPalinDroom("h");
		boolean expected = true;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIsPalinDroom2() {
		Recursion rec = new Recursion();
		boolean actual = rec.isPalinDroom("gek");
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIsPalinDroom3() {
		Recursion rec = new Recursion();
		boolean actual = rec.isPalinDroom("gekkeg");
		boolean expected = true;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIsPalinDroom4() {
		Recursion rec = new Recursion();
		boolean actual = rec.isPalinDroom("");
		boolean expected = true;
		
		assertEquals(expected, actual);
	}

}
