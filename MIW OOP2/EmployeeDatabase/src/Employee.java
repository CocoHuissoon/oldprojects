import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Employee implements Serializable {

	/**
	 * 
	 */
	
	private String name;
	private int id;
	private double salary;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public Employee() {

	
	 
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.run();

	}

	public void run() {
		int aantalWerknemers=aantalWerknemers();
//		slaWerknemerOp(aantalWerknemers);
		leesWerknemers(aantalWerknemers);
		
	}
	public int aantalWerknemers() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("hoeveel werknemers zijn er");
		int werknemers=sc.nextInt();
		sc.close();
		return werknemers;
	}

	

	public void slaWerknemerOp(int aantalWerknemers ) {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\Gebruiker\\Desktop\\taco.txt"))) {
			

		for (int i = 0; i < aantalWerknemers; i++) {

			System.out.println("Geef naam,id en salaris in aub");
				Scanner sc = new Scanner(System.in);
				Employee s = new Employee(sc.next(), (int) (Math.random()*100000), Math.round((Math.random()*100000)));
				oos.writeObject(s);
		}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}

		}
	

	public void leesWerknemers(int aantalWerknemers)  {
		
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\Users\\Gebruiker\\Desktop\\taco.txt"))) {
			Employee[]es = (Employee[])ois.readObject();
			
		@SuppressWarnings("unchecked")
		ArrayList <Employee>werkers = ( ArrayList<Employee>)ois.readObject();
			for (Employee werkers1 :es) {
				System.out.println(es);
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}




	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}
