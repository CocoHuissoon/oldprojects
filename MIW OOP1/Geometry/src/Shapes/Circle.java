package Shapes;

public class Circle {
	double radius;
	double centreX;
	double centreY;
	
	public Circle() {
		this.radius=1;
		this.centreX=0;
		this.centreY=0;
	}
	public Circle(double radius) {
		this.radius=radius;
		this.centreX=0;
		this.centreY=0;
	}
	public Circle(double radius, double x, double y) {
		this.radius=radius;
		this.centreX=x;
		this.centreY=y;
	}
	public double calculateArea() {
		return this.radius * this.radius*Math.PI;
	}

	

}
