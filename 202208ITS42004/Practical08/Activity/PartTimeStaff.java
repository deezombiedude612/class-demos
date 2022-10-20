package Practical08.Activity;

public class PartTimeStaff extends AcademicStaff {
	private double hourlyRate;
	private int hoursWorked;

	// Constructor
	public PartTimeStaff(String fullName, String id, int qualificationLevel,
	                     double hourlyRate, int hoursWorked) {
		// calls the superclass' constructor
		super(fullName, id, qualificationLevel);

		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	// Accessor and Mutator Methods
	public double getHourlyRate() { return hourlyRate; }
	public int getHoursWorked() { return hoursWorked; }

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	// Add hours worked
	public void addHoursWorked(int additionalHours) {
		this.hoursWorked += additionalHours;
	}
}
