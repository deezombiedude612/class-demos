package Practical05;

import java.util.Scanner;

public class Task02 {
	public static Scanner input = new Scanner(System.in);

	public static int measurementChoice() {
		int choice = 0;

		do {
			System.out.println("1. Feet to Meters");
			System.out.println("2. Meters to Feet");

			System.out.print("Enter choice >> ");
			choice = input.nextInt();

			if (choice != 1 && choice != 2)
				System.out.println("Invalid choice! Try again..");
		} while (choice != 1 && choice != 2);

		return choice;
	}

	public static double feetToMeters(double feet) {
		return (0.305 * feet);
	}

	public static double metersToFeet(double meters) {
		return (3.279 * meters);
	}

	public static void main(String[] args) {
		int choice = measurementChoice();

		switch (choice) {
			// feet to meters
			case 1 -> {
				System.out.print("Enter measurement in feet >> ");
				double feet = input.nextDouble();

				System.out.println("Measurement in meters is " + feetToMeters(feet));
			}

			// meters to feet
			case 2 -> {
				System.out.print("Enter measurement in meters >> ");
				double meters = input.nextDouble();

				System.out.println("Measurement in feet is " + metersToFeet(meters));
			}

			default -> { }
		}
	}
}
