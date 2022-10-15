package Lecture07.StudentCourse;

public class TestCourse {
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");

		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");

		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");

		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
//		String[] students = course1.getStudents();
//		for (int i = 0; i < course1.getNumberOfStudents(); i++)
//			System.out.print(students[i] + ", ");
		printCourseStudents(course1);
		course1.dropStudent("Kim Smith");
		printCourseStudents(course1);

		System.out.println();
		System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
		course2.clear();
		System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
	}

	public static void printCourseStudents(Course course) {
		String[] students = course.getStudents();
		for (int i = 0; i < course.getNumberOfStudents(); i++) {
			if (i < course.getNumberOfStudents() - 1) System.out.print(students[i] + ", ");
			else System.out.println(students[i]);
		}
	}
}
