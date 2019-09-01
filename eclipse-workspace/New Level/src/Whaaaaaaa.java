class Person {
	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name + " and my age is " + age);
	}

	int calculateYearsoRetirement() {
		int yearsLeft = 65 - age;
		System.out.println("I have to work for " + yearsLeft + " years ");
		return yearsLeft;
	}
		String getName () {
			return name;
		}
}

public class Whaaaaaaa {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Linda";
		person1.age = 0;
		person1.speak();
		int years = person1.calculateYearsoRetirement();
		System.out.println("Years till retirement are " + years);
		String name = person1.getName();
		System.out.println("Name is: " + name);

	}

}
