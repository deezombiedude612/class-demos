package Practical01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();

//		// Compute area
//		double area = radius * radius * 3.14159;
		double circumference = 2 * Math.PI * radius;

		DecimalFormat df = new DecimalFormat("#.##");

		// Display results
//		System.out.println("The area for the circle of radius " + radius + " is " + area);
//		System.out.printf("The circumference for the circle of radius %.2f is %.2f", radius, circumference);
		System.out.println("The circumference for the circle of radius " + df.format(radius)
				+ " is " + df.format(circumference));
	}
}
