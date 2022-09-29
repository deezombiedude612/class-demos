package Practical05;

public class Task05 {
	// checks if the given number is prime
	private static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {    // If true, number is not prime
				return false;               // return false if not prime
			}
		}

		return true;
	}

	private static long mersennePrime(int p) {
		return ((long) Math.pow(2, p) - 1);
	}

	public static void main(String[] args) {
		System.out.println("p\t\t2^p - 1");
		System.out.println("==================");

		for (int i = 2; i <= 31; i++) {
			if (isPrime(i)) {
				System.out.println(i + "\t\t" + mersennePrime(i));
			}
		}
	}
}
