package stap4;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dierentuin {
	private File f;
	private List<Dier> dierenLijst;
	
	// Constructor
	public Dierentuin(String fileName) {
		super();
		this.f = new File(fileName);
		this.dierenLijst = new ArrayList<Dier>();
	}
	
	public void leesBestandIn() {
		boolean EOF = false; //End of file
		
		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)))) {
			while(!EOF) {
				this.dierenLijst.add((Dier)ois.readObject());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			System.out.println("End of file reached!");
			EOF = true;
		}
	}
	
	public void print() {
		System.out.printf("\nDe file bevat %d dieren\n", this.dierenLijst.size());
		for(Dier dier: dierenLijst) {
			System.out.println(dier);
		}
	}

}
