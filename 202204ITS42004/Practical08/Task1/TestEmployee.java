package Practical08.Task1;

public class TestEmployee {
	public static void main(String[] args) {
		// create array of Employee objects
		Employee[] empArray = new Employee[3];

		// initialize each space with an Employee object
		// (via Employee class or subclasses)
		empArray[0] = new Employee("Joshua", 2019, 2500, 500);
		empArray[1] = new Manager("Jasmine", 2018, 4000, 1000, 200);
		empArray[2] = new Clerk("Timothy", 2017, 3000, 750, 3, 150);

		printElements(empArray);

		empArray[1].equals(empArray[2]);    // will return false
	}

	public static void printElements(Employee[] employees) {
		// using an enhanced for-loop to iterate over the array
		// emp variable is a placeholder to contain each Employee
		// object in employees array
//		for (int i = 0; i < employees.length; i++) {
//			System.out.println(employees[i].toString());
//
//		}

		for (Employee emp: employees) {
			System.out.println(emp.toString());
			System.out.printf("Salary Earned: $%.2f\n", emp.calculateSalary());

			System.out.println();
		}
	}
}
