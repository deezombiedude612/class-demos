package Practical11.Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;

		System.out.print("Enter two integers: ");

		while (true) {
			try {
				num1 = input.nextInt();
				num2 = input.nextInt();

				// calculate the product here
				int product = num1 * num2;
				System.out.println("Multiplication is " + product);

				break;
			} catch (InputMismatchException ex) {
				System.out.print("Incorrect input! Re-enter two integers: ");
				input.nextLine();
			}
		}
	}
}
