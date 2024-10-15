package academy.teenfuture.crse;

import java.util.InputMismatchException;
import java.util.Scanner;

class Problem_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Enter the first integer: ");
			int num_1 = scan.nextInt();

			System.out.print("Enter the second integer: ");
			int num_2 = scan.nextInt();

			int product = num_1 * num_2;

			System.out.println("The product of " + num_1 + " and " + num_2 + " is: " + product);

		} catch (InputMismatchException e) {

			System.out.println("Error: Please input an integer.");

		} finally {

			scan.close();

		}
	}

}