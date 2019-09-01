 package objectfilers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Objectschrijfenlees {
	
public void slaOp()throws IOException  {
		
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Gebruiker\\Desktop\\taco.txt"))){
			Scanner sc = new Scanner(System.in);
			ArrayList <Object> objecten= new ArrayList<Object>();
			System.out.println("Hoeveel objecten wilt u opslaan?");
			int aantal=sc.nextInt();
			
			for (int i = 0; i<aantal;i++) {
				System.out.println("Geef kenmerk, naam en ietsanders aub");
				int kenmerk=sc.nextInt();
				String naam= sc.next();
				double ietsanders=sc.nextDouble();		
				objecten.add(new Object(kenmerk, naam, ietsanders));
			}
			for (Object w:objecten) {
				os.writeObject(w);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void haalOp() throws ClassNotFoundException {
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\Users\\Gebruiker\\Desktop\\taco.txt"))){
			Scanner sc = new Scanner(System.in);
			ArrayList <Object> objecten= new ArrayList<Object>();
			System.out.println("Hoeveel objecten wilt u ophalen?");
			int aantal=sc.nextInt();
			
			for (int i = 0; i<aantal;i++) {
				objecten.add((Object) is.readObject());	
				
			}
			for (Object w:objecten) {
				System.out.println(w);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
