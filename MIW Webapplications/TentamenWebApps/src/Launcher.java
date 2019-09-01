import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Launcher {
	public static void main(String[] args) throws StackOverflowError {
		User fr = new User("Fredje","rijeirj","bla");
		Note n = new Note("eeee","eeee");
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("userManager");
		EntityManager em = emFactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(fr);
		System.out.println("hello");
		em.getTransaction().commit();
		em.close();
		
		//Oude code hieronder van oud project maar hielp niet want maakte geen verbinding met mysql
		
//		Offer wan = new Offer("Wan");
//		Offer nick = new Offer("Nicky");
//		List <Offer>lijst= new ArrayList<>();
//		List <Baas>ijst=new ArrayList<>();
//		
//		lijst.add(wan);
//		lijst.add(nick);
//		Baas b = new Baas( "Henkie");
//		ijst.add(b);
//		
//		wan.setL(ijst);
//		nick.setL(ijst);
//		b.setLijst(lijst);
//		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("userManager");
//		EntityManager em = emFactory.createEntityManager();
//		em.getTransaction().begin();
//		Baas c = new Baas("ofkeofkeofkoekf");
//		ijst.add(c);
//		c.setLijst(lijst);
//		  em.persist(c);
//
//		em.persist(wan);
//		em.persist(nick);
//
//		em.persist( b);
//		  Baas e = em.find(Baas.class, 1);
//		  Baas q =em.find(Baas.class, 2);
//		  Offer v = em.find(Offer.class, 323);
//		  
//		em.getTransaction().commit();
//		System.out.println(e);
//		System.out.println(q);
//		
//		System.out.println("hello world");
//		em.close();
//		System.exit(0);
	}

}
