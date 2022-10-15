package Practical07.Activity1;

public class Rectangle {
	private double width;
	private double height;

	public Rectangle() {
		width = 1;
		height = 1;
	}

	public Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	// Accessor methods
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	// Mutator methods
	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Other methods
	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}
}
