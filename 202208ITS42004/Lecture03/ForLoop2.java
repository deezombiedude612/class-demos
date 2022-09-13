package Lecture03;

public class ForLoop2 {
	public static void main(String[] args) {
		int sum = 0;
//		int number = 1;
//
//		while (number <= 10) {
//			sum += number;
//			number = number + 5;
//			System.out.println("SUM = " + sum);
//		}

		for (int number = 1; number <= 10; number = number + 5) {
			sum += number;
			System.out.println("SUM = " + sum);
		}
		System.out.println("End of program");
	}
}
