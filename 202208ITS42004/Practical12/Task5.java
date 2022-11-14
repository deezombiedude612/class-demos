package Practical12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a URL >> ");
		String urlString = input.next();
		input.nextLine();   // swallows any other error output

		try {
			URL url = new URL(urlString);
			Scanner fileInput = new Scanner(url.openStream());

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
				System.out.println("No scores in " + urlString + "!");
			}

			fileInput.close();
		} catch (MalformedURLException ex) {
			System.out.println("Invalid URL.");
		} catch (IOException ex) {
			System.out.println("I/O Error: no such file");
		}
	}
}
