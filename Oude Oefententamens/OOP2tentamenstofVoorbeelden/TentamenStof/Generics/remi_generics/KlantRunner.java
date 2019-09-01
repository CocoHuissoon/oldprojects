package remi_generics;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jan
 */
public class KlantRunner {

    public static void main(String[] args) {
        
        KlantContainer<Klant> kc = new KlantContainer();
       
        kc.add(new Klant("Jan de VL",4,"H. K. Rietberghof 15"));
        kc.add(new Klant("Piet Klerxk",2,"welderstraat 21"));
        kc.add(new Klant("Henk de Knip",6,"Mariaplantsoen 31"));
        kc.add(new Klant("Anton de Bakker",5,"Gardenalaan 164"));
        kc.add(new Klant("Theo van Vliet",3,"Rijnstraat 41"));
        
        kc.sortOpNaamAsc();
        
        
    }
    
}
