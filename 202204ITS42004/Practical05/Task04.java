package Practical05;

public class Task04 {
	// 1 mile = 1.609 km
	final static double MILES_TO_KILOMETERS = 1.609;

	public static double mileToKilometer(double mile) {
		return (mile * MILES_TO_KILOMETERS);
	}

	public static double kilometerToMile(double kilometer) {
		return (kilometer / MILES_TO_KILOMETERS);
	}

	public static void main(String[] args) {
		System.out.println("Miles to kilometers: " + mileToKilometer(2.5));
		System.out.println("Kilometers to miles: " + kilometerToMile(2.5));
	}
}
