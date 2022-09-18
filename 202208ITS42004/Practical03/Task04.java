package Practical03;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
		int userInteger = input.nextInt();

		if (userInteger < 0 || userInteger > 1000)
			System.out.println("Invalid integer!");
		else {
			int sumOfDigits = 0;

			// 7 2 3
			// 7 2
			// 7
			// 0 -> break from loop

			while (userInteger > 0) {
				sumOfDigits += userInteger % 10;
				userInteger /= 10;
			}

			System.out.println("Sum of digits: " + sumOfDigits);
		}
	}
}
