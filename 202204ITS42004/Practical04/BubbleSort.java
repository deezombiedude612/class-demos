package Practical04;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("\nIteration #" + (i + 1) + ":");
			System.out.println(Arrays.toString(arr));

			for(int j = 0; j < arr.length - i - 1; j++) {
				// if arr[j] is more than its adjacent value, swap
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
	}

	public static void main(String[] args) {
		final int ARRAY_SIZE = 10;
		int arr[] = new int[ARRAY_SIZE];

		// populate array
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);   // Math.random() gives double, typecast it to int

			/**
			 * Extra Challenge: Generate numbers between -100 to 100
			 */
//			arr[i] = (int) (Math.random() * 100 * (int) Math.pow(-1, (int) (Math.random() * 2)));
		}
		System.out.println("Generated array: " + Arrays.toString(arr));

		// Sort array using Bubble sort
		bubbleSort(arr);

		System.out.println("\nSorted array: " + Arrays.toString(arr));
	}
}
