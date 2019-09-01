package mainAreaRectangle;
import java.util.Scanner;
public class AreaRectangleLauncher {

	public static void main(String[] args) {
		/*Scanner myScanner = new Scanner(System.in);
		double basis = myScanner.nextDouble();
		double hoogte= myScanner.nextDouble();
		double areaRectangle= 0.5*(basis*hoogte);
		System.out.println(areaRectangle);
		int hoog=4;
		 hoog+=4;
		 System.out.println(hoog);*/
		boolean isWaar=5<5;
		if (!(isWaar)) {
			System.out.println("sout");
			double modulo= 400.0%2.0;
			System.out.println(modulo);
		}
		
		
		System.out.println(getAreaRectangle(4.4,5.3));
		System.out.println(getAreaCirkel(3.0));

	}
	public static double getAreaRectangle(double length,double width) {
		double areaRectangle=length*width;
		return areaRectangle;
	}
	public static double getAreaCirkel(double radius) {
		double areaCirkel=Math.PI*(radius*radius);
		return areaCirkel;
	}
	

}
