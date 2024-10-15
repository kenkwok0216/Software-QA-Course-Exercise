package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Input the first number: ");
		int num_1 = scan.nextInt();

		System.out.print("Input the second number: ");
		int num_2 = scan.nextInt();

		System.out.println("The required modules is " + (num_1 - num_2 * (num_1 / num_2)));

		scan.close();
	}

}