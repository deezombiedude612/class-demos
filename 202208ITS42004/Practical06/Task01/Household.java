package Practical06.Task01;

public class Household {
	public int numberOfOccupants;
	public double annualIncome;

	public Household() {
		numberOfOccupants = 1;
		annualIncome = 0;
	}

	public Household(int numberOfOccupants) {
		this.numberOfOccupants = numberOfOccupants;
		annualIncome = 0;
	}

	public Household(int numberOfOccupants, double annualIncome) {
		this.numberOfOccupants = numberOfOccupants;
		this.annualIncome = annualIncome;
	}

	public double calcAverageIncome() {
		return annualIncome / numberOfOccupants;
	}
}
