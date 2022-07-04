package Lecture10;

public class TestCircleWithException {
	private static double radius;

	// set a new radius
	// throws IllegalArgumentException -> declares the fact that this method MAY be problematic and throw an exception
	public static void setRadius(double newRadius) throws IllegalArgumentException {
		if (newRadius >= 0)
			radius = newRadius;
		else {
//			System.out.println("Radius cannot be negative");
			throw new IllegalArgumentException("Radius cannot be negative!");
		}
	}

	public static void main(String[] args) {
		try {
			setRadius(1);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
//			System.out.println(ex.toString());  // prints out Exception class and object's message
//			ex.printStackTrace();   // prints out the source from which the Exception spawned
//			System.out.println(Arrays.toString(ex.getStackTrace()));
		} finally {
			// will always run this stuff here regardless of if an exception was caught
			System.out.println("Ending program");
		}
	}
}
