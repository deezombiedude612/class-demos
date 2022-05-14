package Practical02;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Previous Month Reading: ");
		int previousReading = input.nextInt();
		System.out.print("Enter Current Month Reading: ");
		int currentMonthReading = input.nextInt();

		int consumedUnits = currentMonthReading - previousReading;
		System.out.println("Total Units Consumed: " + consumedUnits);

		double totalBill;
		if (consumedUnits <= 50)
			totalBill = consumedUnits * 1.15;
		else if (consumedUnits <= 100)
			totalBill = 50 * 1.15 + (consumedUnits - 50) * 2.60;
		else if (consumedUnits <= 150)
			totalBill = 50 * 1.15 + 50 * 2.60 + (consumedUnits - 100) * 3.55;
		else if (consumedUnits <= 200)
			totalBill = 50 * 1.15 + 50 * 2.60 + 50 * 3.55 + (consumedUnits - 150) * 4.50;
		else if (consumedUnits <= 300)
			totalBill = 50 * 1.15 + 50 * 2.60 + 50 * 3.55 + 50 * 4.50 + (consumedUnits - 200) * 5.90;
		else if (consumedUnits <= 400)
			totalBill = 50 * 1.15 + 50 * 2.60 + 50 * 3.55 + 50 * 4.50 + 100 * 5.90 + (consumedUnits - 300) * 6.90;
		else if (consumedUnits <= 500)
			totalBill = 50 * 1.15 + 50 * 2.60 + 50 * 3.55 + 50 * 4.50 + 100 * 5.90 + 100 * 6.90 + (consumedUnits - 400) * 7.90;
		else if (consumedUnits <= 1000)
			totalBill = 50 * 1.15 + 50 * 2.60 + 50 * 3.55 + 50 * 4.50 + 100 * 5.90 + 100 * 6.90 + 100 * 7.90 + (consumedUnits - 500) * 8.90;
		else
			totalBill = 50 * 1.15 + 50 * 2.60 + 50 * 3.55 + 50 * 4.50 + 100 * 5.90 + 100 * 6.90 + 100 * 7.90 + 500 * 8.90 + (consumedUnits - 1000) * 10.99;

		System.out.printf("Total Bill: $%.2f\n", totalBill);
	}
}
