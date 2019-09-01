package textIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingWordsInAFile {

	public static void main(String[] args) {
		String fileName = specifyFile();
		File f = new File("C:\\Users\\jorik\\Desktop\\Make IT Work\\6. OOP2\\" + fileName);

		int numberOfLines = countLines(f);
		System.out.printf("Het bestand %s heeft %d regels.\n", fileName, numberOfLines);

		int numberOfWords = countWords(f);
		System.out.printf("Het bestand %s heeft %d woorden.\n", fileName, numberOfWords);
	}

	// vraag om de filenaam
	public static String specifyFile() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geef de bestandsnaam: ");
		String fileName = scanner.next();
		scanner.close();

		return fileName;
	}

	// tel het aantal regels
	public static int countLines(File f) {
		int count = 0;

		try (Scanner input = new Scanner(f)) {
			while (input.hasNextLine()) {
				count++;
				input.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR!");
			e.printStackTrace();
		}
		return count;
	}

	// tel het aantal woorden
	public static int countWords(File f) {
		int count = 0;

		try (Scanner input = new Scanner(f)) {
			while (input.hasNext()) {
				count++;
				input.next();
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR!");
			e.printStackTrace();
		}
		return count;
	}

}
