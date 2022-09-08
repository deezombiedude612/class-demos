package Practical01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertToUSD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double MYR_TO_USD = 0.22;

		System.out.print("Enter amount in MYR >> ");
		double myr = input.nextDouble();

		double usd = myr * MYR_TO_USD;

//		System.out.printf("RM%.2f is equivalent to USD%.2f\n", myr, usd);
//		System.out.println("RM%.2f is equivalent to USD%.2f".formatted(myr, usd));

		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("RM" + df.format(myr) + " is equivalent to USD" + df.format(usd));
	}
}
