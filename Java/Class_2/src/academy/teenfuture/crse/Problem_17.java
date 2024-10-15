package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the mass of the object: ");
		Double m = scan.nextDouble();
		System.out.print("Enter the velocity: ");
		Double v = scan.nextDouble();
		System.out.print("Enter the radius: ");
		Double r = scan.nextDouble();

		Double Force = (m * v * v) / r;

		System.out.println("The area of the rectangle: " + round_decimal(Force, 3));

		scan.close();
	}

	// This method is used to correct to the nearest t decimal place
	public static double round_decimal(double num, int t) {

		Double scale = Math.pow(10, t);

		return Math.round(num * scale) / scale;
	}

}