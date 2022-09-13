package Lecture03;

public class SwitchExample {
	public static void main(String[] args) {
		int x;
		int caseNumber = 1;

//		switch (caseNumber) {
//			case 1:
//				x = 10;
//				break;
//
//			case 2:
//				x = 20;
//				break;
//
//			default:
//				x = 30;
//		}

		switch (caseNumber) {
			case 1 -> {
				x = 10;
			}

			case 2 -> {
				x = 20;
			}

			default -> {
				x = 30;
			}
		}

		System.out.println(x);
	}
}
