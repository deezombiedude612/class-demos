package Practical08.Activity;

public class FullTimeStaff extends AcademicStaff {
	private int rank;
	private int contributionHours;
	private double baseSalary;

	// Constructor
	public FullTimeStaff(String fullName, String id, int qualificationLevel,
	                     int rank, int contributionHours, double baseSalary) {
		// calls the superclass' constructor
		super(fullName, id, qualificationLevel);

		this.rank = rank;
		this.contributionHours = contributionHours;
		this.baseSalary = baseSalary;
	}

	// Accessor and Mutator Methods
	public int getRank() { return rank; }
	public int getContributionHours() { return contributionHours; }
	public double getBaseSalary() { return baseSalary; }

	public void setRank(int rank) { this.rank = rank; }
	public void setContributionHours(int contributionHours) {
		this.contributionHours = contributionHours;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	// Determines bonus amount
	public double getBonus() { return contributionHours * 100; }
}
