package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the length of 1st side: ");
		Double num_1 = scan.nextDouble();
		System.out.print("Enter the length of 2nd side: ");
		Double num_2 = scan.nextDouble();

		System.out.println("The area of the rectangle:  " + round_decimal(num_1 * num_2, 3));
		System.out.println("The perimeter of the rectangle:  " + round_decimal((num_1 + num_2) * 2, 3));
		scan.close();
	}

	// This method is used to correct to the nearest t decimal place
	public static double round_decimal(double num, int t) {

		Double scale = Math.pow(10, t);

		return Math.round(num * scale) / scale;
	}

}