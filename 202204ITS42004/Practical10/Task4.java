package Practical10;

import java.util.Scanner;

public class Task4 {
	/**
	 * Returns the larger of the two roots of
	 * the quadratic equation A*x*x + B*x + C = 0.
	 * (Throws an exception if A == 0 or B*B-4*A*C < 0.)
	 */
	public static double root(double A, double B, double C) throws IllegalArgumentException {
		if (A == 0) {
			throw new IllegalArgumentException("A can't be zero.");
		} else {
			double disc = B * B - 4 * A * C;

			if (disc < 0)
				throw new IllegalArgumentException("Discriminant < zero.");

			return (-B + Math.sqrt(disc)) / (2 * A);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Test cases:
		// x^2 - 3x - 4 = 0
		// x^2 - 3x + 4 = 0
		// 0x^2 + 4x + 4 = 0
		// 4x^2 - 16 = 0

		try {
			System.out.print("Enter value for A: ");
			double a = input.nextDouble();
			System.out.print("Enter value for B: ");
			double b = input.nextDouble();
			System.out.print("Enter value for C: ");
			double c = input.nextDouble();

			System.out.println("Root: " + root(a, b, c));
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
