package Shapes;

public class Punt {
	private double coordinateX;
	private double coordinateY;

	public Punt(double coordinateX, double coordinateY) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}

	public Punt() {
		this(0, 0);
	}

	public double getcoordinateX() {
		return this.coordinateX;
	}

	public void setcoordinateX(double x) {
		this.coordinateX = x;
	}

	public double getcoordinateY() {
		return this.coordinateY;
	}

	public void setcoordinateY(double y) {
		this.coordinateY = y;
	}
}
