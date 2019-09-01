package binaryIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Stap3 implements Serializable {

	private static Scanner input = new Scanner(System.in);

	public Stap3() {
		super();
	}

	public static void main(String[] args) {
		Stap3 opg = new Stap3();
		
		// binary to Getal
		opg.writeOutput(opg.leesBinaireData("getallen.dat"));
		// Getal to text
		opg.writeToObject(opg.leesTextData("output.txt"));
		// Text to binary
		opg.leesBinaireStringData("data.dat");

	}

	private List<Getal> leesBinaireData(String filenaam) {

		File file = new File("getallen.dat");
		List<Getal> lijst = new ArrayList<>();

		boolean EOF = false;

		try {
			FileInputStream fileInputStream = new FileInputStream(file);

			ObjectInputStream objectIn = new ObjectInputStream(fileInputStream);

			while (!EOF) {
				lijst.add((Getal) objectIn.readObject());
				// System.out.print(obj);
				// objectIn.close(); ///
			}
		} catch (IOException ex) {
			System.out.println("\nEnd of file!");
			EOF = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Read binary to Getal! " + lijst);
		return lijst;
	}

	private List<String> leesBinaireStringData(String filenaam) {

		File file = new File("data.dat");
		List<String> lijst = new ArrayList<>();

		boolean EOF = false;

		try {
			FileInputStream fileInputStream = new FileInputStream(file);

			ObjectInputStream objectIn = new ObjectInputStream(fileInputStream);

			while (!EOF) {
				String x = (String) objectIn.readObject();
				lijst.add(x);
				// System.out.print(obj);
				// objectIn.close(); ///
			}
		} catch (IOException ex) {
			System.out.println("\nEnd of file!");
			EOF = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Read binary to String! " + lijst);
		return lijst;
	}

	private void writeOutput(List<Getal> getallen) {

		System.out.println("REMOVING FRACTURES");
		ArrayList<Getal> lijst = new ArrayList<>();

		for (int i = 0; i < getallen.size(); i++) {
			if (getallen.get(i) instanceof Geheel) {
				lijst.add(getallen.get(i));
			}
		}
		try {
			FileWriter fstream = new FileWriter("output.txt"); // add true for append
			BufferedWriter out = new BufferedWriter(fstream);

			String sep = "";
			for (int i = 0; i < lijst.size(); i++) {
				out.write(sep + lijst.get(i));
				sep = ", ";
			}
			out.write("\n");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String leesTextData(String loc) {

		File file = new File("output.txt");
		String readLine = "";

		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.print("Unable to locate file ");
		}

		while (input.hasNextLine()) {

			readLine = input.nextLine();
			System.out.println("READING OUTPUT FILE");
			//System.out.println(readLine);
		}
		return readLine;
	}

	public void writeToObject(String readLine) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"))) {
			oos.writeObject(readLine);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}