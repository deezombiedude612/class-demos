package Practical10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;

		System.out.print("Enter two integers: ");

		boolean numsEntered = false;    // will turn true if both num1 and num2 have been successfully retrieved
//		while (true) {
		while (!numsEntered) {
			try {
				num1 = input.nextInt();
				num2 = input.nextInt();

//				break;  // if num1 and num2 have been entered successfully

				int product = num1 * num2;
				System.out.println("Multiplication is " + product);

				numsEntered = true;
			} catch (InputMismatchException ex) {
				System.out.print("Incorrect input! Re-enter two integers: ");
				input.nextLine();   // clear the Scanner object from all erroneous input
			}
		}
	}
}
