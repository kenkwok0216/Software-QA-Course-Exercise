package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Enter the integer: ");
			int num_1 = scan.nextInt();

			if (num_1 < 0) {
				throw new IllegalArgumentException("Error: Cannot calculate the square root of a negative number.");
			}

			double root = Math.sqrt(num_1);
			System.out.println("The square root of " + num_1 + " is " + root);

		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());

		} finally {

			scan.close();

		}

	}

}