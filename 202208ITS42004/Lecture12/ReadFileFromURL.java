package Lecture12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a URL >> ");
		String urlString = input.nextLine();

		try {
			URL url = new URL(urlString);
			int count = 0;  // to contain number of characters in the file

			Scanner fileInput = new Scanner(url.openStream());
			while (fileInput.hasNext()) {
				String line = input.nextLine();
				System.out.println(line);
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
