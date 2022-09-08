package Lecture02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();

		// Compute area
		double area = radius * radius * 3.14159;

		// Display results
//		System.out.println("The area for the circle of radius "
//				+ radius + " is " + area);
//		System.out.printf("The area for the circle of radius %f is %.2f\n", radius, area);

		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println("The area for the circle of radius "
				+ df.format(radius) + " is " + df.format(area));
	}
}
