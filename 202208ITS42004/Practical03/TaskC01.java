package Practical03;

public class TaskC01 {
	public static void main(String[] args) {
		// index - count the number of printed prime numbers
		// num - testing number(s) starting from 2 to see if they are prime
		for (int num = 2, index = 0; index < 50; num++) {
			boolean isPrime = true;     // flag to say if num in this iteration is prime or not

			// check if num is prime
			for (int j = 2; j <= num / 2; j++) {
				// num should not be divisible by anything other than 1 and itself to be prime
				if (num % j == 0) {
					isPrime = false;
					break;
				}
			}

			// if number is prime, print number
			if (isPrime) {
				System.out.print(num + "\t");
				index++;    // increment index as soon as a prime number has been printed

				// after 10 numbers have been printed in one line, add new line escape character
				if (index % 10 == 0)
					System.out.println();
			}
		}
	}
}
