package Lecture12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
	public static void main(String[] args) throws IOException {
		File file = new File("scores.txt");

		if (file.exists()) {
			System.out.println("File already exists.");
			System.exit(1);
		}

		// Create a new file
		PrintWriter output = new PrintWriter(file);

		// Write formatted output to the file
		output.printf("%s %d\n", "John T Smith", 90);
		output.printf("%s %d\n", "Eric K Jones", 85);
//		output.printf("%s %d", "Mary A Lmaos", 80);

		// Close the file
		output.close();
	}
}
