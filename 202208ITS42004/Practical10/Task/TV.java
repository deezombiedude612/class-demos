package Practical10.Task;

public class TV extends Electronics {
	private int quantity;

	public TV(double newRegularPrice, String newManufacturer, int newQuantity) {
		super(newRegularPrice, newManufacturer);
		setQuantity(newQuantity);
	}

	public int getQuantity() { return quantity; }
	public void setQuantity(int newQuantity) { quantity = newQuantity; }

	// Fully implement parent class' abstract method
	public double computeSalePrice() {
		return super.getRegularPrice() * 0.8;
	}
}
