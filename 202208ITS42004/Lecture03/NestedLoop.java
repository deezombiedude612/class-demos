package Lecture03;

public class NestedLoop {
	public static void main(String[] args) {
		int num1, num2;

		for (num2 = 0; num2 <= 2; num2++) {
			for (num1 = 0; num1 <= 1; num1++) {
				System.out.println(num2 + " " + num1);
			}
		}
	}
}
