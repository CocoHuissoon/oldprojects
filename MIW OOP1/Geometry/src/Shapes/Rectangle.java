package Shapes;

public class Rectangle {
	double width;
	double height;
	double leftUpperX;
	double leftUpperY;
	
	public Rectangle() {
		this(0,0);
	}
	public Rectangle(double width, double height) {
		this(width, height,0,0);
	}
	public Rectangle(double width, double height, double leftUpperX, double leftUpperY) {
		this.width=width;
		this.height=height;
		this.leftUpperX=leftUpperX;
		this.leftUpperY=leftUpperY;
	}
	public double getArea() {
		return this.width * this.height;
	}
	public double getCircumference() {
		return (this.height+this.width)*2;
	}
	
	public boolean containsPoint(double pointX, double pointY) {
		boolean containsPoint=false;
		if (this.leftUpperX==pointX||this.leftUpperY==pointY) {
			containsPoint=true;
		}
		return containsPoint;
	}
	
	


}
