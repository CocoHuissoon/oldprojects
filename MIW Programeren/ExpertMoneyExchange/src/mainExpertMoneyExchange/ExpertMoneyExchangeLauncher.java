package mainExpertMoneyExchange;

public class ExpertMoneyExchangeLauncher {

	public static void main(String[] args) {
		int valuta=3;
		String valutaNaam;
		
		switch (valuta) {
		case 1: valutaNaam="Dollar"  ;
		break;
		case 2: valutaNaam="Pond";
		break;
		case 3: valutaNaam="Yen";
		break;
		default: valutaNaam="Geen geldige valuta"
		}
		
		
		//Valuta (1 = US dollar, 2 = GB pounds, 3 = Yen): 3
		//In te wisselen bedrag (alleen gehele getallen): 12000
		//Voor 12000 Yen krijgt u 102.26 Euro.
		

	}

}
