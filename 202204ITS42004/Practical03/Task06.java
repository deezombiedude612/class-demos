package Practical03;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int option; // operator selection

		do {
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.print("Enter option (1 - 5) >> ");
			option = input.nextInt();

			if (option < 1 || option > 5)
				System.out.println("Invalid option! Try again.\n");
		} while (option < 1 || option > 5);

		System.out.print("Enter integer #1 >> ");
		int integer1 = input.nextInt();
		System.out.print("Enter integer #2 >> ");
		int integer2 = input.nextInt();

		switch (option) {
			case 1 -> System.out.println(integer1 + " + " + integer2 + " = " + (integer1 + integer2));
			case 2 -> System.out.println(integer1 + " - " + integer2 + " = " + (integer1 - integer2));
			case 3 -> System.out.println(integer1 + " * " + integer2 + " = " + (integer1 * integer2));
			case 4 -> System.out.println(integer1 + " / " + integer2 + " = " + (integer1 / integer2));
			case 5 -> System.out.println(integer1 + " % " + integer2 + " = " + (integer1 % integer2));
			default -> { }
		}
	}
}
