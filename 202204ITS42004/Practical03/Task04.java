package Practical03;

/**
 * Write a program that displays the first 50 prime numbers in five lines, each of which contains 10 numbers.
 * An integer greater than 1 is prime if its only positive divisor is 1 or itself.
 * For example, 2, 3, 5 and 7 are prime numbers, but 4, 6, 8 and 9 are not.
 */

public class Task04 {
	public static void main(String[] args) {
		// index - count the number of printed prime numbers
		// num - testing number(s) starting from 2 to see if they are prime
		for (int num = 2, index = 0; index < 50; num++) {
			boolean isPrime = true;

			// check if num is prime
			for (int j = 2; j <= num / 2; j++) {
				// num should not be divisible by anything other than 1 and itself to be prime
				if (num % j == 0) {
					isPrime = false;
					break;
				}
			}

			// if number is prime, print number
			if (isPrime) {
				System.out.print(num + "\t");
				index++;

				// after 10 numbers have been printed in one line, add new line escape character
				if (index % 10 == 0)
					System.out.println();
			}
		}
	}
}
