package Practical03;

public class Task01 {
	public static void main(String[] args) {
		double tuitionFees = 10000;             // to increment by 7% each year
		final double INIT_FEES = tuitionFees;    // control variable

		int years;
//		while (tuitionFees < initFees * 2) {
//			double increment = tuitionFees * 0.07;
//			tuitionFees += increment;
//			years++;
//		}

		for (years = 1; tuitionFees < INIT_FEES * 2; years++) {
			double increment = tuitionFees * 0.07;
			tuitionFees += increment;
		}

		System.out.println("Number of years for fees to double: " + years);
	}
}
