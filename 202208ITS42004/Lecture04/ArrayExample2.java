package Lecture04;

public class ArrayExample2 {
	public static void main(String[] args) {
		// declaring an array with values in a comma list
		int[] values = { 1, 2, 3, 4, 5 };
		int[] copyValues = values;

		System.out.println("Before modification, values[2]: " + values[2]);
		copyValues[2] = 10;
		System.out.println("After modification, values[2]: " + values[2]);
	}
}
