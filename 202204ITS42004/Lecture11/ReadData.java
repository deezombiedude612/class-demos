package Lecture11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
	public static void main(String[] args) throws IOException {
		// Create a File instance
		File file = new File("scores.txt");

		// Create a Scanner for the file
		Scanner fileInput = new Scanner(file);

		// Read data from a file
		while (fileInput.hasNext()) {
			// as long as there is data left yet to be read, keep reading information
			String firstName = fileInput.next();
			String mi = fileInput.next();
			String lastName = fileInput.next();
			int score = fileInput.nextInt();

			System.out.println(firstName + " " + mi + " " + lastName + " " + score);
		}

		// Close the file
		fileInput.close();
	}
}
