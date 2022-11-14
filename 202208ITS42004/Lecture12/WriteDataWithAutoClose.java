package Lecture12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
	public static void main(String[] args) throws IOException {
		File file = new File("scores.txt");

//		if (file.exists()) {
//			System.out.println("File already exists");
//			System.exit(1);
//		}

		try (
				// Create a PrintWriter object
				PrintWriter output = new PrintWriter(file);
				) {
			// Write formatted output to the file
			output.printf("%s %d\n", "John T Smith", 90);
			output.printf("%s %d\n", "Eric K Jones", 85);
		}
	}
}
