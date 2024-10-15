package academy.teenfuture.crse;

import java.util.InputMismatchException;
import java.util.Scanner;

class Problem_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Input numbers: ");
			double num = scan.nextDouble();
			double abs_num = Math.abs(num);
			System.out.println("The absolute value of " + num + " is " + abs_num);

		} catch (InputMismatchException e) {

			System.out.println("Error: Please enter a valid number");

		} finally {

			scan.close();
		}

	}

}