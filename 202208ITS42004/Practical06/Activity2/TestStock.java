package Practical06.Activity2;

import java.util.Scanner;

public class TestStock {
	public static void main(String[] args) {
		Stock s1 = new Stock("ORCL", "Oracle Corporation");
		s1.previousClosingPrice = 34.5;
		s1.currentPrice = 34.35;

		System.out.println("STOCK 1");
		System.out.println("Symbol: " + s1.symbol);
		System.out.println("Name: " + s1.name);
		System.out.println("Previous Closing Price: " + s1.previousClosingPrice);
		System.out.println("Current Closing Price: " + s1.currentPrice);
		System.out.println("Percentage Change: " + s1.getChangePercent() + "%");

		System.out.println("Number of stock objects (from s1): " + s1.numberOfObjects);

		// initialize s2 here
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter symbol >> ");
		String symbol = input.nextLine();
		System.out.print("Enter name >> ");
		String name = input.nextLine();
		System.out.print("Enter previous closing price >> $");
		double prevPrice = input.nextDouble();
		System.out.print("Enter current price >> $");
		double currentPrice = input.nextDouble();

		Stock s2 = new Stock(symbol, name);
		s2.previousClosingPrice = prevPrice;
		s2.currentPrice = currentPrice;

		System.out.println("STOCK 2");
		System.out.println("Symbol: " + s2.symbol);
		System.out.println("Name: " + s2.name);
		System.out.println("Previous Closing Price: " + s2.previousClosingPrice);
		System.out.println("Current Closing Price: " + s2.currentPrice);
		System.out.println("Percentage Change: " + s2.getChangePercent() + "%");

		System.out.println("Number of stock objects (from s1): " + s1.numberOfObjects);
		System.out.println("Number of stock objects (from s2): " + s2.numberOfObjects);
	}
}
