package Practical09.Activity;

public class FullTimeStaff extends AcademicStaff {
	private int rank;
	private int contributionHours;
	private double baseSalary;

	// Constructors
	public FullTimeStaff(String fullName, String id, int qualificationLevel,
	                     int rank, int contributionHours, double baseSalary) {
		// calls the superclass' constructor
		super(fullName, id, qualificationLevel);

		this.rank = rank;
		this.contributionHours = contributionHours;
		this.baseSalary = baseSalary;
	}

	public FullTimeStaff(String fullName, String id, int qualificationLevel,
	                     int rank, int contributionHours) {
		super(fullName, id, qualificationLevel);
		this.rank = rank;
		this.contributionHours = contributionHours;

		switch (this.rank) {
			case 1 -> this.baseSalary = 2000;
			case 2 -> this.baseSalary = 2500;
			case 3 -> this.baseSalary = 3000;
			default -> this.baseSalary = 0;
		}
	}

	public FullTimeStaff(PartTimeStaff pt, int rank, int contributionHours) {
		this(pt.getFullName(), pt.getId(), pt.getQualificationLevel(), rank,
				contributionHours);
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

	public double calculateSalary() { return baseSalary + getBonus(); }

	public String toString() {
		String rankName = "";
		switch (rank) {
			case 1 -> rankName = "Lecturer";
			case 2 -> rankName = "Senior Lecturer";
			case 3 -> rankName = "Professor";
			default -> { }
		}

		return super.toString()
				+ "\nStaff Rank: " + rankName;
	}
}