package Practical04;

import java.util.ArrayList;
import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		ArrayList<Integer> intArr = new ArrayList<>();
		Scanner input = new Scanner(System.in);

		int inputInteger, scoreNo = 1;

		do {
			System.out.print("Score " + scoreNo + ": ");
			inputInteger = input.nextInt();

			if (inputInteger >= 0)
				intArr.add(inputInteger);

			scoreNo++;
		} while (inputInteger >= 0);

		System.out.println("Results");
		System.out.println("=======");

		double total = 0;
		for (int i = 0; i < intArr.size(); i++)
			total += intArr.get(i);

		double average = total / intArr.size();
		System.out.println("Average is " + average);

		int larger = 0, smaller = 0;
		for (int i = 0; i < intArr.size(); i++) {
			if (intArr.get(i) >= average)
				larger++;

			if (intArr.get(i) < average)
				smaller++;
		}

		System.out.println("Number of scores more than or equal to the average is " + larger);
		System.out.println("Number of scores below the average is " + smaller);
	}
}
