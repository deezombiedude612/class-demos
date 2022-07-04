package Lecture11;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
	// for File I/O, you MUST throw IOException
	public static void main(String[] args) throws IOException {
		File file = new File("scores.txt");
		if (file.exists()) {
			// program will continue running only if scores.txt does not exist
			System.out.println("File already exists");
			System.exit(1);
		}

		// Create a file
		// PrintWriter object is created to print to the File object
		PrintWriter output = new PrintWriter(file);

		String[] people = { "John T Smith", "Eric K Jones"};
		int[] scores = { 90, 85 };

		// Write formatted output to the file
//		output.print("John T Smith ");
//		output.println(90);
//		output.print("Eric K Jones ");
//		output.println(85);

		for (int i = 0; i < people.length; i++) {
			output.println(people[i] + " " + scores[i]);
		}

		// Close the file
		output.close();
	}
}
