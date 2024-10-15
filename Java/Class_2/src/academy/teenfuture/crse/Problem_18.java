package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of sides on the polygon: ");
		int n = scan.nextInt();
		System.out.print("Enter the length of one of the sides: ");
		Double s = scan.nextDouble();

		Double Area = (n * s * s) / (4 * Math.tan(Math.PI / n));

		System.out.println("The area of the required polygon: " + round_decimal(Area, 3));

		scan.close();
	}

	// This method is used to correct to the nearest t decimal place
	public static double round_decimal(double num, int t) {

		Double scale = Math.pow(10, t);

		return Math.round(num * scale) / scale;
	}

}