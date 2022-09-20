package Lecture04;

public class ArrayDeepCopy {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = new int[array1.length];

		// make a deep copy of array1 into array2
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
		}

		System.out.print("array1 before: ");
		for (int element: array1) System.out.print(element + " ");
		System.out.print("\narray2 before: ");
		for (int element: array2) System.out.print(element + " ");

		array1[0] = 6;

		System.out.print("\n\narray1 after: ");
		for (int element: array1) System.out.print(element + " ");
		System.out.print("\narray2 after: ");
		for (int element: array2) System.out.print(element + " ");
	}
}
