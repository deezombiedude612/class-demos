package Practical03;

import java.util.Scanner;

public class Task03E {
	public static void main(String[] args) {
		// 4-digit palindromes
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a four-digit integer >> ");
		int userInteger = input.nextInt();

		// Invert negative integers to positive
		if (userInteger < 0) userInteger *= -1;

		if (userInteger < 1000 || userInteger > 9999)
			System.out.println("Invalid number!");
		else if (userInteger % 10 == userInteger / 1000 && userInteger % 100 / 10 == userInteger / 100 % 10)
			System.out.println(userInteger + " is a palindrome.");
		else
			System.out.println(userInteger + " is not a palindrome.");

		/*
		 * NOTE:
		 * (userInteger % 10) obtains the last digit
		 * (userInteger / 1000) obtains the first digit
		 *
		 * (userInteger % 100 / 10) obtains second last digit by first removing beginning 2 digits, then the last one
		 * (userInteger / 100 % 10) obtains second digit by first removing last 2 digits, then the first one
		 *
		 * Compare the last digit with the first digit, and the middle two digits with each other.
		 */
	}
}
