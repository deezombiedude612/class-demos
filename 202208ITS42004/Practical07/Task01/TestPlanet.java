package Practical07.Task01;

import java.util.Scanner;

public class TestPlanet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your age on Earth >> ");
		int personAge = input.nextInt();
		System.out.print("Enter the planet name >> ");
		input.nextLine();
		String planetName = input.nextLine();
		System.out.print("Enter the travel days >> ");
		int planetTravelDays = input.nextInt();

		System.out.println("-----------------------------");
		Planet p1 = new Planet(planetName, planetTravelDays);
		p1.printPlanet();
		System.out.println("Age on " + p1.getName() + ": " + p1.calculateAge(personAge));
	}
}
