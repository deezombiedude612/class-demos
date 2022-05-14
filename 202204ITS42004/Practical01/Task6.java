package Practical01;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double POUND_TO_KILOGRAMS = 0.454;    // 1lb = 0.454kg

		System.out.print("Enter weight in lbs >> ");
		double pounds = input.nextDouble();

		double kilograms = pounds * POUND_TO_KILOGRAMS;
		System.out.println("The weight in kilograms is " + kilograms);
	}
}
