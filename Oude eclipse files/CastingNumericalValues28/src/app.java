
public class app {
	public static void main (String[]args) {
		
		double doubleValue=2.222;
		float floatValue = 23333.8f;
		long longValue = 20022;
		byte byteValue= 12;
		short shortValue= 32;
		int intValue = 44;
		
		intValue = (int)longValue;
		
		doubleValue = byteValue + byteValue;
		intValue = (int) floatValue;
		
		/*Werkt niet zoals het heurt!!!
		 * Max waarde van een byte is 127
		 * blblblblblblblblblblblbl
		 */
		byteValue =  (byte) 129;
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println("int is " + intValue);
		System.out.println(doubleValue);
		System.out.println(intValue);
		System.out.println(byteValue);
		
	}

}
