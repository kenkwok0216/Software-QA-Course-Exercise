package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the 1st num: ");
		Double num_1 = scan.nextDouble();
		System.out.print("Enter the 2nd num: ");
		Double num_2 = scan.nextDouble();
		System.out.print("Enter the 3rd num: ");
		Double num_3 = scan.nextDouble();

		System.out.println("Average of the numbers: " + round_decimal((num_1 + num_2 + num_3) / 3.0, 3));

		scan.close();
	}

	// This method is used to correct to the nearest t decimal place
	public static double round_decimal(double num, int t) {

		Double scale = Math.pow(10, t);

		return Math.round(num * scale) / scale;
	}

}