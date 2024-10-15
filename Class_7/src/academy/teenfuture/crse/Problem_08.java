package academy.teenfuture.crse;

import java.util.InputMismatchException;
import java.util.Scanner;

class Problem_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Enter the first integer: ");
			int num_1 = scan.nextInt();

			System.out.print("Enter the second integer: ");
			int num_2 = scan.nextInt();

			int quotient = num_1 / num_2;

			System.out.println("The quotient of " + num_1 + " divided by " + num_2 + " is: " + quotient);

		} catch (ArithmeticException e) {

			System.out.println("Error: Division by zero is not allowed");

		} catch (InputMismatchException e) {

			System.out.println("Error: Please input an integer");

		} finally {

			System.out.println("You have execute the multiple catch blocks");
			scan.close();

		}
	}

}