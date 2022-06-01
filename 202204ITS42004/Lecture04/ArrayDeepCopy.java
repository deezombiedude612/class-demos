package Lecture04;

public class ArrayDeepCopy {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = new int[array1.length];

		/*
		* NOTE:
		* The size of the array can only be set once and cannot be altered.
		* The array size must also be initialized first before it can hold
		* any values.
		*/

		// make a deep copy of array1 into array2
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
		}
		System.out.println("Array1 before:");
		for (int element: array1) System.out.print(element + " ");
		System.out.println("\nArray2 before:");
		for (int element: array2) System.out.print(element + " ");
		// Array1 before: 1 2 3 4 5
		// Array2 before: 1 2 3 4 5

		array1[0] = 6;  // replace first element in array1

		System.out.println("\n\nArray1 before:");
		for (int element: array1) System.out.print(element + " ");
		System.out.println("\nArray2 before:");
		for (int element: array2) System.out.print(element + " ");
		// Array1 before: 6 2 3 4 5
		// Array2 before: 1 2 3 4 5
	}
}
