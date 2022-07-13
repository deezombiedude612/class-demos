package Practical10.Task3;

public class TestClass {
	public static void main(String[] args) {
//		TestScores t1 = new TestScores(new double[] { 75, 23, 57, 91 });

		double[] s1 = { 75, 23, 57, 91 };
		TestScores t1 = new TestScores(s1);

		try {
			System.out.println("Average score: " + t1.getAverageScore());
		} catch (IllegalArgumentException ex) {
			System.out.println("Unable to retrieve average.");
			System.out.println(ex.getMessage());
		}
	}

	// Array A -> address 1000
	// A = B; // shallow copy here
	// Array B (shallow copy) -> address 1000 (pointing to same address)
	// any changes from A will also happen in B

	// Array A -> address 1000
	// for (...) { ... } // deep copy here
	// Array B (deep copy) -> address 2000 (pointing to different address)
	// any changes from A will NOT happen in B
}
