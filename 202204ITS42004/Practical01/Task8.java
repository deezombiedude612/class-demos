package Practical01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter subtotal: ");
		double subtotal = input.nextDouble();
		System.out.print("Enter gratuity rate (in %): ");
		int gratuityRate = input.nextInt();

		double gratuity = subtotal * gratuityRate / 100;
		double total = subtotal + gratuity;

		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Gratuity: $" + df.format(gratuity));
		System.out.println("Total: $" + df.format(total));
	}
}
