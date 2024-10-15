package academy.teenfuture.crse;

import java.util.Scanner;

import academy.teenfuture.crse.problem_10.NegativeNumberException;

class Problem_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.println("Please input an interger: ");
			int num = scan.nextInt();

			if (num < 0) {
				throw new NegativeNumberException("Error: Only positive integer is allowed");
			}

			System.out.println("You entered: " + num);

		} catch (NegativeNumberException e) {

			System.out.println(e.getMessage());

		} finally {

			scan.close();

		}

	}

}