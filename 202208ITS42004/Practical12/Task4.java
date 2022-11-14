package Practical12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
	public static boolean sameCharacters(char charInput, char compare) {
		return charInput == Character.toLowerCase(compare) || charInput == Character.toUpperCase(compare);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter filename (no spaces in name!) >> ");
		String filename = input.next();
		input.nextLine();   /// swallows any other error output

		try {
			// Create a Scanner for the file
			Scanner fileInput = new Scanner(new File(filename));

			int[] letterOccurrences = new int[26];
			String searchString = "abcdefghijklmnopqrstuvwxyz";

			// Read data from file
			while (fileInput.hasNextLine()) {
				String line = fileInput.nextLine();

				// iterate through the read line from the file
				for (int i = 0; i < line.length(); i++) {
					// iterating through searchString (to check each letter)
					for (int j = 0; j < searchString.length(); j++) {
						if (sameCharacters(line.charAt(i), searchString.charAt(j))) {
							letterOccurrences[j]++;
						}
					}
				}
			}

			for (int i = 0; i < letterOccurrences.length; i++) {
				System.out.println(
						"The occurrence of " + Character.toUpperCase(searchString.charAt(i))
								+ "'s is " + letterOccurrences[i]
				);
			}

			fileInput.close();
		} catch (FileNotFoundException ex) {
			System.out.println(filename + " does not exist");
		}
	}
}
