package Practical01;

import java.util.Scanner;

public class PoundsToKilograms {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in lbs >> ");
		double pounds = input.nextDouble();

		final double POUNDS_TO_KILOGRAMS = 0.454;
		double kilograms = pounds * POUNDS_TO_KILOGRAMS;

		System.out.println("The weight in kilograms is " + kilograms);
	}
}
