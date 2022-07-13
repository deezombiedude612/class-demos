package Practical11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter filename (no spaces in name!) >> ");
		String filename = input.next();
		input.nextLine();   // swallows any other error output

		try {
			File thisFile = new File(filename);
			Scanner fileInput = new Scanner(thisFile);

			int numScores = 0, total = 0;
			double average;

			while (fileInput.hasNextInt()) {
				total += fileInput.nextInt();
				numScores++;    // for each time the total gets added, increment numScores
			}

			// only calculate average if numScores > 0, division by 0 not possible
			if (numScores > 0) {
				average = (double) total / numScores;
				System.out.println("Total score: " + total);
				System.out.printf("Average score: %.2f\n", average);
			} else {
				System.out.println("No scores in " + filename + "!");
			}

			fileInput.close();
		} catch (FileNotFoundException ex) {
			System.out.println();
		}
	}
}
