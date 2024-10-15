package academy.teenfuture.crse;

import java.util.Scanner;

import academy.teenfuture.crse.problem_18.InvalidCreditCardNumberException;

class Problem_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Enter your credit card number: ");
			String creditCardNumber = scan.nextLine();

			// Validate the credit card number
			validateCreditCard(creditCardNumber);
			System.out.println("The credit card number is valid.");

		} catch (InvalidCreditCardNumberException e) {
			System.out.println(e.getMessage());
		} finally {
			scan.close(); // Close the scanner
		}
	}

	private static void validateCreditCard(String creditCardNumber) throws InvalidCreditCardNumberException {
		if (!isValidCreditCard(creditCardNumber)) {
			throw new InvalidCreditCardNumberException("Error: Invalid credit card number.");
		}
	}

	// source: https://zh.wikipedia.org/wiki/%E5%8D%A2%E6%81%A9%E7%AE%97%E6%B3%95
	// The source code provided is weird, so I only see the algorithm only
	private static boolean isValidCreditCard(String number) {
		int sum = 0;

		// no input
		if (number == null) {
			return false;
		}

		// make number to array
		char[] numbers = number.toCharArray();
		boolean is_even = true;

		for (int i = numbers.length - 2; i >= 0; i--) {

			// return false if it is not character
			if (numbers[i] < '0' || numbers[i] > '9') {
				return false;
			}

			if (is_even) {
				int digit = Character.getNumericValue(numbers[i]);
				digit *= 2;
				// if it is 2 digit digit/10 != 0
				sum += digit / 10 + digit % 10;
				is_even = !is_even;
			} else {
				int digit = Character.getNumericValue(numbers[i]);
				sum += digit;
				is_even = !is_even;
			}

		}

		if (sum * 9 % 10 == Character.getNumericValue(numbers[numbers.length - 1])) {

			return true;

		} else {

			return false;

		}

	}

}