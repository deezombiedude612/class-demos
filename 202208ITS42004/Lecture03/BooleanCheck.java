package Lecture03;

public class BooleanCheck {
	public static void main(String[] args) {
//		boolean even = true;
//
//		if (even == true) {
//			System.out.println("YES");
//		} else {
//			System.out.println("NO");
//		}

		boolean even;
		int number = 23;

//		if (number % 2 == 0) {
//			even = true;
//		} else {
//			even = false;
//		}

//		System.out.println(number % 2 == 0);
		even = (number % 2 == 0);

		System.out.println("Even: " + even);
	}
}
