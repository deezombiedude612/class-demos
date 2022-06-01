package Lecture04;

public class ArrayExample1_Modified {
	public static void main(String[] args) {
		// Declare and initialize array
		int[] values = new int[10];

		for (int i = 0; i < values.length; i++)
			values[i] = (int) (Math.random() * 100);    // random value between 0 and 99 is chosen and put into array

		int sum = 0;
		int largestValue = values[0];   // assume the largest number is the first array value for now
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");  // print out array element values
			sum += values[i];   // add value to sum

			// check if any of the subsequent values are larger
			if (values[i] > largestValue)
				largestValue = values[i];
		}

		System.out.println();
		System.out.println("Sum of numbers: " + sum);
		System.out.println("Largest value in array: " + largestValue);
	}
}
