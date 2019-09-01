package calculator;

/**
 * Eenvoudige calculator klasse.
 * 
 * Zit een geheugen functie in.
 * 
 * 
 * @author michel
 *
 */
public class Calculator {
	
	public double	memory = 0;
	
	// Basic operations
	public double add( double a, double b) { return a + b; }
	public double subtract( double a, double b) { return a - b; }
	public double multiply( double a, double b) { return a * b; }
	public double divide( int a, int b) { return a / b; }
	
	public boolean isPositive( double a ) { return a >= 0; }
	public boolean isNegative( double a ) { return a < 0; }
	
	public int roundDown( double a ) { return (int)a; }
	public int roundUp( double a ) { return (int)(a + 1); }
	
	// Memory functions
	public void memStore( double a ) { memory = a; }
	public double memRecall()  { return memory; }
	
	
	// Advance operations
	public double addAll( double[] a ) {
		double sum = 0;
		
		for ( double d : a ) {
			sum = add( sum, d );
		}
		return sum;
	}

	public double multiplyAll( double[] a ) {
		double total = 0;
		
		for ( double d : a ) {
			total = multiply( total, d );
		}
		return total;
	}
	
	public double[] addArray( double[] a, double[] b) {
		double[] result = new double[ a.length ];
		
		for ( int i=0; i<a.length; i++ ) {
			result[i] = a[i] + b[i];
		}
		
		return result;
	}
}