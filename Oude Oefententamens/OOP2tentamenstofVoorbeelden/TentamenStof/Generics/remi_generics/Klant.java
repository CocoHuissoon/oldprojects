package remi_generics;

import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jan
 */ 
public class Klant {
    private String naam;
    private int klantnummer;
    private String adres;
    
    public Klant(String naam, int klantnummer, String adres){
        this.naam = naam;
        this.klantnummer = klantnummer;
        this.adres = adres;
    }
    
    public void setNaam(String naam) {
        this.naam = naam;
    }
            
    public void setKlantnummer(int klantnummer) {
        this.klantnummer = klantnummer;
    }
            
    public void setAdres(String adres) {
        this.adres = adres;
    }
            
     public String getNaam() {
        return this.naam = naam;
    }
            
    public int getKlantnummer() {
        return this.klantnummer = klantnummer;
    }
            
    public String getAdres() {
        return this.adres = adres;
    }
    
    
}
