package Lecture04;

import java.util.Scanner;

public class ArrayExample1 {
	public static void main(String[] args) {
		// Declare and initialize array
		int[] values = new int[10];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < values.length; i++) {
			System.out.print("Enter number >> ");
			int number = input.nextInt();
			values[i] = number;     // store input value in array element
		}

		for (int i = 0; i < values.length; i++)
			System.out.print(values[i] + " ");  // print out array element values

		System.out.println();
	}
}
