package nl.hva.ict.oop2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import nl.hva.ict.oop2.deel2.OnvoldoendeVoorkennisExceptie;
import nl.hva.ict.oop2.deel2.School;
import nl.hva.ict.oop2.deel2.Trappist;
import nl.hva.ict.oop2.deel3.LaadSessieKWH;


/**
 *
 * @author breud
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws ClassNotFoundException 
     * @throws OnvoldoendeVoorkennisExceptie 
     */
    public static void main(String[] args) throws ClassNotFoundException, OnvoldoendeVoorkennisExceptie {
//        testDeel1();
       testDeel2();
        testDeel3();
    }
    
    /**
     * Deze methode test deel 1 (Brouwerij)
     */
    private static void testDeel1() {
        Trappist t = new Trappist("WestMalle");
        t.gist(3);
    }
    
    /**
     * Deze methode test deel 2 (Voorkennis)
     * @throws OnvoldoendeVoorkennisExceptie 
     */
    private static void testDeel2() throws OnvoldoendeVoorkennisExceptie {
        School hva = new School();
        hva.startSchooljaar();
    }
    
    /**
     * Deze methode test deel 3 ()
     * @throws ClassNotFoundException 
     */
    private static void testDeel3() {
    	
    	
    		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("laad2.dat"))){
    			Scanner sc = new Scanner(System.in);
    			ArrayList <LaadSessieKWH> objecten= new ArrayList<LaadSessieKWH>();
    			System.out.println("Hoeveel objecten wilt u ophalen?");
    			int aantal=sc.nextInt();
    			
    			for (int i = 0; i<aantal;i++) {
    				objecten.add((LaadSessieKWH) is.readObject());	
    				
    			}
    			for (Object w:objecten) {
    				System.out.println(w);
    			}
    			sc.close();
    		} catch (FileNotFoundException e) {
    			
    			System.out.println("Kan file niet vinden! ");
    		} catch (IOException e) {
    			
    			System.out.println("Kan file niet lezen! ");
    		}catch (ClassNotFoundException e) {
    			
    			System.out.println("Kan file niet lezen ");
    		}
    		
    	}
        
    
    
}
