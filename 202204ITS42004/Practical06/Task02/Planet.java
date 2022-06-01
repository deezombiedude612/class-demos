package Practical06.Task02;

public class Planet {
	private String name;
	private int travelDays;

	// no-arg constructor
	public Planet() {
		name = "Earth";
		travelDays = 365;
	}

	// overloaded constructor
	public Planet(String name, int travelDays) {
		this.name = name;
		this.travelDays = travelDays;
	}

	// get methods
	public String getName() { return name; }
	public int getTravelDays() { return travelDays; }

	// set methods
	public void setName(String name) { this.name = name; }
	public void setTravelDays(int travelDays) { this.travelDays = travelDays; }

	// prints out planet's details
	public void printPlanet() {
		System.out.println("Planet Name: " + name);
		System.out.println("Travel Days: " + travelDays);
	}

	// calculating the age on the planet
	public int calculateAge(int age) {
		int ageOnPlanet = (age * 365) / travelDays;

		return ageOnPlanet;
	}
}
