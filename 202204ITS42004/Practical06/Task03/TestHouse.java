package Practical06.Task03;

public class TestHouse {
	private static House[] houseArray;

	public static void main(String[] args) {
//		System.out.println("House 1");
		House h1 = new House(); // using the no-arg constructor
//		System.out.println(h1.toString());

//		System.out.println("\nHouse 2");
		House h2 = new House("Bungalow", 1000000, 5); // using overloaded constructor #1
//		System.out.println(h2.toString());

//		System.out.println("\nHouse 3");
		House h3 = new House("Single Terrace", 'B', 1200000, 7, true);
//		System.out.println(h3.toString());

		houseArray = new House[3];
		houseArray[0] = h1;
		houseArray[1] = h2;
		houseArray[2] = h3;
		for (int i = 0; i < houseArray.length; i++) {
			System.out.println("\nHouse " + (i + 1));
			System.out.println(houseArray[i].toString());
		}
	}
}
