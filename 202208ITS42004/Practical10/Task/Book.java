package Practical10.Task;

public class Book extends Product {
	private String publisher;
	private int yearPublished;

	public Book(double newRegularPrice, String newPublisher, int newYearPublished) {
		super(newRegularPrice);
		setPublisher(newPublisher);
		setYearPublished(yearPublished);
	}

	// get methods
	public String getPublisher() { return publisher; }
	public int getYearPublished() { return yearPublished; }

	// set methods
	public void setPublisher(String newPublisher) { publisher = newPublisher; }
	public void setYearPublished(int newYearPublished) { yearPublished = newYearPublished; }

	// Fully implement parent class' abstract method
	public double computeSalePrice() {
		return super.getRegularPrice() * 0.5;
	}
}
