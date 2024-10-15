package academy.teenfuture.crse;

import java.util.InputMismatchException;
import java.util.Scanner;

class Problem_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isInput = true;

		while (isInput) {
			try {

				System.out.print("Enter a positive interger or 0 to exits: ");
				int num = scan.nextInt();

				if (num == 0) {
					break;
				}

				if (num < 0) {
					throw new IllegalArgumentException("Please input a positive integer");
				}

			} catch (InputMismatchException e) {

				System.out.println("Error: Please enter a valid number");
				continue;

			} catch (IllegalArgumentException e) {

				System.out.println(e.getMessage());
				continue;

			} finally {

				System.out.println("This always executes after each iteration.");

			}
		}

		scan.close();

	}

}