package Lecture06;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("The elapsed time since Jan 1, 1970 is " +
				date.getTime() + " milliseconds");
		System.out.println(date.toString());
	}
}
