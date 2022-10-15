package Practical07.ChallengeTask01;

import java.text.DecimalFormat;

public class TestRegularPolygon {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");

		RegularPolygon[] rpArray = new RegularPolygon[3];
		rpArray[0] = new RegularPolygon();
		rpArray[1] = new RegularPolygon(6, 4);
		rpArray[2] = new RegularPolygon(10, 4, 5.6, 7.8);

		int count = 1;
		for (var rp: rpArray) {
			System.out.println("Regular Polygon #" + count);
			rp.printRegularPolygon();
			System.out.println("Perimeter: " + df.format(rp.getPerimeter()) + " units");
			System.out.println("Area: " + df.format(rp.getArea()) + " sq. units");

			System.out.println();
			count++;
		}
	}
}
