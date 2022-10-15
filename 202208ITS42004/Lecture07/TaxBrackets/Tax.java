package Lecture07.TaxBrackets;

public class Tax {
	private int filingStatus;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;

//	public Tax() { }

	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		setFilingStatus(filingStatus);
		setBrackets(brackets);
		setRates(rates);
		setTaxableIncome(taxableIncome);
	}

	public int getFilingStatus() { return filingStatus; }
	public int[][] getBrackets() { return brackets; }
	public double[] getRates() { return rates; }
	public double getTaxableIncome() { return taxableIncome; }

	public void setFilingStatus(int filingStatus) {
		this.filingStatus = (filingStatus >= 0 && filingStatus <= 3) ? filingStatus : 0;
	}
	public void setBrackets(int[][] brackets) { this.brackets = brackets; }
	public void setRates(double[] rates) { this.rates = rates; }
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = (taxableIncome >= 0) ? taxableIncome : 0;
	}

	public double getTaxableAmount() {
		double taxRate = 0;

		for (int i = 0; i < brackets[filingStatus].length; i++) {
			if (taxableIncome <= brackets[filingStatus][i]) {
				taxRate = rates[i];
				break;
			} else taxRate = rates[i + 1];
		}

		System.out.println("Tax rate is " + taxRate + "%");

		return taxRate / 100 * taxableIncome;
	}
}
