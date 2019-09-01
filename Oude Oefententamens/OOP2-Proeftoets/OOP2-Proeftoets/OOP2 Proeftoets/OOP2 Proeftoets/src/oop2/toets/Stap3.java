/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.toets;

import dit.niet.veranderen.Breuk;
import dit.niet.veranderen.Geheel;
import dit.niet.veranderen.Getal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author huub
 */
public class Stap3 {
  
  public Stap3() {
    super();
  }
  
  public static void main(String[] args) throws ClassNotFoundException {
    Stap3 opg = new Stap3();
    opg.writeOutput(opg.leesBinaireData("getallen.dat"));
   
  }
  
  private List<Getal> leesBinaireData(String filenaam) throws ClassNotFoundException {
	  ArrayList <Getal> getallen= new ArrayList<Getal>();
	  try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(filenaam))){
			while(true) {
				Getal g=(Getal) is.readObject();
				if(g instanceof Geheel) {

					getallen.add(g) ;	
				}
			}
				
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Kan file niet vinden");
		} catch (IOException e) {
			System.out.println("Kan file niet lezen");
		}
	  return getallen;
  }


  
  private void writeOutput(List<Getal> getallen) {
	  
			
			for (Getal g:getallen) {
				System.out.print(g+", ");
				
			}
			
		
    
  }
  
}
