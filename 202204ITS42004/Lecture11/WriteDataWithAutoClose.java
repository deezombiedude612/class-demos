package Lecture11;

import java.io.File;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
	public static void main(String[] args) throws Exception {
		File file = new File("scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0); // EXIT CODE 0 means that program ran successfully without issue
		}

		// By adding a try block (try-with-resources),
		// you don't have to include a statement to close the file.
		// This allows the file to be closed automatically after
		// everything in the curly braces is run.
		try (
				// Create a file
				PrintWriter output = new PrintWriter(file)
		) {
			// Write formatted output to the file
			output.print("John T Smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
		}
	}
}
