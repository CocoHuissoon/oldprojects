import java.io.IOException;

import objectfilers.Objectschrijfenlees;
import textfilers.Leesvanfile;
import textfilers.Schrijfnaarfile;

public class Launcher {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Schrijfnaarfile ss = new Schrijfnaarfile();
//		ss.schrijfWeg("monkey.txt");
	Leesvanfile f = new Leesvanfile();
		f.leesFile("monkey.txt");
//		Objectschrijfenlees s = new Objectschrijfenlees();
	//	s.slaOp();
//		s.haalOp();
//		System.out.println(pow(3,5));

	}
	public static  int countOccurenceOf( String source,String target) {
		if (source.contains(target)) {
			
	        return 1+ countOccurenceOf(source.replaceFirst(target, ""), target);
	    }
	    return 0;
	
	}
	public static int pow(int a, int b) {
		int pow=a;
		if(a<=0||b<=0) {
			throw new ArithmeticException();
		}
		for(int i = 1;i<b;i++) {
			pow*=a;
		}
		return pow;
	}

}
