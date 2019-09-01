package mainBtwBerekenen;

public class BtwBerekenenLauncher {

	public static void main(String[] args) {
		//double inkoopPrijs = 70.80;
		//int winstMarge=15;
		//double verkoopPrijsExBtw= 81.41999999999999;
		final double verkoopPrijsZesBtw=86.30519999999999;
		final double verkoopPrijsTweeEenBtw= 98.51819999999998;
		System.out.println("De prijs zonder btw is: " + berekenVerkoopprijsExclusief(70.80,15));
		System.out.println("De prijs met een hoge btw is: " +prijsInclBtw(81.42,0.21));
		

	}
	public static double berekenVerkoopprijsExclusief(double inkoopPrijs, double winstMarge) {
		double winstMarge1=winstMarge/100;
		double verkoopPrijsExclusief= inkoopPrijs +(inkoopPrijs*winstMarge1);
		return verkoopPrijsExclusief;
		
	}
	public static double prijsInclBtw(double verkoopPrijs, double btw) {
		double prijsinclbtw= verkoopPrijs+ (verkoopPrijs*btw);
		return prijsinclbtw;
	}

}
