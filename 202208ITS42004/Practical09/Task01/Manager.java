package Practical09.Task01;

public class Manager extends Employee {
	private double travelClaims;

	// no-arg constructor
	public Manager() {
		// invoke the superclass' constructor first
		super();
		setTravelClaims(0);
	}

	// overloaded constructors
	public Manager(String name, int yearJoined, double basicSalary, double allowance) {
		this(name, yearJoined, basicSalary, allowance, 0);
	}

	public Manager(String name, int yearJoined, double basicSalary, double allowance, double travelClaims) {
		super(name, yearJoined, basicSalary, allowance);
//		this.travelClaims = travelClaims;
		setTravelClaims(travelClaims);
	}

	// get method(s)
	public double getTravelClaims() { return travelClaims; }

	// set method(s)
	public void setTravelClaims(double travelClaims) {
		if (travelClaims >= 0)
			this.travelClaims = travelClaims;
		else
			this.travelClaims = 0;
	}

	@Override
	public String toString() {
		// adding the fact that this is a Manager object
		String output = "Employee Type: Manager\n"
				+ super.toString();

		// add travel claims
		output += "\nTravel Claims: $" + df.format(this.travelClaims);

		return output;
	}

	// Assume that for Managers, add travel claims to initial salary amount
	@Override
	public double calculateSalary() {
		return super.calculateSalary() + travelClaims;
	}
}
