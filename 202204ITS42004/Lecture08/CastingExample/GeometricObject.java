package Lecture08.CastingExample;

// Lecture 7 Slide 11
public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	// Construct a default geometric object
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	// Construct a geometric object with the specified color and filled value
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() { return color; }  // return color
	// return filled; since filled is boolean, its getter method is named isFilled
	public boolean isFilled() { return filled; }
	public java.util.Date getDateCreated() { return dateCreated; }  // get dateCreated

	public void setColor(String color) { this.color = color; }  // set a new color
	public void setFilled(boolean filled) { this.filled = filled; } // set a new filled

	// Return a string representation of this object
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	protected double getDiagonal() {
		return 2;
	}

	// We can use the `final` keyword on the method declaration to prevent it from
	// being overridden by any subclass down the line
}
