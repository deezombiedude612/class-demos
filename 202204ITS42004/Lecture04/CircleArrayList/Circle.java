package Lecture04.CircleArrayList;

public class Circle {
	private double radius = 1;              // radius of circle
	private static int numberOfObjects = 0; // number of objects created

	// Construct a circle with radius 1
	public Circle() {
		numberOfObjects++;
	}

	// Construct a new circle with a specified radius
	public Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	// Return radius
	public double getRadius() { return radius; }

	// Set a new radius
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}

	// Return number of objects
	public int getNumberOfObjects() { return numberOfObjects; }

	// Return area of this circle
	public double getArea() { return radius * radius * Math.PI; }
}
