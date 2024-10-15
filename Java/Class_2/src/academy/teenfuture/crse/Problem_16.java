package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the a: ");
		Double a = scan.nextDouble();
		System.out.print("Enter the b: ");
		Double b = scan.nextDouble();
		System.out.print("Enter the c: ");
		Double c = scan.nextDouble();

		Double vertex_x = (-b) / (2 * a);
		Double vertex_y = (4 * a * c - b * b) / (4 * a);
		System.out.println("The Vertex of y = " + a + "x^2 + " + b + "x + " + c + " is (" + round_decimal(vertex_x, 3)
				+ ", " + round_decimal(vertex_y, 3) + ")");

		Double focus_x = (-b) / (2 * a);
		Double focus_y = (4 * a * c - b * b + 1) / (4 * a);
		System.out.println("The Focus of y = " + a + "x^2 + " + b + "x + " + c + " is (" + round_decimal(focus_x, 3)
				+ ", " + round_decimal(focus_y, 3) + ")");

		Double direcrix = c - (b * b + 1) / (4 * a);
		System.out.println("The direcrix of y = " + a + "x^2 + " + b + "x + " + c + " is y = " + direcrix);

		scan.close();
	}

	// This method is used to correct to the nearest t decimal place
	public static double round_decimal(double num, int t) {

		Double scale = Math.pow(10, t);

		return Math.round(num * scale) / scale;
	}

}