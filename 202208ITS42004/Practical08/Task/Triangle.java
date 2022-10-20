package Practical08.Task;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	public Triangle(double newSide1, double newSide2, double newSide3) {
		side1 = newSide1;
		side2 = newSide2;
		side3 = newSide3;
	}

	// Get methods
	public double getSide1() { return side1; }
	public double getSide2() { return side2; }
	public double getSide3() { return side3; }

	// Set methods
	public void setSide1(double newSide1) {
		if (newSide1 > 0)
			this.side1 = newSide1;
	}

	public void setSide2(double newSide2) {
		if (newSide2 > 0)
			this.side2 = newSide2;
	}

	public void setSide3(double newSide3) {
		if (newSide3 > 0)
			this.side3 = newSide3;
	}

	// following Heron's formula
	public double getArea() {
		// s refers to semi-perimeter
		double s = getPerimeter() / 2;

		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
