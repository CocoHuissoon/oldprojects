package remi_generics;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Jan
 */
public class KlantContainer <T extends Klant>{
    private ArrayList<T> klanten = new ArrayList();
    
    public void add(T klant){
        klanten.add(klant);
    };
    
    public T get(int nummer){
        return klanten.get(nummer);
    }
    
    public void sortOpNaamAsc(){
        // sorteer op naam van de klant on student last name
        System.out.println("\nsorteer op naam van de klant ");
        Collections.sort(klanten, klantNaamComparator);
        
         for ( Klant klant: klanten) {
            System.out.println(klant.getNaam());
        }
    }
    
    // comparator om te sorteren op Naam van de klant oplopend
    public static Comparator<Klant> klantNaamComparator
                      = new Comparator<Klant>() {

        public int compare(Klant klant1, Klant klant2) {

          String klantNaam1 = klant1.getNaam().toUpperCase();
          String klantNaam2 = klant2.getNaam().toUpperCase();

          //descending order
          return klantNaam1.compareTo(klantNaam2);
        }
    };
}
