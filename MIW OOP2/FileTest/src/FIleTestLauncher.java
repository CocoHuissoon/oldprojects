import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FIleTestLauncher {

	public static void main(String[] args) throws FileNotFoundException {
		String filename = "zebra.txt";
		File text = new File(filename);

//		PrintWriter wr = new PrintWriter(text);
//		wr.println("Maak het aan");
//		wr.println(0);
//		wr.println("Maak nog iets aan");
//		wr.print(filename);
//		wr.close();
		
		System.out.println("Aantal regels is :" + telRegels(text));
		System.out.println("Aantal woorden: " + telWoorden(text));


	}

	public static int telRegels(File text) throws FileNotFoundException {
		Scanner zinnen = new Scanner(text);

		int countLine = 0;
		while (zinnen.hasNextLine()) {
			countLine++;
			zinnen.nextLine();

		}
		zinnen.close();
		return countLine;
	}

	public static int telWoorden(File text) throws FileNotFoundException {
		Scanner woorden = new Scanner(text);

		int countWord = 0;
		while (woorden.hasNext()) {
			countWord++;
			woorden.next();

		}
		woorden.close();
		return countWord;
	}

}
