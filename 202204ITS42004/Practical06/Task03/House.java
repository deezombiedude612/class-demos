package Practical06.Task03;

import java.text.DecimalFormat;

public class House {
	private String type;
	private char zone;
	private double price;
	private int numberOfBedrooms;
	private boolean freehold;

	// no-arg constructor
	public House() {
		type = "Apartment";
		zone = 'A';
		price = 68000;
		numberOfBedrooms = 3;
		freehold = false;
	}

	// overloaded constructor #1
	public House(String type, double price, int numberOfBedrooms) {
		this.type = type;
		this.price = price;
		this.numberOfBedrooms = numberOfBedrooms;

		zone = 'A';
		freehold = false;
	}

	// overloaded constructor #2
	public House(String type, char zone, double price, int numberOfBedrooms, boolean freehold) {
		this.type = type;
		this.zone = zone;
		this.price = price;
		this.numberOfBedrooms = numberOfBedrooms;
		this.freehold = freehold;
	}

	// get methods
	public String getType() { return type; }
	public char getZone() { return zone; }
	public double getPrice() { return price; }
	public int getNumberOfBedrooms() { return numberOfBedrooms; }
	public boolean isFreehold() { return freehold; }
	// with boolean properties,
	// it becomes is<variable_name>, not get<variable_name>

	// set methods
	public void setType(String newType) { type = newType; }
	public void setZone(char newZone) { zone = newZone; }
	public void setPrice(double newPrice) { price = newPrice; }
	public void setNumberOfBedrooms(int newNumberofBedrooms) { numberOfBedrooms = newNumberofBedrooms; }
	public void setFreehold(boolean newFreehold) { freehold = newFreehold; }

	// override toString() method
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");

		String output =
				"House Type: " + type
				+ "\nHouse Zone: " + zone
				+ "\nHouse Price: " + df.format(price)
				+ "\nNumber of Bedrooms: " + numberOfBedrooms
				+ "\nFreehold: " + freehold;

		return output;
	}
}
