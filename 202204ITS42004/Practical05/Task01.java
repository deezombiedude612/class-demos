package Practical05;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
	public static int mulDigit (int n) {
		int result = 1;

		// 234 (last digit is 4)
		// 234 / 10 = 23 (int, this will not result in 23.4)
		// 23 (last digit is 3)
		// 23 / 10 = 2 (int, this will not result in 2.3)
		// 2 (last digit is 2)
		// 2 / 10 = 0 (int, this will not result in 0.2)

		while (n > 0) {
			int digit = n % 10; // retrieve last digit
			result *= digit;    // multiply last digit to result
			n /= 10;    // remove last digit after being retrieved
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // required when getting user input

		System.out.print("Enter integer >> ");
		int userInteger = input.nextInt();

		System.out.println(mulDigit(userInteger));

		Random random = new Random();
		int generatedInteger = random.nextInt(9900) + 100;  // 10,000 - 100 = 9900
		System.out.println("Generated integer: " + generatedInteger);
		System.out.println(mulDigit(generatedInteger));
	}
}
