package Lecture09.AbstractClassExample;

// From Lecture 9 Slide 11
public class Circle extends GeometricObject {
	private double radius;  // radius of circle
	private static int numberOfObjects = 0; // total number of Circle objects created

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

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() { return radius; }    // return radius
	// set a new radius for the circle
	public void setRadius(double radius) {
		if (radius > 0)
			this.radius = radius;
		else
			System.out.println("Invalid new radius value! Radius not changed.");
	}

	// return area of circle
	public double getArea() { return (radius * radius * Math.PI); }

	// return diameter
	public double getDiameter() { return 2 * radius; }

	// return the perimeter (i.e., circumference) of circle
	public double getPerimeter() { return (2 * radius * Math.PI); }

	// print the circle info
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() +
				" and the radius is " + radius);
	}
}
