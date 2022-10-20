package Practical08.Activity;

public class Driver {
	public static void main(String[] args) {
		FullTimeStaff staff1 = new FullTimeStaff("Horace Diaz", "ABC123", 3, 3, 10, 3000);
		System.out.println(staff1.toString());

		System.out.println("\n");

		PartTimeStaff staff2 = new PartTimeStaff("Ivan Lam", "XYZ787", 2, 125, 20);
		System.out.println(staff2.toString());

		System.out.println("(Staff2) Hours worked: " + staff2.getHoursWorked());
		staff2.addHoursWorked(5);
		System.out.println("(Staff2) Hours worked: " + staff2.getHoursWorked());
	}
}
