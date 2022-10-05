package Lecture05;

public class TestMethodOverloading {
	public static void main(String[] args) {
		// Invoke the max method with 2 int parameters
		System.out.println("The maximum of 1 & 4 is " + max(1, 4));

		// Invoke the max method with 2 double parameters
		System.out.println("The maximum of 1.0 & 4.0 is " + max(1.0, 4.0));

		// Invoke the max method with 3 double parameters
		System.out.println("The maximum of 1.0, 4.0 & 5.0 is " + max(1.0, 4.0, 5.0));
	}

	// compares two integer values for the biggest one
	public static int max(int num1, int num2) {
		if (num1 > num2)
			return num1;

		return num2;
	}

	// compares two double values for the biggest one
	public static double max(double num1, double num2) {
		if (num1 > num2)
			return num1;

		return num2;
	}

	// compare three double values for the biggest one
	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}
}
