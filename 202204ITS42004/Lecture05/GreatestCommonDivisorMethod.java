package Lecture05;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter 2 integers
		System.out.print("Enter first integer: ");
		int num1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = input.nextInt();

		System.out.println("The greatest common divisor for "
				+ num1 + " and " + num2 + " is " + gcd(num1, num2));
	}

	public static int gcd(int n1, int n2) {
		int gcd = 1;    // Initial gcd is 1
		int k = 1;      // Possible gcd

		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
			k++;
		}

		return gcd;
	}
}
