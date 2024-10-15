package academy.teenfuture.crse;

import java.util.Scanner;

import academy.teenfuture.crse.problem_14.EmptyStringException;

class Problem_14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Enter a string: ");
			String input = scan.nextLine();

			if (input.isEmpty()) {

				throw new EmptyStringException("Error: Input string is empty.");

			}

			System.out.println("Your input: " + input);

		} catch (EmptyStringException e) {

			System.out.println(e.getMessage());

		} finally {

			scan.close();

		}
	}

}