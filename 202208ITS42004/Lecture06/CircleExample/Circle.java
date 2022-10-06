package Lecture06.CircleExample;

public class Circle {
	// attributes/properties of the Circle
	double radius;
	static int numberOfObjects = 0;

	// no-arg constructor
	public Circle() {
		radius = 1;
		numberOfObjects += 1;
	}

	// overloaded constructor
	public Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects += 1;
	}

	// returns area of circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// returns circumference (perimeter) of circle
	public double getCircumference() {
		return 2 * radius * Math.PI;
	}

	// sets a new radius for this circle
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
}
