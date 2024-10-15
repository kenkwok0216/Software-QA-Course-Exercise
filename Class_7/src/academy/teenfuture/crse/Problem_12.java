package academy.teenfuture.crse;

import java.util.Scanner;

import academy.teenfuture.crse.problem_12.InvalidAgeException;

class Problem_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.println("What is your age? ");
			int age = scan.nextInt();

			if (age < 0 || age > 120) {
				throw new InvalidAgeException("Error: Age must be between 0 and 120");
			}

			System.out.println("You age: " + age);

		} catch (InvalidAgeException e) {

			System.out.println(e.getMessage());

		} finally {

			scan.close();

		}

	}

}