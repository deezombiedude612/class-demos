package Practical08.Task2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	private long accNo;
	private double balance;
	private Date dateCreated;

	protected final DecimalFormat df = new DecimalFormat("#.00");
	protected final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// overloaded constructors only
	public Account(int accNo, double balance) {
		this(accNo, balance, new Date());
	}

	public Account(int accNo, double balance, Date dateCreated) {
		setAccNo(accNo);
		setBalance(balance);
		setDateCreated(dateCreated);
	}

	// get methods
	public long getAccNo() { return accNo; }
	public double getBalance() { return balance; }
	public Date getDateCreated() { return dateCreated; }

	// set methods
	public void setAccNo(int accNo) { this.accNo = accNo; }
	public void setBalance(double balance) {
		if (balance >= 0)
			this.balance = balance;
		else
			this.balance = 0;
	}
	public void setDateCreated(Date dateCreated) { this.dateCreated = dateCreated; }

	public void deposit(double depositAmount) {
		if (depositAmount > 0) {
			System.out.printf("Depositing $%.2f to balance..\n", depositAmount);
			setBalance(this.balance + depositAmount);
		}
	}

	public void withdraw(double withdrawAmount) {
		if (withdrawAmount > 0) {
			System.out.printf("Withdrawing $%.2f from balance..\n", withdrawAmount);
			setBalance(this.balance - withdrawAmount);
		}
	}

	@Override
	public String toString() {
		return "Account No.: " + this.accNo
				+ "\nBalance: $" + df.format(this.balance)
				+ "\nDate Created: " + sdf.format(this.dateCreated);
	}
}
