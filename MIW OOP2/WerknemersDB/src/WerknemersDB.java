import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class WerknemersDB {
	

	

	public void slaOp()throws IOException  {
		
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Gebruiker\\Desktop\\taco.txt"))){
			Scanner sc = new Scanner(System.in);
			ArrayList <Werknemers> werkers= new ArrayList<Werknemers>();
			System.out.println("Hoeveel werknemers wilt u opslaan?");
			int aantal=sc.nextInt();
			
			for (int i = 0; i<aantal;i++) {
				System.out.println("Geef id, naam en salaris aub");
				int id=sc.nextInt();
				String naam= sc.next();
				double salaris=sc.nextDouble();		
				werkers.add(new Werknemers(id,naam,salaris));
			}
			for (Werknemers w:werkers) {
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
			ArrayList <Werknemers> werkers= new ArrayList<Werknemers>();
			System.out.println("Hoeveel werknemers wilt u ophalen?");
			int aantal=sc.nextInt();
			
			for (int i = 0; i<aantal;i++) {
				werkers.add((Werknemers) is.readObject());	
				
			}
			for (Werknemers w:werkers) {
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
