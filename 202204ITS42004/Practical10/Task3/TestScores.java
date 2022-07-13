package Practical10.Task3;

public class TestScores {
	private double[] scores;

	// constructor
	public TestScores(double[] scores) {
		setScores(scores);
	}

	public double[] getScores() { return scores; }

	public void setScores(double[] scores) {
		this.scores = new double[scores.length];    // get length of scores, initialize class' scores to same length/size

		// deep copy of scores
		for (int i = 0; i < scores.length; i++) {
			this.scores[i] = scores[i];
		}
	}

	// return average of test scores
	// throws IllegalArgumentException if any test score < 0 or score > 100
	public double getAverageScore() {
		double total = 0;

		// enhanced for-loop (can be substituted for regular for loop)
		for (double s: scores) {
			if (s < 0 || s > 100) { // if illegal score is found
				// throw IllegalArgumentException
				throw new IllegalArgumentException("Score must be between 0 and 100!");
			}

			total += s; // add score to the total
		}

		// calculate average
		double average = total / scores.length;

		return average;
	}
}
