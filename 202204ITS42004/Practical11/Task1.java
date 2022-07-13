package Practical11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		String filename = "Exercise1.txt";

		try {
			File thisFile = new File(filename);

			// Create a Scanner for the file
			Scanner input = new Scanner(thisFile);

			int numLines = 0, numWords = 0, numChars = 0;

			// Read data from the file
			while (input.hasNextLine()) {
				String line = input.nextLine(); // retrieve the next line from the file pointer's position
				numLines++;

				numChars += line.length();  // add total number of characters in read line

				// to retrieve words, use split()
				String[] words = line.split("\\s+"); // length of words array represent the number of words in the line
				numWords += words.length;
			}

			System.out.println("Number of lines in " + filename + ": " + numLines);
			System.out.println("Number of words in " + filename + ": " + numWords);
			System.out.println("Number of characters in " + filename + ": " + numChars);

			input.close();  // close Scanner object (compulsory for File I/O)
		} catch (FileNotFoundException ex) {
			System.out.println(filename + " does not exist.");
		}
	}
}
