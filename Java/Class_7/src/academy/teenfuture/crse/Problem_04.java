package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Enter the integer: ");
			int num = scan.nextInt();

			if (num < 0) {
				throw new IllegalArgumentException("Error: Cannot calculate the factorial of a negative number.");
			}

			// use long to prevent overflow since n! go really fast
			// although it will overflow if num > 20
			long factorial = 1;
			for (int i = 1; i <= num; i++) {
				factorial *= i;
			}

			System.out.println("The factorial of " + num + " is " + factorial);

		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());

		} finally {

			scan.close();

		}

	}

}