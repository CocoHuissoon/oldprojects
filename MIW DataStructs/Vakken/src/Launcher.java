import java.io.File;
import java.util.HashMap;

public class Launcher {
	public static void main(String[] args) {
		Vakken v = new Vakken("src/vakcodes.txt");
		System.out.println(v.toString());
		System.out.println(v.getVakken().get("CS101"));
		System.out.println(v.getVakken().containsKey("CS999"));
		System.out.println(v.getVakken().containsValue(10));

		
	}

}
