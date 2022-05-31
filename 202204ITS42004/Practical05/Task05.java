package Practical05;

public class Task05 {
	public static double poundToKilogram(double pound) {
		return (0.453 * pound);
	}

	public static double kilogramToPound(double kilogram) {
		return (2.204 * kilogram);
	}

	public static void main(String[] args) {
		System.out.println("Pound to kilogram: " + poundToKilogram(200));
		System.out.println("Kilogram to pound: " + kilogramToPound(200));
	}
}
