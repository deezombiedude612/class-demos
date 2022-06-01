package Lecture04;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		// Create an ArrayList
		ArrayList al = new ArrayList();
		System.out.println("Initial size of al: " + al.size());

		// Add elements to al
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		System.out.println("Size after all the additions: " + al.size());

		// Display the ArrayList
		System.out.println("Contents of al: " + al);

		// Remove elements from ArrayList
		al.remove("F");
		al.remove(2);
		System.out.println("Size after all the deletions: " + al.size());
		System.out.println("Contents of al: " + al);

		/*
		* Initial size of al: 0
		* Size after all the additions: 7
		* Contents of al: [C, A2, A, E, B, D, F]
		* Size after all the deletions: 5
		* Contents of al: [C, A2, E, B, D]
		*/
	}
}
