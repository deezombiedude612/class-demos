package Practical07.Activity2;

public class Stock {
	// attributes/data fields/properties
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	private static int numberOfObjects = 0;

	// methods
	public Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
		numberOfObjects++;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
	}
}
