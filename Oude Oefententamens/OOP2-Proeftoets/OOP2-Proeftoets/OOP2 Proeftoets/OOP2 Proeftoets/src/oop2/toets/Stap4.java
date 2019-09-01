package oop2.toets;

public class Stap4 {

	public static void main(String[] args) {
		System.out.println(countOccurenceOf("voorMIW3maalMIWgeschrevenMIW","MIW"));
		

	}

	public static  int countOccurenceOf( String source,String target) {
		if (source.contains(target)) {
			
	        return 1+ countOccurenceOf(source.replaceFirst(target, ""), target);
	    }
	    return 0;
	
	}

}
