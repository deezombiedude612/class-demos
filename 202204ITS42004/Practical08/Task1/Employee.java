package Practical08.Task1;

import java.text.DecimalFormat;

public class Employee {
	private String name;
	private int yearJoined;
	private double basicSalary;
	private double allowance;

	protected final DecimalFormat df = new DecimalFormat("#.00");

	// no-arg constructor
	public Employee() {
//		name = "";
//		yearJoined = 2022;  // can replace with a mechanism that automatically generates the current year
//		basicSalary = 2000;
//		allowance = 500;
		this("", 2022, 2000, 500);
	}

	// overloaded constructor
	public Employee(String name, int yearJoined, double basicSalary, double allowance) {
//		this.name = name;
//		this.yearJoined = yearJoined;
//		this.basicSalary = basicSalary;
//		this.allowance = allowance;
		setName(name);
		setYearJoined(yearJoined);
		setBasicSalary(basicSalary);
		setAllowance(allowance);
	}

	// get methods
	public String getName() { return name; }
	public int getYearJoined() { return yearJoined; }
	public double getBasicSalary() { return basicSalary; }
	public double getAllowance() { return allowance; }

	// set methods
	public void setName(String name) { this.name = name; }
	public void setYearJoined(int yearJoined) {
		if (yearJoined > 0 && yearJoined <= 2022)
			this.yearJoined = yearJoined;
		else
			this.yearJoined = 2022;
	}
	public void setBasicSalary(double basicSalary) {
		if (basicSalary >= 0)
			this.basicSalary = basicSalary;
		else
			this.basicSalary = 0;
	}
	public void setAllowance(double allowance) {
		if (allowance >= 0)
			this.allowance = allowance;
		else
			this.allowance = 0;
	}

	@Override
	public String toString() {
		// Crafting out String output (not printing it!)
		String output = "Employee Name: " + this.name
				+ "\nYear Joined: " + this.yearJoined
				+ "\nBasic Salary: $" + df.format(this.basicSalary)
				+ "\nAllowance: $" + df.format(this.allowance);

		// DecimalFormat object (df) forces double values to 2 decimal places

		return output;
	}

	// Calculates Employee salary
	public double calculateSalary() { return (basicSalary + allowance); }

	// check to see if 2 employees' names are the same
	public boolean equals(Employee compareEmployee) {
		// Remember, we cannot use == to compare
		// whether the Strings are the same!
		boolean sameName = (this.name).equals(compareEmployee.getName());

		return sameName;
	}
}
