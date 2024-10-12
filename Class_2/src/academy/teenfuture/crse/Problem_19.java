package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the latitude of coordinate 1: ");
		Double x_1 = scan.nextDouble();
		x_1 = x_1 * Math.PI / 180;
		System.out.print("Enter the longtitude of coordinate 2: ");
		Double y_1 = scan.nextDouble();
		y_1 = y_1 * Math.PI / 180;

		System.out.print("Enter the latitude of coordinate 2: ");
		Double x_2 = scan.nextDouble();
		x_2 = x_2 * Math.PI / 180;
		System.out.print("Enter the longtitude of coordinate 2: ");
		Double y_2 = scan.nextDouble();
		y_2 = y_2 * Math.PI / 180;

		Double r = 6371.01;

		Double t = Math.sin(x_1) * Math.sin(x_2) + Math.cos(x_1) * Math.cos(x_2) * Math.cos(y_1 - y_2);
		Double distance = r * Math.acos(t);

		System.out.println("The distance between those points is: " + round_decimal(distance, 3) + " km");

		scan.close();
	}

	// This method is used to correct to the nearest t decimal place
	public static double round_decimal(double num, int t) {

		Double scale = Math.pow(10, t);

		return Math.round(num * scale) / scale;
	}

}