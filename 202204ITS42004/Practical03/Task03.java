package Practical03;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a three-digit integer >> ");
		int userInteger = input.nextInt();

		// Invert negative integers to positive
		if (userInteger < 0) userInteger *= -1;

		if (userInteger < 100 || userInteger > 999)
			System.out.println("Invalid number!");
		else if (userInteger % 100 == userInteger / 100)
			System.out.println(userInteger + " is a palindrome.");
		else
			System.out.println(userInteger + " is not a palindrome.");
	}
}
