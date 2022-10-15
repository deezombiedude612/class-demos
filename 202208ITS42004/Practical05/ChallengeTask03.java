package Practical05;

import java.util.Scanner;

public class ChallengeTask03 {
	private final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		long creditCardNo = getCreditCardNo();

		System.out.println(creditCardNo + " is " + (isValid(creditCardNo) ? "valid" : "invalid"));
	}

	// Retrieve credit card number
	public static long getCreditCardNo() {
		long creditCardNo = 0;

		do {
			System.out.print("Enter credit card number as a long integer >> ");
			creditCardNo = input.nextLong();

			if (!isValidLength(creditCardNo))
				System.out.println("Invalid credit card number! Try again..");
		} while (!isValidLength(creditCardNo));

		return creditCardNo;
	}

	// Returns true if card is between 13 and 16 digits long
	public static boolean isValidLength(long number) {
		return ((int) (number / 1e13) > 0 && (int) (number / 1e16) == 0);
	}

	// Returns length of credit card number
	public static int getCardNumLength(long number) {
		return String.valueOf(number).length();
	}

	// Returns true if the card number is valid
	public static boolean isValid(long number) {
//		System.out.println("Sum of all even-placed single-digit numbers: " + sumOfDoubleEvenPlace(number));
//		System.out.println("Sum of all odd-placed digit numbers: " + sumOfOddPlace(number));

		int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

		return sum % 10 == 0;
	}

	// Get the result from Step 2
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		do {
			if (getCardNumLength(number) % 2 != 0) {
				int digit = (int) (number % 10);

//				int digitTwice = digit * 2;
//				System.out.println(digit + " -> " + digitTwice);
//
//				if (digitTwice >= 10) sum += (digitTwice / 10) + (digitTwice % 10);
//				else sum += digitTwice;

				sum += getDigit(digit * 2);
			}

			number /= 10;
		} while (number > 0);

		return sum;
	}

	// Return this number of it is a single digit, otherwise, return the sum of the two digits
	public static int getDigit(int number) {
		return (number >= 10) ? (number / 10) + (number % 10) : number;
	}

	// Return sum of odd-place digits in number
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		do {
			if (getCardNumLength(number) % 2 == 0) {
				sum += (int) (number % 10);
			}

			number /= 10;
		} while (number > 0);

		return sum;
	}

	/*
	 * STEPS:
	 * 1. Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up
	 *    the two digits to get a single-digit number.
	 * 2. Add all single-digit numbers from Step 1.
	 * 3. Add all digits in the odd places from right to left in the card number.
	 * 4. Sum the results from Step 2 and 3.
	 * 5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid.
	 */
}
