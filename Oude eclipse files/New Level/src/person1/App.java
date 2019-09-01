package person1;
//Methods 
class Person {
	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contain:

	// 1. Data
	// 2. Subroutines (methods)
	void speak() {
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is " + name + " and my age I am " + age);
		}
	}
	void sayHello () {
		System.out.println("Hello there");
	}

}

public class App {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Joe Blogs";
		person1.age = 37;
		person1.speak();
		person1.sayHello();
		

		Person person2 = new Person();
		person2.name = "pooooop";
		person2.age = 12;
		person2.speak();
		System.out.println();
		System.out.println(person1.name);
		System.out.println(person1.age);
		

	}

}
