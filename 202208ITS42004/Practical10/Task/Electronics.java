package Practical10.Task;

/**
 * Electronics class is now an abstract class because it does not provide
 * implementation of the computeSalePrice() abstract method.
 */
public abstract class Electronics extends Product {
	private String manufacturer;

	// Creates a new instance of Electronics
	public Electronics(double newRegularPrice, String newManufacturer) {
		super(newRegularPrice);
		manufacturer = newManufacturer;
	}

	public String getManufacturer() { return manufacturer; }

	public void setManufacturer(String newManufacturer) {
		manufacturer = newManufacturer;
	}
}
