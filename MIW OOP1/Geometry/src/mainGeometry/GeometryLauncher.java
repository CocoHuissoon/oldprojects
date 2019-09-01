package mainGeometry;
import Shapes.*;
public class GeometryLauncher {

	public static void main(String[] args) {
		Circle myFirstCircle = new Circle();
		Circle mySecondCircle= new Circle(5.2);
		Circle myThirdCircle= new Circle(4.5,3.2,5.1);
		System.out.println(myThirdCircle.calculateArea());
		System.out.println("hellow");
		Rectangle square = new Rectangle(4,2,4,0);
		System.out.println(square.getArea());
		System.out.println(square.getCircumference());
		System.out.println(square.containsPoint(4, 4));
		
		
		

	}

}
