package Lecture05;

public class CautionExample {
	public static int sign (int n) {
		if (n > 0)
			return 1;
		else if (n == 0)
			return 0;
		else
			return -1;
	}

	public static void main(String[] args) {
		System.out.println(sign(2));
		System.out.println(sign(0));
		System.out.println(sign(-2));
	}
}
