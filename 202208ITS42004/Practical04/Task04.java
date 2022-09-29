package Practical04;

import java.util.ArrayList;
import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);

		int inputInteger;
		int scoreNo = 1; // just for show to user to know which number is being input

		do {
			System.out.print("Score " + scoreNo + " >> ");
			inputInteger = input.nextInt();

			// populate ArrayList if inputInteger is not negative
			if (inputInteger >= 0)
				intArr.add(inputInteger);

			scoreNo++;
		} while (inputInteger >= 0 && scoreNo <= 10);

		System.out.println("Results");
		System.out.println("=======");

		double total = 0;
		for (int i = 0; i < intArr.size(); i++) {
			total += intArr.get(i);
		}

		double average = total / intArr.size();
		System.out.println("Average is " + average);

		int larger = 0; // counter for how many integers are above or equal to the average
		int smaller = 0; // counter for how many integers are below the average
		for (int i = 0; i < intArr.size(); i++) {
			if (intArr.get(i) >= average)
				larger++;
			else
				smaller++;
		}

		System.out.println("Number of scores above or equal to the average is " + larger);
		System.out.println("Number of scores below the average is " + smaller);
	}
}
