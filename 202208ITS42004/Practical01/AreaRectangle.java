package Practical01;

import java.util.Scanner;

public class AreaRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter width >> ");
		double width = input.nextDouble();

		System.out.print("Enter length >> ");
		double length = input.nextDouble();

		// Compute area
		double area = width * length;

		System.out.println("Area of rectangle with width " + width + " and length " + length + " is " + area + " sq. units.");
	}
}
