package Lecture06.CircleClass;

public class TestCircle {
	public static void main(String[] args) {
		// create Circle objects
//		Circle circle1 = new Circle();  // creates Circle object called circle1 with default radius value
//		Circle circle2 = new Circle(25);    // creates Circle object called circle2 with radius value 25
//		Circle circle3 = new Circle(125);   // creates Circle object called circle3 with radius value 125
//
//		System.out.println("Circle 1's radius: " + circle1.radius);
//		System.out.println("Circle 2's radius: " + circle2.radius);
//		System.out.println("Circle 3's radius: " + circle3.radius);
//
//		circle1.setRadius(5);
//		System.out.println("\nCircle 1's radius is now: " + circle1.radius);
//		System.out.println("Circle 2's perimeter/circumference: " + circle2.getPerimeter());
//		System.out.println("Circle 3's area: " + circle3.getArea());
//
//		Circle circle3 = new Circle(125);   // creates Circle object called circle3 with radius value 125
//		System.out.println("Number of circles: " + Circle.numberOfObjects);
//
//		Circle circle4 = new Circle(100);
//		System.out.println("Number of circles: " + Circle.numberOfObjects);

		/*
		* For static variables, you do not need to instantiate objects to use them.
		* They are like control variables that are typically insignificant to the object itself.
		*/

//		System.out.println("Circle 3's radius: " + circle3.getRadius());
//		circle3.setRadius(50);
//		System.out.println("Circle 3's radius: " + circle3.getRadius());
//		circle3.setRadius(-50);
//		System.out.println("Circle 4's radius: " + circle4.radius);
//
//		circle3 = circle4;  // making a shallow copy
//		System.out.println("\nAfter change..");
//		System.out.println("Circle 3's radius: " + circle3.radius);
//		System.out.println("Circle 4's radius: " + circle4.radius);
//
//		System.out.println("\nChanging circle4's radius to 50..");
//		circle4.setRadius(50);
//		System.out.println("Circle 3's radius: " + circle3.radius);
//		System.out.println("Circle 4's radius: " + circle4.radius);

		Circle[] circleArray = new Circle[10];
		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new Circle();
		}
	}
}
