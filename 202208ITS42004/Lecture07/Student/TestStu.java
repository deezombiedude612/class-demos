package Lecture07.Student;

public class TestStu {
	public static void main(String[] args) {
		Stu s1 = new Stu("Mitt", 26, true);

		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.isScienceMajor());

		s1.setAge(20);
		System.out.println("After change, age is: " + s1.getAge());
	}
}
