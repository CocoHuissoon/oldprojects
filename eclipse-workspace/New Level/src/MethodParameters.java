class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int height) {
		System.out.println("Jumping "+ height + " feet");
	}
	public void move(String direction, double distance) {
		System.out.println("Moving toward " + direction + " and made "+ distance);
	}
	
}

public class MethodParameters {
	public static void main(String[] args) {
		Robot robot1 =new Robot();
		robot1.speak("Hi I am Sam");
		robot1.jump(20);
		robot1.move("north", 10.222);
		String speak = ("EEEEEEEEE");
		robot1.speak(speak);
		int value = 11111;
		robot1.jump(value);
		

	}

}
