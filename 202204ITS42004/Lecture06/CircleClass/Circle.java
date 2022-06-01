package Lecture06.CircleClass;

public class Circle {
	// data fields/properties
	private double radius;  // radius of circle
	static int numberOfObjects = 0; // total number of Circle objects created

	// no-arg constructor - no arguments passed in
	public Circle() {
		radius = 1; // radius initializes to 1 by default
		numberOfObjects++;  // when creating a Circle, you increment numberOfObjects
	}

	// overloaded constructor, contains newRadius to initialize radius property
	public Circle(double newRadius) {
		radius = newRadius; // radius initializes to what value the newRadius param takes on
		numberOfObjects++;  // when creating a Circle, you increment numberOfObjects
	}

	// return area of circle
	public double getArea() {
		return (radius * radius * Math.PI);
	}

	// return the perimeter (i.e., circumference) of circle
	public double getPerimeter() {
		return (2 * radius * Math.PI);
	}

	// set a new radius for the circle
	public void setRadius(double newRadius) {
		if (newRadius > 0)
			radius = newRadius;
		else
			System.out.println("Invalid new radius value! Radius not changed.");
	}

	public double getRadius() {
		return radius;
	}
}
