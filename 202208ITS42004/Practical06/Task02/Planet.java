package Practical06.Task02;

public class Planet {
	String name;
	int travelDays;

	public Planet() {
		name = "Earth";
		travelDays = 365;
	}

	public Planet(String newName, int newTravelDays) {
		name = newName;
		travelDays = newTravelDays;
	}

	public void printPlanet() {
		System.out.println("Planet Name: " + name);
		System.out.println("Travel Days: " + travelDays);
	}

	public int calculateAge(int personAge) {
		return (personAge * 365) / travelDays;
	}
}
