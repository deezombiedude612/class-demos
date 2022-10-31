package Lecture10.InvoiceExample;

public class PayableInterfaceTest {
	public static void main(String[] args) {
		Payable[] payableObjects = new Payable[] {
				new Invoice("01234", "seat", 2, 375.00),
				new Invoice("56789", "tire", 4, 79.95)
		};

		System.out.println("Invoices processed polymorphically:");

		// generally process each element in array payableObjects
		for (Payable currentPayable: payableObjects) {
			// output currentPayable and its appropriate payment amount
			System.out.printf("%n%s %npayment due: $%,.2f%n",
					currentPayable.toString(),  // could invoke implicitly
					currentPayable.getPaymentAmount());
		}
	}
}
