package Practical09.Task02;

import java.util.Date;

public class TestAccount {
	public static void main(String[] args) {
		Account a1 = new Account(1128, 2600, new Date());
		SavingsAccount s1 = new SavingsAccount(3347, 9000, new Date(), 2.5);
		CheckingAccount c1 = new CheckingAccount(5691, 3000, new Date(), 200);

		System.out.println(a1.toString() + "\n");
		System.out.println(s1.toString() + "\n");

		s1.compoundInterest();
		System.out.println("After compounding interest once,");
		System.out.println(s1.toString() + "\n");
		System.out.println(c1.toString() + "\n");

		c1.deposit(200);
		System.out.println("\n" + c1.toString());
	}
}
