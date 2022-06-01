package Practical06.Task02;

import java.util.Scanner;

public class TestPlanet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		// test the no-arg constructor
//		Planet p1 = new Planet();
//		p1.printPlanet();

//		// test the overloaded constructor
//		System.out.print("Enter the planet name: ");
//		String planetName = input.nextLine();
//		System.out.print("Enter the travel days: ");
//		int travelDays = input.nextInt();
//		Planet p2 = new Planet(planetName, travelDays);
//		System.out.println("-----------------------------");
//		p2.printPlanet();

		// trying out a different planet
		System.out.print("Enter your age on Earth: ");
		int earthAge = input.nextInt();
		input.nextLine();   // prevents the skipped input for nextLine()
		System.out.print("Enter the planet name: ");
		String planetName = input.nextLine();
		System.out.print("Enter the travel days: ");
		int travelDays = input.nextInt();
		Planet p3 = new Planet(planetName, travelDays);
		System.out.println("-----------------------------");
		p3.printPlanet();
		System.out.println("Age on " + p3.getName() + ": " + p3.calculateAge(earthAge));
	}
}
