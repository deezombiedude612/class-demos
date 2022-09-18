package Practical03;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		for (int iter = 1; iter <= 5; iter++) {
			System.out.print("Farenheit Temperature #" + iter + ": ");
			double farenheit = input.nextDouble();

			double celcius = (farenheit - 32) * 5 / 9;
			System.out.printf("%.2f degrees Farenheit is %.2f degrees Celcius.\n\n", farenheit, celcius);
		}
	}
}
