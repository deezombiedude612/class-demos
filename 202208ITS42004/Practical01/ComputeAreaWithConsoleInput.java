package Practical01;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();

//		// Compute area
//		double area = radius * radius * 3.14159;
//
//		// Display results
//		System.out.println("The area for the circle of radius " +
//				radius + " is " + area);

		// Compute circumference
//		double circumference = 2 * radius * 3.14159;
		double circumference = 2 * radius * Math.PI;

		// Display circumference results
//		System.out.println("The circumference for the circle of radius " + radius + " is " + circumference);
		System.out.printf("The circumference for the circle of radius %.2f is %.2f", radius, circumference);
	}
}
