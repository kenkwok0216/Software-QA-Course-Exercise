package academy.teenfuture.crse;

import java.util.Scanner;

import academy.teenfuture.crse.problem_16.OverflowException;

class Problem_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Enter the first integer: ");
			int num_1 = scan.nextInt();

			System.out.print("Enter the second integer: ");
			int num_2 = scan.nextInt();

			if ((long) num_1 + (long) num_2 > Integer.MAX_VALUE || (long) num_1 + (long) num_2 < Integer.MIN_VALUE) {
				throw new OverflowException("Error: integer overlofw occur");
			}

			int sum = num_1 + num_2;

			System.out.println("The sum of " + num_1 + " and " + num_2 + " is: " + num_2);

		} catch (OverflowException e) {

			System.out.println(e.getMessage());

		} finally {

			scan.close();

		}
	}

}