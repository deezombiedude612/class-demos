package Practical11.Activity;

public class FullTimeStaff extends AcademicStaff {
	private int rank;
	private int contributionHours;
	private double baseSalary;

	// Constructors
	public FullTimeStaff(String fullName, String id, int qualificationLevel,
	                     int rank, int contributionHours, double baseSalary) {
		// calls the superclass' constructor
		super(fullName, id, qualificationLevel);

		setRank(rank);
		setContributionHours(contributionHours);
		setBaseSalary(baseSalary);
	}

	public FullTimeStaff(String fullName, String id, int qualificationLevel,
	                     int rank, int contributionHours) {
		super(fullName, id, qualificationLevel);
		setRank(rank);
		setContributionHours(contributionHours);

		switch (this.rank) {
			case 1 -> setBaseSalary(2000);
			case 2 -> setBaseSalary(2500);
			case 3 -> setBaseSalary(3000);
			default -> setBaseSalary(0);
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

	public void setRank(int rank) {
		if (rank < 1 || rank > 3)
			throw new IllegalArgumentException("Rank must be either 1, 2, or 3!");
		this.rank = rank;
	}
	public void setContributionHours(int contributionHours) {
		if (contributionHours < 0)
			throw new IllegalArgumentException("Contribution hours cannot be negative!");

		this.contributionHours = contributionHours;
	}
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0)
			throw new IllegalArgumentException("Base salary cannot be negative!");

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
