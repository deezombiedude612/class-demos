package Practical05;

import java.util.ArrayList;

public class PrimeNumber {
	/**
	 * Checks whether number is private
	 * @param number: Number to be tested
	 * @return false (if number is not prime) or true (if number is prime)
	 *
	 * divisor variable is the one used to divide number to see if any remainder is obtained
	 * Remember: If no remainder comes out of the division (i.e., remainder == 0), number is not prime.
	 */
	public static boolean isPrime(int number) {
		if (number < 2) // numbers 1 and below are not prime
			return false;

		for (int divisor = 2; divisor <= number / 2; divisor++) {
			// NOTE: return statements can be used anywhere in the method, not just at the end
			if (number % divisor == 0)  // if true, number is not prime
				return false;           // number is not prime
		}

		return true;    // number is prime
	}

	/**
	 * Retrieves divisors (i.e., factors) that divide "number"
	 * @param number: Number to be tested
	 */
	public static void getDivisible(int number) {
		System.out.print("Numbers divisible by " + number + ": ");

		// Note: Logic is similar to the prime method
		// However, we check all numbers rather than half of them
		for (int divisor = 1; divisor <= number; divisor++) {
			if (number % divisor == 0)  // if true, print out divisor
				System.out.print(divisor + " ");
		}
		System.out.println();
	}

	/**
	 * Retrieves an ArrayList of divisors (i.e., factors) that divide "number"
	 * @param number: Number to be tested
	 * @return factors: ArrayList of factors
	 */
	public static ArrayList<Integer> getDivisibleList(int number) {
		ArrayList<Integer> factors = new ArrayList<>(); // ArrayList to store numbers

		for (int divisor = 1; divisor <= number; divisor++) {
			if (number % divisor == 0)  // if true, add divisor into ArrayList
				factors.add(divisor);
		}

		return factors;
	}

	/**
	 * Retrieves prime numbers between the start and end limits
	 * @param start: starting boundary of which numbers to check
	 * @param end: ending boundary of which numbers to check
	 *
	 * Note: Solution can be adapted from Practical 3 Task 04
	 */
	public static void getPrimeNumbers(int start, int end) {
		System.out.print("Prime numbers between " + start + " and " + end + ": ");

		// iterate between the start and the end limits
		for (int number = start; number <= end; number++) {
			// use isPrime() method to check if number is prime
			if (isPrime(number))
				System.out.print(number + " ");
		}
		System.out.println();
	}

	/**
	 * Retrieves an ArrayList of prime numbers between the start and end limits
	 * @param start: starting boundary of which numbers to check
	 * @param end: ending boundary of which numbers to check
	 * @return primeNumbers: ArrayList of prime numbers found
	 */
	public static ArrayList<Integer> getListOfPrimeNumbers(int start, int end) {
		ArrayList<Integer> primeNumbers = new ArrayList<>();

		// iterate between the start and the end limits
		for (int number = start; number <= end; number++) {
			// use isPrime() method to check if number is prime
			if (isPrime(number))
				primeNumbers.add(number);
		}

		return primeNumbers;
	}

	// Main method is used to test the methods created
	public static void main(String[] args) {
		int testNumber = 5;

		System.out.println("Is " + testNumber + " prime? " + isPrime(testNumber));
		getDivisible(testNumber);
		getPrimeNumbers(1, 100);
	}
}
