package Lecture10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuotientWithException {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Prompt the user to enter two integers
			// InputMismatchException can be thrown from here
			System.out.print("Enter two integers >> ");
			int number1 = input.nextInt();
			int number2 = input.nextInt();

			// this line may throw an ArithmeticException
			System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
		} catch (ArithmeticException ex) {
			System.out.println("Exception: an integer cannot be divided by zero");
		} catch (InputMismatchException ex) {
			System.out.println("Exception: you should only enter in integers");
		} catch (Exception ex) {    // always put the most general type of Exception last
			System.out.println(ex.getClass());
		}

		System.out.println("Execution continues..");
	}
}
