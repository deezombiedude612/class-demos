package Practical08.Task1;

public class Clerk extends Employee {
	private int overtimeHours;
	private double overtimeRate;

	// no-arg constructor
	public Clerk() {
		// invoke the superclass' constructor first
		super();
		setOvertimeHours(0);
		setOvertimeRate(1);
	}

	// overloaded constructors
	public Clerk(String name, int yearJoined, double basicSalary, double allowance) {
		this(name, yearJoined, basicSalary, allowance, 0, 1);
	}

	public Clerk(String name, int yearJoined, double basicSalary, double allowance,
	             int overtimeHours, double overtimeRate) {
		super(name, yearJoined, basicSalary, allowance);
		setOvertimeHours(overtimeHours);
		setOvertimeRate(overtimeRate);
	}

	// get methods
	public int getOvertimeHours() { return overtimeHours; }
	public double getOvertimeRate() { return overtimeRate; }

	// set methods
	public void setOvertimeHours(int overtimeHours) {
		if (this.overtimeHours >= 0)
			this.overtimeHours = overtimeHours;
		else
			this.overtimeHours = 0;
	}
	public void setOvertimeRate(double overtimeRate) {
		// Assume overtime rate cannot be less than 1
		if (this.overtimeRate > 1)
			this.overtimeRate = overtimeRate;
		else
			this.overtimeRate = 1;
	}

	@Override
	public String toString() {
		// adding the fact that this is a Clerk object
		String output = "Employee Type: Clerk\n"
				+ super.toString();

		// add overtime hours and overtime rate
		output += "\nOvertime Hours: " + this.overtimeHours;
		output += "\nOvertime Rate: $" + df.format(this.overtimeRate) + " per hour";

		return output;
	}

	// Assume that for Clerks, add (overtimeHours * overtimeRate) to initial salary amount
	@Override
	public double calculateSalary() {
		// calculate overtime bonus
		double overtime = overtimeHours * overtimeRate;

		return super.calculateSalary() + overtime;
	}
}
