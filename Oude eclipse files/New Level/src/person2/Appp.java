package person2;
class Person {
	String name;
	int age;
	void speak () {
		System.out.println("My name is " + name  + " and my age is " + age);
	}
	
}


public class Appp {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Linda";
		person1.age = 23;
		person1.speak();
		

	}

}