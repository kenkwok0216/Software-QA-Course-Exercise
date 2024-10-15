package academy.teenfuture.crse;

import java.util.Scanner;

import academy.teenfuture.crse.problem_13.InvalidPasswordException;

class Problem_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Enter your password: ");
			String password = scan.nextLine();

			if (password.length() < 8) {

				throw new InvalidPasswordException("Error: the minimum length of passwords is 8");

			}

			if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {

				throw new InvalidPasswordException("Error: Password must contain at least one special character.");

			}

			System.out.println("Password is valid.");

		} catch (InvalidPasswordException e) {

			System.out.println(e.getMessage());

		} finally {

			scan.close(); // Close the scanner

		}
	}

}