package Practical07.Task02;

public class TestHouse {
	public static void main(String[] args) {
		House[] houses = new House[3];

		houses[0] = new House();
		System.out.println("HOUSE INDEX 0");
		System.out.println(houses[0].toString());

		houses[1] = new House("Bungalow", 'B', 50000.00);
		System.out.println("HOUSE INDEX 1");
		System.out.println(houses[1].toString());

		houses[2] = new House("Penthouse", 'Z', 20000000.00, 25, true);
		System.out.println("HOUSE INDEX 2");
		System.out.println(houses[2].toString());


	}
}
