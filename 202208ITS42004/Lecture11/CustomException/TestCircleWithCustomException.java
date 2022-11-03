package Lecture11.CustomException;

public class TestCircleWithCustomException {
	public static void main(String[] args) {
		try {
			new CircleWithCustomException(5);
			new CircleWithCustomException(-5);
			new CircleWithCustomException(0);
		} catch (InvalidRadiusException ex) {
			System.out.println(ex);
		}

		System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());
	}

}
class CircleWithCustomException {
	private double radius;              // The radius of the circle
	private static int numberOfObjects; // The number of objects created

	// Construct a circle with radius 1
	public CircleWithCustomException() throws InvalidRadiusException {
		this(1.0);
	}

	// Construct a circle with a specified radius
	public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
		setRadius(radius);
		numberOfObjects++;
	}

	public double getRadius() { return radius; }
	public void setRadius(double newRadius) throws InvalidRadiusException {
		if (newRadius >= 0)
			radius = newRadius;
		else
			throw new InvalidRadiusException(newRadius);
	}

	public static int getNumberOfObjects() { return numberOfObjects; }

	public double findArea() { return radius * radius * Math.PI; }
}
