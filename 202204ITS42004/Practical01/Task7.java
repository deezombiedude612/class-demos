package Practical01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double MYR_TO_USD = 0.23;

		System.out.print("Enter amount in MYR >> ");
		double myr = input.nextDouble();

		DecimalFormat df = new DecimalFormat("#.00");
		double usd = myr * MYR_TO_USD;
		System.out.println("RM" + df.format(myr) + " is equivalent to USD" + df.format(usd));
	}
}
