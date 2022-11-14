package Practical11.Tasks;

import java.util.Scanner;

public class ChallengeTaskNoException {
	/*
	 * This program only works with prompts that separate operands (quantities)
	 * from the operators with space characters.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Input:");
		String prompt = input.nextLine();

		String[] promptSplit = prompt.split("\\s+");

		if (promptSplit.length != 3) {
			System.out.println("Wrong Input: Separate operands from operators with space characters.");
			return;
		}

		if (checkOperand(promptSplit[0]) && checkOperand(promptSplit[2]))
			calculator(promptSplit);
	}

	// Check operand without exception
	// Reference: https://github.com/LuizGsa21/intro-to-java-10th-edition/blob/master/src/Chapter_12/Exercise_01.java
	public static boolean checkOperand(String operand) {
		char[] operandArray = operand.toCharArray();

		for (int i = 0; i < operandArray.length; i++) {
			if ((operandArray[i] < '0' || operandArray[i] > '9')
					&& operandArray[0] != '+' && operandArray[0] != '-') {
				System.out.println("Wrong Input: " + operand);
				return false;
			}
		}

		return true;
	}

	// Calculate result
	public static void calculator(String[] promptArray) {
		double firstNumber = Double.parseDouble(promptArray[0]);
		double secondNumber = Double.parseDouble(promptArray[2]);

		if (promptArray[1].equals("mod"))
			promptArray[1] = "%";
		else if (promptArray[1].length() != 1) {
			System.out.println("Wrong Input: " + promptArray[1]);
			return;
		}

		char operator = promptArray[1].charAt(0);
		double result;
		switch (operator) {
			case '+' -> result = firstNumber + secondNumber;
			case '-' -> result = firstNumber - secondNumber;
			case '*' -> result = firstNumber * secondNumber;
			case '/' -> result = firstNumber / secondNumber;
			case '%' -> result = firstNumber % secondNumber;
			default -> {
				System.out.println("Wrong Input: " + operator);
				return;
			}
		}
		System.out.println("Output: " + firstNumber
				+ " " + operator
				+ " " + secondNumber
				+ " = " + result);
	}
}
