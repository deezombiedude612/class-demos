package Practical04;

public class Task03 {
	public static void main(String[] args) {
		int[][] empHours = {
				{ 2, 4, 3, 4, 5, 8, 8 }, // Employee 0
				{ 7, 3, 4, 3, 3, 4, 4 }, // Employee 1
				{ 3, 3, 4, 3, 3, 2, 2 }, // Employee 2
				{ 9, 3, 4, 7, 3, 4, 1 }, // Employee 3
				{ 3, 5, 4, 3, 6, 3, 8 }, // Employee 4
				{ 3, 4, 4, 6, 3, 4, 4 }, // Employee 5
				{ 3, 7, 4, 8, 3, 8, 4 }, // Employee 6
				{ 6, 3, 5, 9, 2, 7, 9 } // Employee 7
		};

		for (int i = 0; i < empHours.length; i++) {
			int totalHours = 0;

			// get total hours here
			for (int j = 0; j < empHours[i].length; j++)
				totalHours += empHours[i][j];

			System.out.println("Employee " + i + " is " + totalHours + " hours");
		}
	}
}
