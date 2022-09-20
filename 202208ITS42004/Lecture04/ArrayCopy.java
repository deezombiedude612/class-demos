package Lecture04;

public class ArrayCopy {
	public static void main(String[] args) {
		char[] array1 = { 'O', 'b', 'j', 'e', 'c', 't', 's' };
		char[] array2 = new char[array1.length];

		System.arraycopy(array1, 0, array2, 0, array1.length);
		System.out.println("array1: " + String.valueOf(array1));
		System.out.println("array2: " + String.valueOf(array2));

		char[] array3 = new char[array1.length - 1];
		System.arraycopy(array1, 0, array3, 0, array1.length - 1);
		System.out.println("array3: " + String.valueOf(array3));

		/*
		 * array1: Objects
		 * array2: Objects
		 * array3: Object
		 */
	}
}
