package Practical02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task04 {
	private static DecimalFormat df2 = new DecimalFormat("#.00");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int filingStatus = 0;
		
		do {
			// Selection menu for filing status
			System.out.println("1. Single");
			System.out.println("2. Married Filing Jointly or Qualifying Widow(er)");
			System.out.println("3. Married Filing Separately");
			System.out.println("4. Head of Household");

			System.out.print("Enter filing status option (1 - 4) >> ");
			filingStatus = input.nextInt();
		} while (filingStatus < 1 || filingStatus > 4);

		// Get Taxable Income
		System.out.print("Enter taxable income >> $");
		double personalIncome = input.nextDouble();

		int taxRate = 0;    // stored in percent
		switch (filingStatus) {
			// Single
			case 1 -> {
				if (personalIncome <= 8350) taxRate = 10;
				else if (personalIncome <= 33950) taxRate = 15;
				else if (personalIncome <= 82250) taxRate = 25;
				else if (personalIncome <= 171550) taxRate = 28;
				else if (personalIncome <= 372950) taxRate = 33;
				else taxRate = 35;
			}

			// Married Filing Jointly or Qualifying Widow(er)
			case 2 -> {
				if (personalIncome <= 16700) taxRate = 10;
				else if (personalIncome <= 67900) taxRate = 15;
				else if (personalIncome <= 137050) taxRate = 25;
				else if (personalIncome <= 208850) taxRate = 28;
				else if (personalIncome <= 372950) taxRate = 33;
				else taxRate = 35;
			}

			// Married Filing Separately
			case 3 -> {
				if (personalIncome <= 8350) taxRate = 10;
				else if (personalIncome <= 33950) taxRate = 15;
				else if (personalIncome <= 68525) taxRate = 25;
				else if (personalIncome <= 104425) taxRate = 28;
				else if (personalIncome <= 186475) taxRate = 33;
				else taxRate = 35;
			}

			// Head of Household
			case 4 -> {
				if (personalIncome <= 11950) taxRate = 10;
				else if (personalIncome <= 45500) taxRate = 15;
				else if (personalIncome <= 117450) taxRate = 25;
				else if (personalIncome <= 190200) taxRate = 28;
				else if (personalIncome <= 372950) taxRate = 33;
				else taxRate = 35;
			}
		}

		if (personalIncome < 0)
			System.out.println("Taxable income cannot be negative!");
		else {
			System.out.println("Tax rate is " + taxRate + "%");
			double taxableIncome = personalIncome * ((double) taxRate / 100);
			System.out.println("Tax payment due is $" + df2.format(taxableIncome));
		}
	}
}
