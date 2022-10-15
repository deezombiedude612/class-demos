package Practical07.ChallengeTask02;

import java.util.Scanner;

public class Bakery {
	private final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numCakes = -1;
		do {
			System.out.print("Enter how many types of cake you would like to order >> ");
			if (input.hasNextInt()) {
				numCakes = input.nextInt();
			} else {
				System.out.println("Invalid input, try again...");
				input.nextLine();
				continue;
			}

			if (numCakes < 0) System.out.println("Invalid number range, non-negative integers only..");
		} while (numCakes < 0);

		System.out.println();
		printMenu();

//		Cake[] cakes = getCakeItems(numCakes);
//		printOrderDetails(cakes);
		printOrderDetails(getCakeItems(numCakes));
	}

	private static void printMenu() {
		System.out.println("Flavors");
		System.out.println("\t1. Chocolate Moist");
		System.out.println("\t2. Strawberry");
		System.out.println("\t3. Blueberry");
		System.out.println("\t4. Cheesy Cake");
		System.out.println("\t5. American Chocolate");

		System.out.println("\nPrice List");
		System.out.println("\t(1)kg = RM25.50");
		System.out.println("\t(2)kg = RM50.00");
		System.out.println("\t(3)kg = RM75.00");
	}

	private static Cake[] getCakeItems(int numCakes) {
		Cake[] cakes = new Cake[numCakes];

		for (int i = 0; i < numCakes; i++) {
			System.out.println("\nBakery Item " + (i + 1));
			System.out.println("-------------");

			int cakeFlavorKey, cakeWeight, cakeQuantity;
			do {
				System.out.print("Enter your choice of cake flavor (1 - 5) >> ");
				cakeFlavorKey = input.nextInt();

				if (cakeFlavorKey < 1 || cakeFlavorKey > 5)
					System.out.println("Invalid cake flavor! Try again..");
			} while (cakeFlavorKey < 1 || cakeFlavorKey > 5);

			do {
				System.out.print("Enter the weight of cake (1 - 1kg, 2 - 2kg and 3 - 3kg) >> ");
				cakeWeight = input.nextInt();

				if (!(cakeWeight >= 1 && cakeWeight <= 3))
					System.out.println("Invalid cake weight! Try again..");
			} while (!(cakeWeight >= 1 && cakeWeight <= 3));

			do {
				System.out.print("Enter quantity ordered >> ");
				cakeQuantity = input.nextInt();

				if (cakeQuantity < 1)
					System.out.println("Invalid quantity! Try again..");
			} while (cakeQuantity < 1);

			cakes[i] = new Cake(cakeFlavorKey, cakeWeight, cakeQuantity);
		}

		return cakes;
	}

	private static void printOrderDetails(Cake[] cakes) {
		System.out.println("\nOrder Details");
		System.out.println("---------------");

		System.out.println("No  Cake Flavor       Weight    Unit Price (RM)   Quantity   Total Price (RM)");
		System.out.println("--  --------------   --------   ---------------   --------   ----------------");

		double grandTotal = 0;
		for (int i = 0; i < cakes.length; i++) {
			System.out.printf("%d\t%-15s%7d%18.2f%11d%20.2f\n",
					(i + 1), cakes[i].getFlavor(), cakes[i].getWeight(),
					cakes[i].getCakePrice(), cakes[i].getQuantity(), cakes[i].getTotalPrice());
//			System.out.print((i + 1)
//					+ "\t" + cakes[i].getFlavor()
//					+ "\t\t" + cakes[i].getWeight() + "kg"
//					+ "\t\t\t\t" + cakes[i].getCakePrice()
//					+ "\t\t\t\t" + cakes[i].getQuantity()
//					+ "\t\t\t\t" + cakes[i].getTotalPrice()
//			);
			grandTotal += cakes[i].getTotalPrice();
		}

		System.out.println("-----------------------------------------------------------------------------");
		System.out.printf("%63s%12.2f\n", "Grand Total:", grandTotal);
	}
}
