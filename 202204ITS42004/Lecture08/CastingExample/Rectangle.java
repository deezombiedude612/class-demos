package Lecture08.CastingExample;

// from Lecture 7 Slide 12
public class Rectangle extends GeometricObject {
	private double width;
	private double height;

	public Rectangle() { }

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	public double getWidth() { return width; } // Return width
	public double getHeight() { return height; } // Return height

	public void setWidth(double width) { this.width = width; }  // set a new width
	public void setHeight(double height) { this.height = height; } // set a new height

	public double getArea() { return width * height; }
	public double getPerimeter() { return 2 * (width + height); }

	@Override
	public double getDiagonal() {
		return Math.sqrt((width * width) + (height * height));
	}
}
