package Lecture04;

public class ArrayExample1F {
	public static void main(String[] args) {
		// declare and initialize array
//		int[] values = new int[10];
		int[] values = new int[10];


//		for (int i = 0; i < values.length; i++) {
//			double randomDouble = Math.random() * 100;  // generates double values 0 to 99.
//			values[i] = (int) randomDouble;
//		}

		int sum = 0;

		// print out array element values
//		for (int i = 0; i < values.length; i++) {
//			System.out.print(values[i] + " ");  // prints out array element values
//			sum += values[i];   // add value to sum
//		}

		for (int el: values) {
			System.out.print(el + " "); // prints out array element values
			sum += el;
		}
		System.out.println("\nSum: " + sum);
	}
}
