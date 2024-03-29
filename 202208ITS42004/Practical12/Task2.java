package Practical12;

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

			int numScores = 0;      // counter for number of scores read from text file
			double average, total = 0;

			while (fileInput.hasNextInt()) {
				total += fileInput.nextInt();
				numScores++;
			}

			// only calculate the average if numScores > 0, division by 0 not possible
			if (numScores > 0) {
				average = total / numScores;
				System.out.println("Total score: " + total);
				System.out.printf("Average score: %.2f\n", average);
			} else {
				System.out.println("No scores in " + filename + "!");
			}

			fileInput.close();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
