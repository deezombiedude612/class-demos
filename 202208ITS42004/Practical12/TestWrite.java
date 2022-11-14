package Practical11;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestWrite {
	public static void main(String[] args) throws IOException {
		File file = new File("Exercise1.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		// Create the file
		PrintWriter output = new PrintWriter(file);

		// Close the file
		output.close();
	}
}
