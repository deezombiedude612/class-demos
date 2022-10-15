package Lecture07.TaxBrackets;

import java.text.DecimalFormat;

public class TestTax {
	public final static int SINGLE_FILER = 0;
	public final static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
	public final static int MARRIED_SEPARATELY = 2;
	public final static int HEAD_OF_HOUSEHOLD = 3;

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.00");

		int[][] brackets2001 = {
				{ 27050, 65550, 136750, 297350 },
				{ 45200, 109250, 166500, 297350 },
				{ 22600, 54625, 83250, 148675 },
				{ 36250, 93650, 151650, 297350 }
		};
		double[] rates2001 = { 15, 27.5, 30.5, 35.5, 39.1 };

		int[][] brackets2009 = {
				{ 8350, 33950, 82250, 171550, 372950 },
				{ 16700, 67900, 137050, 208850, 372950 },
				{ 8350, 33950, 68525, 104425, 186475 },
				{ 11950, 45500, 117450, 191200, 372950 }
		};
		double[] rates2009 = { 10, 15, 25, 28, 33, 35 };

		Tax tax1 = new Tax(SINGLE_FILER, brackets2001, rates2001, 15000);
		System.out.println("(2001) Tax payment due is $" + df.format(tax1.getTaxableAmount()));
		Tax tax2 = new Tax(SINGLE_FILER, brackets2009, rates2009, 15000);
		System.out.println("(2009) Tax payment due is $" + df.format(tax2.getTaxableAmount()));
		Tax tax3 = new Tax(SINGLE_FILER, brackets2009, rates2009, 1e7);
		System.out.println("(2009) Tax payment due is $" + df.format(tax3.getTaxableAmount()));
	}
}
