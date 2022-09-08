package Lecture02;

public class IncrementDecrement {
	public static void main(String[] args) {
		int x = 10;
//		int y = ++x * 2;
		int y = x++ * 2;
		System.out.println("x = " + x + ", y = " + y);
	}
}
