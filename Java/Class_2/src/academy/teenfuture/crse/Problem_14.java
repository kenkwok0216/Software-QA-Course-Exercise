package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the side length: ");
		Double s = scan.nextDouble();

		Double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

		System.out.println("The area of the rectangle: 者娼" + round_decimal(area, 3));

		scan.close();
	}

	// This method is used to correct to the nearest t decimal place
	public static double round_decimal(double num, int t) {

		Double scale = Math.pow(10, t);

		return Math.round(num * scale) / scale;
	}

}