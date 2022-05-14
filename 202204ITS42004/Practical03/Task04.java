package Practical03;

public class Task04 {
	public static void main(String[] args) {
		for(int num = 2, index = 0; index < 50; num++) {
			boolean isPrime = true;     // flag to see if num is prime

			// check if num is prime
			for(int j = 2; j < num / 2; j++) {
				// num should not be divisible by anything other than 1 and itself to be prime
				if(num % j == 0) {
					isPrime = false;
					break;
				}
			}

			// if number is prime, print number
			if(isPrime) {
				System.out.print(num + "\t");
				index++;

				// after 10 numbers have been printed in one line, add new line escape character
				if(index % 10 == 0) System.out.println();
			}
		}
	}
}
