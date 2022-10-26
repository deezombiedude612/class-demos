package Practical10.Task;

public class MP3Player extends Electronics {
	private String color;

	public MP3Player(double newRegularPrice, String newManufacturer, String newColor) {
		super(newRegularPrice, newManufacturer);
		setColor(newColor);
	}

	public String getColor() { return color; }
	public void setColor(String newColor) { color = newColor; }

	// Fully implement parent class' abstract method
	public double computeSalePrice() {
		return super.getRegularPrice() * 0.9;
	}
}
