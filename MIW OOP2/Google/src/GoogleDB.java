import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GoogleDB {
	
	public void getDay() throws ClassNotFoundException {
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\Users\\Gebruiker\\Desktop\\google-data\\data\\Google-2017-04.dat"))){
			
			Google g = (Google) ois.readObject();
			System.out.println(g.toString());
			
		} catch (FileNotFoundException e) {
			System.out.println("File niet gevonden");
		} catch (IOException e) {
			System.out.println("Kan file niet lezen");
		}
		finally {
			System.out.println();
		}
	}
}
