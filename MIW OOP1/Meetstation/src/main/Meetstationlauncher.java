package main;

import models.MeetStation;
import models.Meting;
import models.MultiMeting;
import models.Singlemeting;

public class Meetstationlauncher {

	public static void main(String[] args) {
		System.out.println("Dit is het tentamen OOP1 van Coco 500603152");
		Meting single=new Singlemeting(5.0,"Heet!","Fredje");
		Meting s=new Singlemeting(0);
		System.out.println(single);
		System.out.println(s);
		double[]arr= {3.3,4.4,5.5};
		Meting multi=new MultiMeting(arr,"gerke","gerke");
		System.out.println(multi);
		/*
		 *  Vergeet het doel en de HBO-ICT Codeconventies niet!
		 */

		


		/**
		 * Doel:
		 * @author Remi de Boer <r.d.d.de.boer@hva.nl>
		 */
		

		        
	       
		        
		        Singlemeting sMetingWaarde = new Singlemeting(6.0);
		        	        System.out.println(sMetingWaarde);
		        MultiMeting mMeting = new MultiMeting(new double[]{4, 5, 6, 7}); 
		        
		        MultiMeting mMetingOpmerking = new MultiMeting(null, "Het was mistig", "Jaap" );
		        
		        System.out.println(mMetingOpmerking);  
		        
		        MeetStation meetstation = new MeetStation();
		        meetstation.voegMetingToe(mMeting).voegMetingToe(mMeting).voegMetingToe(mMetingOpmerking).voegMetingToe(sMetingWaarde);
		        meetstation.toonRapport();
		        
		    }

		

		

		

}

