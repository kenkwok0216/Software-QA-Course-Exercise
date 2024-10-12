package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the length of 1st side: ");
		Double a = scan.nextDouble();
		System.out.print("Enter the length of 2nd side: ");
		Double b = scan.nextDouble();
		System.out.print("Enter the length of 3rd side: ");
		Double c = scan.nextDouble();

		Double s = (a + b + c) / 2;
		Double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		System.out.println("The area of the rectangle:  " + round_decimal(area, 3));

		scan.close();
	}

	// This method is used to correct to the nearest t decimal place
	public static double round_decimal(double num, int t) {

		Double scale = Math.pow(10, t);

		return Math.round(num * scale) / scale;
	}

}