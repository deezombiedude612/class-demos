package Practical05;

public class Task03 {
	public static int hexToDecimal(String hex) {
		/*
		 * Hexadecimal  |  0 |  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 |  A |  B |  C |  D |  E |  F
		 * -------------+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----
		 * Decimal      |  0 |  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 | 11 | 12 | 13 | 14 | 15
		 */

		char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

		// convert hex string's alphabet digits to upper case (or lower case, make sure it matches that used in array
		hex = hex.toUpperCase();

		int decimalValue = 0;   // value to contain hex equivalent

		// Note: You can use length() method to get the length of a String
		for (int i = 0; i < hex.length(); i++) {
			char c = hex.charAt(i);     // get hex digit in each iteration from L to R

			// A
			// AB
			// ABC
			// ABCD

			int decimal = 0;    // contains decimal equivalent (e.g., A -> 10, B -> 11, etc.)

			// search hexDigits for the position of array element that matches hex digit
			for (int j = 0; j < hexDigits.length; j++) {
				if(c == hexDigits[j])
					decimal = j;
			}

			// Multiply result each time by 16, then add the value of the next digit in the hex string
			// A -> 10
			// AB -> (10) * 16 + 11
			// ABC -> ((10) * 16 + 11) * 16 + 12
			// ABCD -> ((10 * 16 + 11) * 16 + 12) * 16 + 13
			System.out.println("16 * " + decimalValue + " + " + decimal);
			decimalValue = 16 * decimalValue + decimal;
		}

		return decimalValue;
	}

	public static void main(String[] args) {
		String hex = "ABCD";

		System.out.println("Hex value " + hex + " is equal to decimal value " + hexToDecimal(hex));

		System.out.println("Check " + hex + ": " + Integer.parseInt(hex, 16));
	}
}
