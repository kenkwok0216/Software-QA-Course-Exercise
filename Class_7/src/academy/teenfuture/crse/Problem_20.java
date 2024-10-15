package academy.teenfuture.crse;

import java.util.Scanner;

import academy.teenfuture.crse.problem_20.InvalidPhoneNumberException;

class Problem_20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Enter a phone numbers: ");
			String ipAddress = scan.nextLine();

			// Validate the IP address
			validatePhoneNumber(ipAddress);
			System.out.println("The phone numbers is valid.");

		} catch (InvalidPhoneNumberException e) {
			System.out.println(e.getMessage());
		} finally {
			scan.close(); // Close the scanner
		}
	}

	private static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {

		if (!phoneNumber.matches("^\\d{3}\\-\\d{3}\\-\\d{4}$")) {
			throw new InvalidPhoneNumberException("Error: The phone numbers is in wrong format");
		}

	}

}