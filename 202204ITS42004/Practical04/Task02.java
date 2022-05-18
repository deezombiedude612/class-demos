package Practical04;

import java.util.Random;

public class Task02 {
	private final static int ARRAY_SIZE = 10;

	public static void main(String[] args) {
		int[] arr1 = new int[ARRAY_SIZE];
		int[] arr2 = new int[ARRAY_SIZE];

		for (int i = 0; i < ARRAY_SIZE; ++i) {
			// first array to contain numbers between 0 and 100
			arr1[i] = (new Random()).nextInt(100);

			// second array to contain numbers between -100 and 100
			arr2[i] = (new Random()).nextInt(200) - 100;
		}

		// print arrays for checking
		System.out.print("Array 1: [");
		for (int i = 0; i < ARRAY_SIZE; ++i) {
			System.out.print(arr1[i]);
			if (i < ARRAY_SIZE - 1)
				System.out.print(", ");
		}
		System.out.println("]");
		System.out.print("Array 2: [");
		for (int i = 0; i < ARRAY_SIZE; ++i) {
			System.out.print(arr2[i]);
			if (i < ARRAY_SIZE - 1)
				System.out.print(", ");
		}
		System.out.println("]");

		// find index of the smallest element in each array
		int smallestIndex1 = 0, smallestIndex2 = 0;
		for (int i = 1; i < ARRAY_SIZE; ++i) {
			if (arr1[i] < arr1[smallestIndex1])
				smallestIndex1 = i;

			if (arr2[i] < arr2[smallestIndex2])
				smallestIndex2 = i;
		}

		System.out.println("Smallest value in arr1 in index: " + smallestIndex1);
		System.out.println("Smallest value in arr2 in index: " + smallestIndex2);
	}
}
