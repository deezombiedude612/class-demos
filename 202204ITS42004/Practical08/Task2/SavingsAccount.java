package Practical08.Task2;

import java.util.Date;

public class SavingsAccount extends Account {
	private double interest;    // amount of interest accumulated
	private final static double INTEREST_RATE = 0.023;    // assumption for interest rate (here it's 2.3%)

	public SavingsAccount(int accNo, double balance) {
		this(accNo, balance, 0);
	}

	public SavingsAccount(int accNo, double balance, Date dateCreated) {
		this(accNo, balance, dateCreated, 0);
	}

	public SavingsAccount(int accNo, double balance, double interest) {
		super(accNo, balance);
		setInterest(interest);
	}

	public SavingsAccount(int accNo, double balance, Date dateCreated, double interest) {
		// call the superclass' constructor first!
		super(accNo, balance, dateCreated);
		setInterest(interest);
	}

	// get method(s)
	public double getInterest() { return interest; }

	// set method(s)
	public void setInterest(double interest) {
		if (interest >= 0)
			this.interest = interest;
		else
			this.interest = 0;
	}

	// compound new interest based on interest rate and balance in account per month
	public void compoundInterest() {
		// compound interest
		setInterest(this.interest + (this.getBalance() * INTEREST_RATE / 12));

		// add interest to balance
		setBalance(this.getBalance() + this.interest);
	}

	@Override
	public String toString() {
		return "SAVINGS ACCOUNT\n" + super.toString()
				+ "\nInterest Accumulated: $" + df.format(this.interest);
	}
}
