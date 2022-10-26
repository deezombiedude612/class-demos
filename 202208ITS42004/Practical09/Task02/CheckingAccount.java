package Practical09.Task02;

import java.util.Date;

public class CheckingAccount extends Account {
	private int numFreeTransactions;
	private static final double NOMINAL_FEE = 10.00; // to be used for extra charges

	// let's say if unspecified, number of free transactions is 100
	private static final int DEFAULT_NUM_FREE_TRANSACTIONS = 100;

	public CheckingAccount(int accNo, double balance) {
		this(accNo, balance, new Date(), DEFAULT_NUM_FREE_TRANSACTIONS);
	}

	public CheckingAccount(int accNo, double balance, Date dateCreated) {
		this(accNo, balance, dateCreated, DEFAULT_NUM_FREE_TRANSACTIONS);
	}

	public CheckingAccount(int accNo, double balance, int numFreeTransactions) {
		this(accNo, balance, new Date(), numFreeTransactions);
	}

	public CheckingAccount(int accNo, double balance, Date dateCreated, int numFreeTransactions) {
		// call the superclass' constructor first!
		super(accNo, balance, dateCreated);
		setNumFreeTransactions(numFreeTransactions);
	}

	// get method(s)
	public int getNumFreeTransactions() { return numFreeTransactions; }
	public void setNumFreeTransactions(int numFreeTransactions) {
		if (numFreeTransactions >= 0)
			this.numFreeTransactions = numFreeTransactions;
		else
			this.numFreeTransactions = 0;
	}

	// For checking account, transactions (deposit and withdrawal) are limited.
	// If there are no more free transactions, a nominal fee is charged.
	@Override
	public void deposit(double depositAmount) {
		checkFreeTransactions();
		super.deposit(depositAmount);
	}

	@Override
	public void withdraw(double withdrawalAmount) {
		checkFreeTransactions();
		super.withdraw(withdrawalAmount);
	}

	// separate method to check if any free transactions are left
	// or if nominal fee is to be charged
	protected void checkFreeTransactions() {
		// if there are free transactions left
		if (numFreeTransactions > 0) {
			// deduct number of free transactions by 1
			this.numFreeTransactions--;
			System.out.println("Number of free transactions left after transaction: " + this.numFreeTransactions);
		} else {
			// if there are no more free transactions left
			System.out.printf("No free transactions left, $%.2f will be deducted from your balance.\n", NOMINAL_FEE);
			setBalance(this.getBalance() - NOMINAL_FEE);
		}
	}

	@Override
	public String toString() {
		return "CHECKING ACCOUNT\n" + super.toString()
				+ "\nNumber of Free Transactions Left: " + this.numFreeTransactions;
	}
}