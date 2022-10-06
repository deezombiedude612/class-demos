package Lecture06.CircleExample;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("Number of Circle objects (from c1): " + c1.numberOfObjects);
		Circle c2 = new Circle(2);
		System.out.println("Number of Circle objects (from c1): " + c1.numberOfObjects);
		System.out.println("Number of Circle objects (from c2): " + c2.numberOfObjects);


		System.out.println("\nCIRCLE 1");
		System.out.println("Radius: " + c1.radius);
		System.out.println("Area: " + c1.getArea());
		System.out.println("Circumference: " + c1.getCircumference());

		System.out.println("\nCIRCLE 2");
		System.out.println("Radius: " + c2.radius);
		System.out.println("Area: " + c2.getArea());
		System.out.println("Circumference: " + c2.getCircumference());

//		c2.setRadius(5);
		c2.radius = 5;      // should be illegal

		System.out.println("\nCIRCLE 2 AFTER EDIT");
		System.out.println("Radius: " + c2.radius);
		System.out.println("Area: " + c2.getArea());
		System.out.println("Circumference: " + c2.getCircumference());
	}
}
