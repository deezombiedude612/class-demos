package Lecture04;

public class ArrayExample1M {
	public static void main(String[] args) {
		// declare and initialize array
		int[] values = new int[10];

//		Scanner input = new Scanner(System.in);

		for (int i = 0; i < values.length; i++) {
//			System.out.print("Enter number >> ");
//			int number = input.nextInt();
//			values[i] = number; // store input value in array element
			double randomDouble = Math.random() * 100;  // generates double values 0 to 99.
			values[i] = (int) randomDouble;
		}

		int sum = 0;
		int largestValue = values[0];  // assume the largest number is the first array value for now

		// print out array element values
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");  // prints out array element values
			sum += values[i];   // add value to sum

			// check if any of the subsequent values are larger
			if (values[i] > largestValue) {
				largestValue = values[i];
			}
		}
		System.out.println("\nSum: " + sum);
		System.out.println("Largest Value in Array: " + largestValue);
	}
}
