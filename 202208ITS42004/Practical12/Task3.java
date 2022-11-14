package Practical12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {
	public static void writeToFile(File targetFile) throws FileNotFoundException {
		PrintWriter output = new PrintWriter(targetFile);

		for (int i = 0; i < 100; i++) {
			// generate random integer between 0 and 99
			int randNum = (int) (Math.random() * 100);

			output.print(randNum + " ");
		}

		output.close();
	}

	// Alternative to initialize PrintWriter with auto-close
	public static void writeToFileWithAutoClose(File targetFile) throws FileNotFoundException {
		try (PrintWriter output = new PrintWriter(targetFile)) {
			for (int i = 0; i < 100; i++) {
				// generate random integer between 0 and 99
				int randNum = (int) (Math.random() * 100);

				output.print(randNum + " ");
			}
		}
	}

	public static void readFromFile(File targetFile) throws FileNotFoundException {
		Scanner input = new Scanner(targetFile);

		ArrayList<Integer> intList = new ArrayList<>();

		while (input.hasNextInt()) {
			intList.add(input.nextInt());
		}

		// sort integers in intList in ascending order
		Collections.sort(intList);

		// print everything from intList
		for (int i: intList) {
			System.out.print(i + " ");
		}
		System.out.println();

		input.close();
	}

	public static void main(String[] args) {
		String filename = "Exercise3.txt";
		File targetFile = new File(filename);

		try {
			if (!targetFile.exists()) {
				// if targetFile does not exist, create a new file based on the given file name
				System.out.println(filename + " does not exist, creating a new file now.");

				writeToFile(targetFile);
			} else {
				// if targetFile does exist, read from it
				System.out.println(filename + " exists, reading from it now.");

				readFromFile(targetFile);
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
