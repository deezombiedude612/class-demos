package Lecture11;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in);

		System.out.print("Enter a URL >> ");
		String URLString = consoleInput.next();

		try {
			URL url = new URL(URLString);
			int count = 0;

			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				String line = input.nextLine();
				count += line.length();
			}

			System.out.println("The file size is " + count + " characters");
		} catch (MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}
}
