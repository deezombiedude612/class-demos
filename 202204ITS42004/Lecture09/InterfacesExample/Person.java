package Lecture09.InterfacesExample;

public class Person implements ChefSkills, WaiterSkills {
	private String name;

	public Person() {
		this.name = "";
	}
	public Person(String name) {
		this.name = name;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public void cook() {
		System.out.println("Chef is cooking..");
	}

	public void taste() {
		System.out.println("Chef is tasting..");
	}

	public void takeOrders() {
		System.out.println("Taking orders..");
	}

	public void deliverFood() {
		System.out.println("Delivering food to table..");
	}
}
