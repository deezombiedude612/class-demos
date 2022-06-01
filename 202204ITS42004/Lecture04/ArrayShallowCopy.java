package Lecture04;

public class ArrayShallowCopy {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2;

		array2 = array1;    // array2 now points to the same array structure pointed by array1

		System.out.print("Array2 before: ");
		for (int element: array2) {
			System.out.print(element + " ");
		}
		System.out.println();
		// Array2 before: 1 2 3 4 5

		array1[0] = 6;  // replace first element in array1

		System.out.print("Array2 after: ");
		for (int element: array2) {
			System.out.print(element + " ");
		}
		System.out.println();
		// Array2 before: 6 2 3 4 5
	}
}
