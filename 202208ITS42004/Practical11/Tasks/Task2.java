package Practical11.Tasks;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int[] numbers = new int[100];   // declare array of 100 integers

		// populate array with randomized numbers
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);   // numbers between 0 to 99
		}

		System.out.println("Array now: " + Arrays.toString(numbers));

		Scanner input = new Scanner(System.in);

		while (true) {
			try {
				int index; // retrieve index in array to be accessed
				System.out.print("Enter an index: ");
				index = input.nextInt();

				if (index == -1)
					break;

				System.out.println("The element is " + numbers[index]);
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Index out of bounds");
				input.nextLine();
			} catch (InputMismatchException ex) {
				System.out.println("Insert integer values only!");
				input.nextLine();
			} catch (Exception ex) {    // optional, can be placed to safeguard for unanticipated exceptions
				System.out.println("A random exception occurred: " + ex);
				input.nextLine();
			}
		}

		System.out.println("End of program.");
	}
}
