import java.io.IOException;

public class Launcher {

	public static void main(String[] args) throws IOException {
//		FileSchrijver f= new FileSchrijver();
//		f.schrijfWeg("test.txt");
		FileLezer f= new FileLezer();
		f.leesFile("C:\\Users\\Gebruiker\\Desktop\\unko.txt");

	}

}
