package Practical02;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight (in kg) >> ");
		double kilograms = input.nextDouble();

		System.out.print("Enter height (in m) >> ");
		double meters = input.nextDouble();

//		double bmi = kilograms / (meters * meters);
		double bmi = kilograms / Math.pow(meters, 2);

		System.out.println("BMI: " + bmi);

		if (bmi < 18.5) System.out.println("Underweight");
		else if (bmi >= 18.5 && bmi < 25.0) System.out.println("Normal");
		else if (bmi >= 25.0 && bmi < 30.0) System.out.println("Overweight");
		else if (bmi >= 30.0) System.out.println("Obese");
	}
}
