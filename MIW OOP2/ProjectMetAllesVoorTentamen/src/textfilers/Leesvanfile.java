package textfilers;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leesvanfile {
	public Leesvanfile() {
		super();
	}
	public void leesFile(String url) throws IOException {
		try (BufferedReader b = new BufferedReader(new FileReader(new File(url)))) {
			String s;
			while ((s = b.readLine()) != null) {
				System.out.println(s);
			}
			b.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
