package Practical01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter width >> ");
		double width = input.nextDouble();

		System.out.print("Enter height >> ");
		double height = input.nextDouble();

		double area = width * height;

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("The area of the rectangle with width " + width + " and height " + height
				+ " is " + df.format(area));
	}
}
