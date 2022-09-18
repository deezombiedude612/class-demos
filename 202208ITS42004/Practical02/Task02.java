package Practical02;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year >> ");
		int year = input.nextInt();

		// year is a scalar metric, should not be negative
		if (year < 0) System.out.println("Invalid year!");
		else {
			switch (year % 12) {
				case 0 -> System.out.println("Monkey");
				case 1 -> System.out.println("Rooster");
				case 2 -> System.out.println("Dog");
				case 3 -> System.out.println("Pig");
				case 4 -> System.out.println("Rat");
				case 5 -> System.out.println("Ox");
				case 6 -> System.out.println("Tiger");
				case 7 -> System.out.println("Rabbit");
				case 8 -> System.out.println("Dragon");
				case 9 -> System.out.println("Snake");
				case 10 -> System.out.println("Horse");
				case 11 -> System.out.println("Sheep");
				default -> { }
			}
		}
	}
}
