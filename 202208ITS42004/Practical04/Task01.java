package Practical04;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ARRAY_SIZE = 10;

		int[] integers = new int[ARRAY_SIZE];
		System.out.println("Enter 10 integers (separated by spaces): ");
		for (int i = 0; i < ARRAY_SIZE; i++)
			integers[i] = input.nextInt();

		// sum all negative integers and positive integers separately
		int negativeSum = 0, positiveSum = 0;

		for (int i = 0; i < ARRAY_SIZE; i++) {
			if (integers[i] < 0)    // if negative, add to negativeSum
				negativeSum += integers[i];
			else                    // if positive, add to positiveSum (0 is inconsequential either way)
				positiveSum += integers[i];
		}

		System.out.println("Sum of all negative integers: " + negativeSum);
		System.out.println("Sum of all positive integers: " + positiveSum);
	}
}
