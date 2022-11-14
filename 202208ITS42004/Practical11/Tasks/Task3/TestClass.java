package Practical11.Tasks.Task3;

public class TestClass {
	public static void main(String[] args) {
//		TestScores t1 = new TestScores(new double[] { 75, 23, 57, 91 });
		double[] s1 = { 75, 23, -57, 91 };
		TestScores t1 = new TestScores(s1);

		try {
			System.out.println("Average score: " + t1.getAverageScore());
		} catch (IllegalArgumentException ex) {
			System.out.println("Unable to retrieve average.");
			System.out.println(ex.getMessage());
		}
	}
}
