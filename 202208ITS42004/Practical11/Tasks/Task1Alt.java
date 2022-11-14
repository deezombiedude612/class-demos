package Practical11.Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1Alt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;

		System.out.print("Enter two integers: ");

		// will turn true if both num1 and num2 have been successfully retrieved
		boolean numsEntered = false;
		while (!numsEntered) {
			try {
				num1 = input.nextInt();
				num2 = input.nextInt();

				// calculate the product here
				int product = num1 * num2;
				System.out.println("Multiplication is " + product);

				numsEntered = true;
			} catch (InputMismatchException ex) {
				System.out.print("Incorrect input! Re-enter two integers: ");
				input.nextLine();
			}
		}
	}
}
