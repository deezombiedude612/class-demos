package Practical05;

public class Task04 {
	private static double summation(int limit) {
		double total = 0;

		for (double i = 0; i <= limit; i++) {
			total += (i / (i + 1));
		}

		return total;
	}

	public static void main(String[] args) {
		System.out.println("i\t\tm(i)");
		System.out.println("==================");

		for (int i = 1; i <= 20; i++) {
			System.out.printf("%d\t\t%.4f\n", i, summation(i));
		}
	}
}
