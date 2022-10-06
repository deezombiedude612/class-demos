package Practical06.Activity2;

public class Stock {
	// attributes/data fields/properties
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	static int numberOfObjects = 0;

	// methods
	public Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
		numberOfObjects++;
	}

	public double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
	}
}
