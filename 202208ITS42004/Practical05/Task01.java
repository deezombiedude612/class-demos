package Practical05;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
	public static int mulDigit(int n) {
		int result = 1;

		while (n > 0) {
			int digit  = n % 10;    // retrieve last digit
			result *= digit;        // multiply last digit to result
			n /= 10;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer >> ");
		int userInteger = input.nextInt();

		System.out.println("Product of all digits in integer: " + mulDigit(userInteger));

		Random random = new Random();
		int generatedInteger = random.nextInt(9901) + 100;  // 10,000 - 100 + 1 = 9901
		System.out.println("Generated integer: " + generatedInteger);
		System.out.println("Product of all digits in generated integer: " + mulDigit(generatedInteger));
	}
}
