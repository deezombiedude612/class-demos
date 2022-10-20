package Practical08.Task;

public class TestGeometricObject {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(3, 4, 5);
		System.out.println(t1.toString());
		System.out.println("Area of t1: " + t1.getArea());
		System.out.println("Perimeter of t1: " + t1.getPerimeter());
	}
}
