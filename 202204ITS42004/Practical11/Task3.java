package Practical11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		String fileName = "Exercise3.txt";
		File targetFile = new File(fileName);

		try {
			if (!targetFile.exists()) {
				// if targetFile does not exist, create a new file based on the given file name
				System.out.println(fileName + " does not exist, creating a new file now.");

				PrintWriter output = new PrintWriter(targetFile);

				for (int i = 0; i < 100; i++) {
					// generate random integer between 0 and 99
					int randNum = (int) (Math.random() * 100);

					output.print(randNum + " ");
				}

				output.close();
			} else {
				// if targetFile does exist, read from it
				System.out.println(fileName + " exists, reading from it now.");

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
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
