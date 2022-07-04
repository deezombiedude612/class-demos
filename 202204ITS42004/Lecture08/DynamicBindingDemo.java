package Lecture08;

public class DynamicBindingDemo {
	public static void main(String[] args) {
//		m(new GraduateStudent());
//		m(new Student());
//		m(new Person());
//		m(new Object());

		double d = 14.5;
		int i = (int) d;

//		Person p1 = new Person();
//		Person p2 = new Student();
//		Student s1 = new Student();
		Student s2 = (Student) new Person();
//		m(p1);
//		m(p2);
	}

	public static void m(Object x) {
		System.out.println(x.toString());
	}
}

class GraduateStudent extends Student { }

class Student extends Person {
	@Override
	public String toString() { return "Student"; }
}

class Person extends Object {
	@Override
	public String toString() { return "Person"; }
}
