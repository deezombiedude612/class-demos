package Practical07.Task02;

import java.text.DecimalFormat;

public class House {
	private String type;
	private char zone;
	private double price;
	private int numberOfBedrooms;
	private boolean freehold;

	private DecimalFormat df = new DecimalFormat("#,###.00");

	public House() {
		type = "Apartment";
		zone = 'A';
		price = 68000.00;
		numberOfBedrooms = 3;
		freehold = false;
	}

	public House(String type, char zone, double price) {
		this.type = type;
		this.zone = zone;
		this.price = price;
		numberOfBedrooms = 3;
		freehold = false;
	}

	public House(String type, char zone, double price, int numberOfBedrooms, boolean freehold) {
		this.type = type;
		this.zone = zone;
		this.price = price;
		this.numberOfBedrooms = numberOfBedrooms;
		this.freehold = freehold;
	}

	public String getType() { return type; }
	public void setType(String type) { this.type = type; }
	public char getZone() { return zone; }
	public void setZone(char zone) { this.zone = zone; }
	public double getPrice() { return price; }
	public void setPrice(double price) { this.price = price; }
	public int getNumberOfBedrooms() { return numberOfBedrooms; }
	public void setNumberOfBedrooms(int numberOfBedrooms) { this.numberOfBedrooms = numberOfBedrooms; }
	public boolean isFreehold() { return freehold; }
	public void setFreehold(boolean freehold) { this.freehold = freehold; }

	public String toString() {
		String output = "Type: " + type;
		output += "\nZone: " + zone;
		output += "\nPrice: $" + df.format(price);
		output += "\nNumber of Bedrooms: " + numberOfBedrooms;
		output += "\nIs freehold?: " + freehold;
		output += "\n";

		return output;
	}
}
