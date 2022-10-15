package Practical06.Task01;

public class TestHousehold {
	public static void main(String[] args) {
		Household h1 = new Household();

		System.out.println("Household 1");
		System.out.println("***********");
		System.out.println("Number of occupants: " + h1.numberOfOccupants);
		System.out.printf("Annual income: $%.2f\n", h1.annualIncome);

		h1.numberOfOccupants = 6;
		h1.annualIncome = 25000;

		System.out.println("\nValues have been modified");
		System.out.println("Number of occupants: " + h1.numberOfOccupants);
		System.out.printf("Annual income: $%.2f\n", h1.annualIncome);
		System.out.printf("Average income: $%.2f\n", h1.calcAverageIncome());

		Household h2 = new Household(3);

		System.out.println("\nHousehold 2");
		System.out.println("***********");
		System.out.println("Number of occupants: " + h2.numberOfOccupants);
		System.out.printf("Annual income: $%.2f\n", h2.annualIncome);
		System.out.printf("Average income: $%.2f\n", h2.calcAverageIncome());

		Household h3 = new Household(8, 10000);

		System.out.println("\nHousehold 3");
		System.out.println("***********");
		System.out.println("Number of occupants: " + h3.numberOfOccupants);
		System.out.printf("Annual income: $%.2f\n", h3.annualIncome);
		System.out.printf("Average income: $%.2f\n", h3.calcAverageIncome());
	}
}
