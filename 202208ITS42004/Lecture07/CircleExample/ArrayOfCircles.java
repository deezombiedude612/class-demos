package Lecture07.CircleExample;

public class ArrayOfCircles {
	public static void main(String[] args) {
		Circle[] circleArray = new Circle[10];

//		for (Circle c: circleArray) {
//			c = new Circle(1.5);
//		}

		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new Circle(i + 1);
		}

		for (Circle c: circleArray) {
			System.out.println("Radius -> " + c.getRadius());
		}
	}
}
