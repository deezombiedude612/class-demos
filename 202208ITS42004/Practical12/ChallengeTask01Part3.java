package Practical12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ChallengeTask01Part3 {
	public static void processOnlineFile(String urlString) throws IOException {
		DecimalFormat df = new DecimalFormat("#,###.00");
		URL salaryUrl = new URL(urlString);

		/* Employee ranks:
		 * assistant, associate, full
		 *
		 * Keep counter and total salary for calculating average for later.
		 */
		int assistantCount = 0, associateCount = 0, fullCount = 0;
		double assistantTotal = 0, associateTotal = 0, fullTotal = 0;

		Scanner fileInput = new Scanner(salaryUrl.openStream());
		while (fileInput.hasNextLine()) {
			String line = fileInput.nextLine();

			// You can print out each line to see the contents of the line before deciding which
			// index to target after splitting the line.
//			 System.out.println(line);

			String[] splitLine = line.split("\\s+");

			/* In each line,
			 * Employee rank is third item (index 2)
			 * Salary is fourth item (index 3)
			 */
			switch (splitLine[2]) {
				case "assistant" -> {
					assistantTotal += Double.parseDouble(splitLine[3]);
					assistantCount++;
				}
				case "associate" -> {
					associateTotal += Double.parseDouble(splitLine[3]);
					associateCount++;
				}
				case "full" -> {
					fullTotal += Double.parseDouble(splitLine[3]);
					fullCount++;
				}
				default -> {}
			}
		}

		System.out.println("Number of assistant professor: " + assistantCount);
		System.out.println("Total amount earned by assistant professor: $" + df.format(assistantTotal));
		if (assistantCount >= 1)
			System.out.println("Average amount earned by assistant professor: $" + df.format(assistantTotal / assistantCount));
		else
			System.out.println("No assistant professors found in URL: " + urlString);

		System.out.println("\nNumber of associate professor: " + associateCount);
		System.out.println("Total amount earned by associate professor: $" + df.format(associateTotal));
		if (associateCount >= 1)
			System.out.println("Average amount earned by associate professor: $" + df.format(associateTotal / associateCount));
		else
			System.out.println("No associate professors found in URL: " + urlString);

		System.out.println("\nNumber of full professor: " + fullCount);
		System.out.println("Total amount earned by full professor: $" + df.format(fullTotal));
		if (fullCount >= 1)
			System.out.println("Average amount earned by full professor: $" + df.format(fullTotal / fullCount));
		else
			System.out.println("No full professors found in URL: " + urlString);
	}

	public static void main(String[] args) {
		try {
			processOnlineFile("https://liveexample.pearsoncmg.com/data/Salary.txt");
		} catch (MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (IOException ex) {
			System.out.println("I/O Error: No such file.");
		}
	}
}
