import static org.junit.Assert.*;

import org.junit.Test;

import stap2.Recursion;

public class RecursionTest {



	@Test
	public void testInvert() {
		Recursion s = new Recursion();
		String expected="cat";
		String actual=s.invert("tac");
		assertEquals(expected,actual);
		
		
	}
	@Test
	public void testInvert1() {
		Recursion s = new Recursion();
		String expected="";
		String actual=s.invert("");
		assertEquals(expected,actual);
		
		
	}
	@Test
	public void testInvert2() {
		Recursion s = new Recursion();
		String expected="c";
		String actual=s.invert("c");
		assertEquals(expected,actual);
		
		
	}

	@Test
	public void testIsPalinDroom() {
		Recursion s = new Recursion();
		boolean expected=true;
		boolean actual=s.isPalinDroom("maam");
		assertEquals(expected,actual);
	}
	@Test
	public void testIsPalinDroom1() {
		Recursion s = new Recursion();
		boolean expected=false;
		boolean actual=s.isPalinDroom("okdeokdoekfnnf");
		assertEquals(expected,actual);
	}
	@Test
	public void testIsPalinDroom2() {
		Recursion s = new Recursion();
		boolean expected=true;
		boolean actual=s.isPalinDroom("cococococococ");
		assertEquals(expected,actual);
	}

}
