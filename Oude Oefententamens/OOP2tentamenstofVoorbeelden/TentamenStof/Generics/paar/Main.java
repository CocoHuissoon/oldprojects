package paar;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		
		/// These test the GENERIC classes PAAR and HardGeneric.
		// PAAR accepts two different types (e.g. int and string) and compares length using their toString.
		// HardGenerics is a generic class that accepts any single data type that implements comparable.
		
		
		// PAAR: 2 instances of PAAR (holding two different (int and string))
		// it compares their LENGTH using toString.
		
		// non-dentical length
		Paar<String, Integer> paar1 = new Paar<>("This is a string", 123);
		// same length
		Paar<String, Integer> paar2 = new Paar<>("string", 123456);

		System.out.println("Paar 1 is identical? " + paar1.compareLength(paar1.getType(), paar1.getValue()));
		System.out.println("Paar 2 is identical? " + paar2.compareLength(paar2.getType(), paar2.getValue()));

		
		// GENERIC class HardGeneric compares a single type (here strings) using implemented compareTo
		HardGeneric hG1 = new HardGeneric("hi");
		HardGeneric hG2 = new HardGeneric("hi");

		System.out.println("Identical? " + hG1.compareTo(hG2));

		// GENERIC class HardGeneric compares a single type (here ints) using implemented compareTo
		HardGeneric hG3 = new HardGeneric(1);
		HardGeneric hG4 = new HardGeneric(2);

		System.out.println("Identical" + hG3.compareTo(hG4));

		
		
		/// This tests the Generic method below! The method compares over generic type E 
		/// (here ive used ints and strings) using compareTo
		
		// Arraylists to test the generic method below. It removes dupes from an array
		// of ints and strings
		ArrayList<Integer> intList1 = new ArrayList<>();
		intList1.add(5);
		intList1.add(5);
		intList1.add(25);
		intList1.add(15);
		intList1.add(25);

		System.out.println(intList1 + " ---> " + removeDupes(intList1));

		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("YO");
		stringList.add("yo");
		stringList.add("iep");
		stringList.add("yo");

		System.out.println(stringList + " ---> " + removeDupes(stringList));
	}

	// Generic method that can compare over types. E is whatever goes in the list
	public static <E extends Comparable<E>> ArrayList<E> removeDupes(ArrayList<E> list) {

		boolean found = false;

		if (list.size() == 0) {
			return list;
		}

		// new list for non-dupes
		ArrayList<E> newList = new ArrayList<>();
		newList.add(list.get(0));

		// iterates thru list looking for dupes
		for (int i = 1; i < list.size(); i++) {
			// interates thru new list
			for (int j = 0; j < newList.size(); j++) {

				// compares
				if (list.get(i).compareTo(newList.get(j)) == 0) {
					found = true;
					break;
				}
			}
			// non-dupes are added to the new list
			if (found != true)
				newList.add(list.get(i));
			found = false;
		}
		return newList;
	}

}
