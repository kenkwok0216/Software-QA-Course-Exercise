package academy.teenfuture.crse;

import java.util.Scanner;

import academy.teenfuture.crse.problem_17.InvalidEmailException;

class Problem_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Enter your email address: ");
			String email = scan.nextLine();

			// Validate the email address
			if (email == null || !email.contains("@") || !email.contains(".")) {

				throw new InvalidEmailException(
						"Error: Invalid email address. The email address must contain '@' and '.' symbol");

			}

			// Case Ignore: "@" comes before "."

			System.out.println("The email address is valid.");

		} catch (InvalidEmailException e) {

			System.out.println(e.getMessage());

		} finally {

			scan.close(); // Close the scanner

		}

	}

}