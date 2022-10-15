package Lecture07.Student;

public class Stu {
	private String name;
	private int age;
	private boolean scienceMajor;

	public Stu(String newName, int newAge, boolean isScienceMajor) {
		name = newName;
		age = newAge;
		scienceMajor = isScienceMajor;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isScienceMajor() {
		return scienceMajor;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setScienceMajor() {
		scienceMajor = !scienceMajor;
	}
}
