package Practical02;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Random random = new Random();
//		int randomValue = random.nextInt(90);   // generates 0 to 89
		int randomValue = random.nextInt(90) + 10;  // generates 10 to 99
		System.out.println("Generated value: " + randomValue);  // use this for testing only, ideally this should not be printed

		// obtain integer with swapped digits
		int swappedValue = (randomValue % 10) * 10 + (randomValue / 10);

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number (10 - 99) >> ");
		int userInput = input.nextInt();

		int prizeMoney = 0;

		// check for integer values of incorrect range first
		if (userInput < 10 || userInput > 99) {
			System.out.println("Invalid input range.");
			System.exit(0);
		} else if (userInput == randomValue) prizeMoney = 10000;    // exact integer guessed
		else if (userInput == swappedValue) prizeMoney = 3000;      // integer guessed had swapped digits
		// userInput's first digit is inside randomValue
		else if (userInput / 10 == randomValue / 10 || userInput / 10 == randomValue % 10) prizeMoney = 1000;
		// userInput's last digit is inside randomValue
		else if (userInput % 10 == randomValue / 10 || userInput % 10 == randomValue % 10) prizeMoney = 1000;

		if (prizeMoney > 0) System.out.println("Congratulations, you earned $" + prizeMoney);
		else System.out.println("Sorry, no reward this time!");
	}
}
