package Practical07.ChallengeTask02;

import java.text.DecimalFormat;

public class Cake {
	private int flavorKey;
	private int weight;
	private int quantity;

	public Cake(int flavorKey, int weight, int quantity) {
		setFlavorKey((flavorKey >= 1 && flavorKey <= 5) ? flavorKey : 1);
		setWeight((weight > 0) ? weight : 1);
		setQuantity((quantity > 0) ? quantity : 1);
	}

	public int getFlavorKey() { return flavorKey; }
	public int getWeight() { return weight; }
	public int getQuantity() { return quantity; }

	public void setFlavorKey(int flavorKey) { if (flavorKey >= 1 && flavorKey <= 5) this.flavorKey = flavorKey; }
	public void setWeight(int weight) { if (weight > 0) this.weight = weight; }
	public void setQuantity(int quantity) { if (quantity > 0) this.quantity = quantity; }

	public String getFlavor() {
		switch (this.flavorKey) {
			case 1 -> { return "Chocolate Moist"; }
			case 2 -> { return "Strawberry"; }
			case 3 -> { return "Blueberry"; }
			case 4 -> { return "Cheesy Cake"; }
			case 5 -> { return "American Chocolate"; }
			default -> { return ""; }
		}
	}

	public double getCakePrice() {
		switch (this.weight) {
			case 1 -> { return 25.5; }
			case 2 -> { return 50; }
			case 3 -> { return 75; }
			default -> { return 0; }
		}
	}

	public double getTotalPrice() { return getCakePrice() * quantity; }

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return "Flavor: " + getFlavor()
				+ "\nWeight: " + weight + "(kg)"
				+ "\nQuantity: " + quantity
				+ "\nPrice: RM" + df.format(getTotalPrice());
	}
}
