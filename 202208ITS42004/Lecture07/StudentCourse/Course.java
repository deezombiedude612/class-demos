package Lecture07.StudentCourse;

public class Course {
	private final int INIT_SIZE = 2;
	private String courseName;
//	private String[] students = new String[100];
	private String[] students = new String[INIT_SIZE];
	private int numberOfStudents;

	public Course(String courseName) { this.courseName = courseName; }

	public void addStudent(String student) {
		// if students array is full, double array size (reassign it to newer array)
		if (students.length == numberOfStudents) {
			String[] newStudents = new String[students.length * 2];
			for (int i = 0; i < students.length; i++)
				newStudents[i] = students[i];
			students = newStudents;
		}

		students[numberOfStudents++] = student;
//		numberOfStudents++;
	}

	public String[] getStudents() {
		String[] currentStudents = new String[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++)
			currentStudents[i] = students[i];

		return currentStudents;
	}

	public int getNumberOfStudents() { return numberOfStudents; }
	public String getCourseName() { return courseName; }

	public void dropStudent(String student) {
		boolean studentFound = false;
		for (int i = 0; i < students.length; i++) {
			if (!studentFound) {
				if (students[i] == student) {
					System.out.println("Student found: " + student);
					studentFound = true;
					i--;
				}
			} else {
				if (i == numberOfStudents) {
					students[i] = null;
					numberOfStudents--;
				} else students[i] = students[i + 1];
			}
		}
	}

	public void clear() {
		students = new String[INIT_SIZE];
		numberOfStudents = 0;
	}
}
