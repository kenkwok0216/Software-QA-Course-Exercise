package academy.teenfuture.crse;

import java.util.Scanner;

import academy.teenfuture.crse.problem_11.InvalidInputException;

class Problem_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			try {

				System.out.println("Please input an interger: ");
				String input = scan.nextLine();

				int number = Integer.parseInt(input);

				System.out.println("You entered: " + number);

			} catch (NumberFormatException e) {

				throw new InvalidInputException("Error: Input must be an integer.");

			}

		} catch (InvalidInputException e) {

			System.out.println(e.getMessage());

		} finally {

			scan.close();

		}

	}

}