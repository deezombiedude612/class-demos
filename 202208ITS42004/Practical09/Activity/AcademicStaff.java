package Practical09.Activity;

public class AcademicStaff {
	private String fullName;
	private String id;
	private int qualificationLevel;

	// Constructor
	public AcademicStaff(String fullName, String id, int qualificationLevel) {
		this.fullName = fullName;
		this.id = id;
		this.qualificationLevel = qualificationLevel;
	}

	// Accessor and Mutator Methods
	public String getFullName() { return fullName; }
	public String getId() { return id; }
	public int getQualificationLevel() { return qualificationLevel; }

	public void setFullName(String fullName) { this.fullName = fullName; }
	public void setId(String id) { this.id = id; }
	public void setQualificationLevel(int qualificationLevel) { this.qualificationLevel = qualificationLevel; }

	public String toString() {
		String qualification = "";

		switch(qualificationLevel) {
			case 1 -> qualification = "Bachelor";
			case 2 -> qualification = "Master";
			case 3 -> qualification = "Doctorate";
			default -> { }
		}

		return "Full Name: " + fullName
				+ "\nStaff ID: " + id
				+ "\nQualification Type: " + qualification;
	}

	public void printStaff() { System.out.println(this.toString()); }

	public double calculateSalary() { return 0; }
}