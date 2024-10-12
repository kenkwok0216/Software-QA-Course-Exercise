package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the 1st numbers: ");
		Double num_1 = scan.nextDouble();
		System.out.print("Enter the 2nd numbers: ");
		Double num_2 = scan.nextDouble();

		System.out.println("The largest number is " + Math.max(num_1, num_2));

		scan.close();
	}

}