package Practical06.Task01;

public class TestHousehold {
	public static void main(String[] args) {
		Household h1 = new Household();
		System.out.println("Household 1");
		System.out.println("***********");
		System.out.println("Number of occupants: " + h1.getNumberOfOccupants());
		System.out.printf("Annual Income: %.2f\n", h1.getAnnualIncome());

		System.out.println("\nValues have been modified");
		h1.setNumberOfOccupants(6);
		h1.setAnnualIncome(25000);

		System.out.println("Number of occupants: " + h1.getNumberOfOccupants());
		System.out.printf("Annual Income: %.2f\n", h1.getAnnualIncome());

		System.out.println("\nHousehold 2");
		System.out.println("***********");
		Household h2 = new Household(4);
		System.out.println("Number of occupants: " + h2.getNumberOfOccupants());
		System.out.printf("Annual Income: %.2f\n", h2.getAnnualIncome());

		System.out.println("\nHousehold 3");
		System.out.println("***********");
		Household h3 = new Household(7, 30000);
		System.out.println("Number of occupants: " + h3.getNumberOfOccupants());
		System.out.printf("Annual Income: %.2f\n", h3.getAnnualIncome());
		System.out.printf("Average Income: %.2f\n", h3.calcAverageIncome());
	}
}
