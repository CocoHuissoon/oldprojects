
public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Car started");
		super.start();
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
		super.stop();
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
	public void showInfo() {
		System.out.println(name);
	}
	

}
