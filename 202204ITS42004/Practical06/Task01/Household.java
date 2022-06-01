package Practical06.Task01;

public class Household {
	/* attributes */
	private int numberOfOccupants;
	private double annualIncome;

	/* default constructor */
	public Household() {
		numberOfOccupants = 1;
		annualIncome = 0;
	}

	/* Overloaded Constructor #1 */
	public Household(int numberOfOccupants) {
		this.numberOfOccupants = numberOfOccupants;
		this.annualIncome = 0;
	}

	/* Overloaded Constructor #2 */
	public Household(int numberOfOccupants, double annualIncome) {
		this.numberOfOccupants = numberOfOccupants;
		this.annualIncome = annualIncome;
	}

	/* get methods */
	public int getNumberOfOccupants() {
		return numberOfOccupants;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}

	/* set methods */
	public void setNumberOfOccupants(int newNumberOfOccupants) {
		numberOfOccupants = newNumberOfOccupants;
	}
	public void setAnnualIncome(double newAnnualIncome) {
		annualIncome = newAnnualIncome;
	}

	// calculates average income of household
	public double calcAverageIncome() {
		double averageIncome = annualIncome / numberOfOccupants;

		return averageIncome;
	}
}
