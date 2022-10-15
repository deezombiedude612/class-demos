package Practical07.Task03;

import java.util.Scanner;

public class TestQuadraticEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		QuadraticEquation qe1 = new QuadraticEquation(a, b, c);
		if (qe1.getDiscriminant() > 0)
			System.out.println("The equation has two roots " + qe1.getRoot1() + " and " + qe1.getRoot2());
		else if (qe1.getDiscriminant() == 0)
			System.out.println("The equation has one root " + qe1.getRoot1());
		else
			System.out.println("The equation has no real roots");
	}
}
