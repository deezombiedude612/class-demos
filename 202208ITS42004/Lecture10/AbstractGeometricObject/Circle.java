package Lecture10.AbstractGeometricObject;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() { }

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
//		setColor(color);
//		setFilled(filled);
	}

	public double getRadius() { return radius; }
	public void setRadius(double radius) { this.radius = radius; }

	public double getArea() { return Math.pow(radius, 2) * Math.PI; }
	public double getDiameter() { return 2 * radius; }
	public double getCircumference() { return 2 * Math.PI * radius; }
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated()
				+ " and the radius is " + radius);
	}
}
