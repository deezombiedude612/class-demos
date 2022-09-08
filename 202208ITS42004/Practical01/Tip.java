package Practical01;

import java.util.Scanner;

public class Tip {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter subtotal >> $");
		double subtotal = input.nextDouble();
		System.out.print("Enter gratuity rate (in %) >> ");
		int gratuityRate = input.nextInt();

		double gratuity = subtotal * gratuityRate / 100;
		double total = subtotal + gratuity;

		System.out.printf("Gratuity: $%.2f\n", gratuity);
		System.out.printf("Total: $%.2f\n", total);
	}
}
