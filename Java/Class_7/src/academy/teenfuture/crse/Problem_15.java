package academy.teenfuture.crse;

import java.util.InputMismatchException;
import java.util.Scanner;

import academy.teenfuture.crse.problem_15.InvalidTriangleException;

class Problem_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Enter the length of side A: ");
			double sideA = scan.nextDouble();

			System.out.print("Enter the length of side B: ");
			double sideB = scan.nextDouble();

			System.out.print("Enter the length of side C: ");
			double sideC = scan.nextDouble();

			if (sideA + sideB > sideC || sideC + sideB > sideA || sideB + sideC > sideA) {
				throw new InvalidTriangleException("Error: The lengths do not form a valid triangle.");
			}

			System.out.println("The lengths entered form a valid triangle.");

		} catch (InvalidTriangleException e) {

			System.out.println(e.getMessage());

		} catch (InputMismatchException e) {

			System.out.println("Error: Please enter valid numeric values.");

		} finally {

			scan.close(); // Close the scanner
		}

	}

}