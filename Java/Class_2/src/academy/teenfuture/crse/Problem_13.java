package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the numbers: ");
		Double num = scan.nextDouble();

		System.out.println("The absolute value of " + num + " is " + Math.abs(num));

		scan.close();
	}

}