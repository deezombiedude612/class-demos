package Practical05;

import java.util.Scanner;

public class Task03 {
	public static Scanner input = new Scanner(System.in);

	public static int measurementChoice() {
		int choice = 0;

		do {
			System.out.println("1. Pounds to Kilograms");
			System.out.println("2. Kilograms to Pounds");

			System.out.print("Enter choice >> ");
			choice = input.nextInt();

			if (choice != 1 && choice != 2)
				System.out.println("Invalid choice! Try again..");
		} while (choice != 1 && choice != 2);

		return choice;
	}

	public static double poundsToKilograms(double pounds) {
		return (0.453 * pounds);
	}

	public static double kilogramsToPounds(double kilograms) {
		return (2.204 * kilograms);
	}

	public static void main(String[] args) {
		int choice = measurementChoice();

		switch (choice) {
			// pounds to kilograms
			case 1 -> {
				System.out.print("Enter measurement in pounds >> ");
				double pounds = input.nextDouble();

				System.out.println("Measurement in kilograms is " + poundsToKilograms(pounds));
			}

			// kilograms to pounds
			case 2 -> {
				System.out.print("Enter measurement in kilograms >> ");
				double kilograms = input.nextDouble();

				System.out.println("Measurement in pounds is " + kilogramsToPounds(kilograms));
			}

			default -> { }
		}
	}
}
