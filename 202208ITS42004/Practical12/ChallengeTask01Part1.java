package Practical12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Random;

public class ChallengeTask01Part1 {
	public static void printToFile(File file) throws IOException {
		DecimalFormat df = new DecimalFormat("#.00");
		String[] employeeRanks = { "assistant", "associate", "full" };

		try (PrintWriter output = new PrintWriter(file)) {
			for (int i = 1; i <= 1000; i++) {
				// generate random index to select for this employee's rank
				Random random = new Random();
				int rankIndex = random.nextInt(employeeRanks.length);

				output.print("FirstName" + i + " ");
				output.print("LastName" + i + " ");
				output.print(employeeRanks[rankIndex] + " ");

				switch (rankIndex) {
					// Assistant professors earn between 50,000 to 80,000 (80,000 - 50,000 + 1= 30,001)
					case 0 -> output.println(df.format(Math.random() * 30001 + 50000));

					// Associate professors earn between 60,000 to 110,000 (110,000 - 60,000 + 1 = 50,001)
					case 1 -> output.println(df.format(Math.random() * 50001 + 60000));

					// Full professors earn between 75,000 to 130,000 (130,000 - 75,000 + 1 = 55,001)
					case 2 -> output.println(df.format(Math.random() * 55001 + 75000));

					default -> { }
				}
			}
		}
	}

	public static void main(String[] args) {
		String pathname = "Salary.txt";

		File file = new File(pathname);
		if (file.exists()) {
			System.out.println(pathname + " already exists.");
		} else {
			try {
				printToFile(file);
			} catch (IOException ex) {
				System.out.println("Error writing to " + pathname);
			}
		}
	}
}
