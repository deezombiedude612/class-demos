package Practical11.Activity;

public class Driver {
	public static void main(String[] args) {
		try {
			FullTimeStaff staff1 = new FullTimeStaff("Horace Diaz", "ABC123", 3, 3, 10, 3000);
			System.out.println(staff1.toString());
			System.out.printf("(Staff1) Salary: $ %.2f", staff1.calculateSalary());

			System.out.println("\n");

			PartTimeStaff staff2 = new PartTimeStaff("Ivan Lam", "XYZ787", 2, 125, 20);
			System.out.println(staff2.toString());
			System.out.println("(Staff2) Hours worked: " + staff2.getHoursWorked());
			staff2.addHoursWorked(5);
			System.out.println("(Staff2) Hours worked: " + staff2.getHoursWorked());
			System.out.printf("(Staff2) Salary: $ %.2f", staff1.calculateSalary());
		} catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("End of Staff program");
		}
	}
}
