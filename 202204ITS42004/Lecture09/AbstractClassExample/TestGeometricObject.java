package Lecture09.AbstractClassExample;

public class TestGeometricObject {
	public static void main(String[] args) {
		GeometricObject g1 = new Circle(5);
		GeometricObject g2 = new Rectangle(5, 3);

		System.out.println("g1 Area: " + g1.getArea());
		System.out.println("g2 Area: " + g2.getArea());

		System.out.println("The two objects have the same area? "
				+ equalArea(g1, g2));

		// Display circle
		displayGeometricObject(g1);

		// Display rectangle
		displayGeometricObject(g2);

		// not allowed if GeometricObject is abstract
//		GeometricObject g3 = new GeometricObject();

//		// abstract classes can still make for Arrays or ArrayLists
//		GeometricObject[] g_arrays = new GeometricObject[3];
//		g_arrays[0] = new Circle();
//		g_arrays[1] = new Rectangle();
	}

	// A method for comparing the areas of two geometric objects
	public static boolean equalArea(GeometricObject o1, GeometricObject o2) {
		return o1.getArea() == o2.getArea();
	}

	// A method for displaying a geometric object
	public static void displayGeometricObject(GeometricObject object) {
		System.out.println();
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}
}
