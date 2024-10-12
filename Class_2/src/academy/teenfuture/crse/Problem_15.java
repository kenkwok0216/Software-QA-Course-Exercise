package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the length of Pendulum: ");
		Double L = scan.nextDouble();

		Double period = 2 * Math.PI * Math.sqrt(L / 9.81);

		System.out.println("The area of the rectangle: " + round_decimal(period, 3));

		scan.close();
	}

	// This method is used to correct to the nearest t decimal place
	public static double round_decimal(double num, int t) {

		Double scale = Math.pow(10, t);

		return Math.round(num * scale) / scale;
	}

}