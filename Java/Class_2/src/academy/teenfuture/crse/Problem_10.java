package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the numbers: ");
		Double num_1 = scan.nextDouble();

		System.out.println("The result after round off:  " + Math.round(num_1));

		scan.close();
	}

}