package Lecture07.CircleExample;

public class TotalArea {
	public static void main(String[] args) {
		// Declare circleArray
		Circle[] circleArray;

		// Create circleArray
		circleArray = createCircleArray();

		// Print circleArray and total areas of the circles
		printCircleArray(circleArray);
	}

	// Create an array of Circle objects
	public static Circle[] createCircleArray() {
		Circle[] circleArray = new Circle[5];

		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new Circle(Math.random() * 100);
		}

		return circleArray;
	}

	public static void printCircleArray(Circle[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
		}

		System.out.println("______________________________");

		// Compute and display the result
		System.out.printf("%-30s%-15f\n", "The total area of circles is ", sum(circleArray));
	}

	// Adds circle areas
	public static double sum(Circle[] circleArray) {
		// Initalize sum
		double sum = 0;

		// Add areas to sum
//		for (int i = 0; i < circleArray.length; i++) {
//			sum += circleArray[i].getArea();
//		}
		for (Circle c: circleArray) {
			sum += c.getArea();
		}

		return sum;
	}
}
