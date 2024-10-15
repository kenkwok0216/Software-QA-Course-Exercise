package academy.teenfuture.crse;

import java.util.InputMismatchException;
import java.util.Scanner;

class Problem_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Input numbers: ");
			double num = scan.nextDouble();
			double square_num = Math.pow(num, 2);
			System.out.println("The square root of " + num + " is " + square_num);

		} catch (InputMismatchException e) {

			System.out.println("Error: Please enter a valid number");

		} finally {

			scan.close();
		}
	}

}