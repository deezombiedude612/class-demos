package Practical07.ChallengeTask01;

public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;

	public RegularPolygon() {
		this(3, 1, 0, 0);
	}

	public RegularPolygon(int n, double side) {
		this(n, side, 0, 0);
	}

	public RegularPolygon(int n, double side, double x, double y) {
		setN(Math.max(n, 3));
		setSide((side > 0) ? side : 1);
		setX(x);
		setY(y);
	}

	public int getN() { return n; }
	public double getSide() { return side; }
	public double getX() { return x; }
	public double getY() { return y; }

	public void setN(int n) { if (n >= 3) this.n = n; }
	public void setSide(double side) { if (side > 0) this.side = side; }
	public void setX(double x) { this.x = x; }
	public void setY(double y) { this.y = y; }

	public double getPerimeter() { return n * side; }
	public double getArea() {
		return (n * side * side) / (4 * Math.tan(Math.PI / n));
	}

	public String toString() {
		return "Number of Sides: " + this.n
				+ "\nLength of Side: " + this.side + " units"
				+ "\nCoordinates of Center: (" + this.x + ", " + this.y + ")";
	}

	public void printRegularPolygon() {
		System.out.println(this.toString());
	}
}
